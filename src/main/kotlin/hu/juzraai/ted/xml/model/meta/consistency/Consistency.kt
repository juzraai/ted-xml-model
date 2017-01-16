package hu.juzraai.ted.xml.model.meta.consistency

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion
import java.lang.reflect.Field

/**
 * @author Zsolt Jurányi
 */
class Consistency {

	fun check(c: Class<*>) {
		var warnings = mutableListOf<Warning>()
		checkImpl(null, null, c, warnings)

		// TODO generate report: 1) improper annotations, 2) ann suggestions, 3) missing annotations
	}

	private fun checkImpl(root: Class<*>?, field: Field?, examinedClass: Class<*>, warnings: MutableList<Warning>): List<TedXmlSchemaVersion> {

		// gather real version compatibility for each field
		val children = mutableListOf<List<TedXmlSchemaVersion>>()
		examinedClass.declaredFields.forEach {
			val fieldType = it.type
			if (fieldType.name.startsWith("hu.juzraai.ted.xml.model") && !fieldType.isEnum) {
				children.add(checkImpl(examinedClass, it, fieldType, warnings))
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
			val annotatedVersions = field.getAnnotation(Compatible::class.java)?.value

			// detect improper annotations
			annotatedVersions?.forEach {
				if (!realVersions.contains(it)) warnings.add(Warning(root.name, field.name, it, true, false))
			}

			// TODO the other way: real version, if not annotated -> WARN

			// TODO if not warned yet, and no annotation -> WARN (missing)
		}

		return realVersions
	}

}