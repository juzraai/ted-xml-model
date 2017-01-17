package hu.juzraai.ted.xml.model.meta.consistency

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion
import java.lang.reflect.Field
import kotlin.comparisons.compareBy

/**
 * @author Zsolt Jurányi
 */
class Consistency {

	fun check(c: Class<*>): Report {
		val rawWarnings = mutableListOf<Warning>()
		val compatible = checkImpl(null, null, c, rawWarnings)
		var warnings = rawWarnings.distinct().sortedWith(compareBy({ it.clazz }, { it.field }, { it.version.toString() }))

		val improperAnnotations = warnings.filter { it.annotated && !it.shouldBeAnnotated }
		val suggestedAnnotations = warnings.filter { !it.annotated && it.shouldBeAnnotated && null != it.version }
		val missingAnnotations = warnings.filter { !it.annotated && it.shouldBeAnnotated && null == it.version }
		return Report(compatible, improperAnnotations, suggestedAnnotations, missingAnnotations)
	}

	private fun checkImpl(root: Class<*>?, field: Field?, examinedClass: Class<*>, warnings: MutableList<Warning>): List<TedXmlSchemaVersion> {

		// gather real version compatibility for each field
		val children = mutableListOf<List<TedXmlSchemaVersion>>()
		examinedClass.declaredFields.forEach {
			val enum = it.type.isEnum
			val model = it.type.name.startsWith("hu.juzraai.ted.xml.model")
			if (!enum && (model)) {
				// go deep in model types
				children.add(checkImpl(examinedClass, it, it.type, warnings))
			} else {
				// examine only annotation of primitives
				val a = it.getAnnotation(Compatible::class.java)
				children.add(a?.value?.asList() ?: listOf<TedXmlSchemaVersion>())
			}
		}

		// count versions
		val cVersions = mutableMapOf<TedXmlSchemaVersion, Int>()
		for (list in children) {
			for (ver in list) {
				if (null == cVersions[ver]) cVersions.put(ver, 1) else cVersions[ver] = cVersions[ver]!! + 1
			}
		}

		// real version is which all fields are compatible with
		val realVersions = mutableListOf<TedXmlSchemaVersion>()
		cVersions.keys.forEach { if (cVersions[it] == children.size) realVersions.add(it) }

		// generate warnings for the examined field
		if (null != root && null != field) {
			val a = field.getAnnotation(Compatible::class.java)
			val av = a?.value?.asList() ?: listOf<TedXmlSchemaVersion>()

			// suggest annotations
			var w = false
			realVersions.filter { !av.contains(it) }.forEach {
				w = true
				warnings.add(Warning(root.name, field.name, it, false, true))
			}

			if (null == a) {
				// detect missing annotations
				if (!w) warnings.add(Warning(root.name, field.name, null, false, true))
			} else {
				// detect improper annotations
				av.filter { !realVersions.contains(it) }.forEach {
					warnings.add(Warning(root.name, field.name, it, true, false))
				}
			}
		}
		return realVersions
	}

	private fun preparePrinting(buffer: StringBuffer, warnings: List<Warning>, header: String, template: (Warning) -> String) {
		if (!warnings.isEmpty()) {
			buffer.appendln("$header (${warnings.size}):")
			warnings.forEach { buffer.appendln(template(it)) }
			buffer.appendln()
		}
	}

	fun printReport(r: Report) {
		val s = StringBuffer()
		preparePrinting(s, r.improperAnnotations, "Improper annotations") {
			"\t${it.clazz}.${it.field} is NOT compatible with ${it.version}"
		}
		preparePrinting(s, r.suggestedAnnotations, "Suggested annotations") {
			"\t${it.clazz}.${it.field} is compatible with ${it.version}"
		}
		preparePrinting(s, r.missingAnnotations, "Missing annotations") {
			"\t${it.clazz}.${it.field} has no @Compatible annotation (and couldn't suggest versions)"
		}
		println(s)
	}
}