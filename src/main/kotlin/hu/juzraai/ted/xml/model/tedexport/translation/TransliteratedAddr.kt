package hu.juzraai.ted.xml.model.tedexport.translation

import hu.juzraai.ted.xml.model.tedexport.common.ContactContractingBody
import org.simpleframework.xml.Root

/**
 * Model of TRANSLITERATED_ADDR element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "TRANSLITERATED_ADDR", strict = false)
class TransliteratedAddr : ContactContractingBody() {

	override fun equals(other: Any?): Boolean {
		return super.equals(other) && (other !is TransliteratedAddr)
	}

	override fun hashCode(): Int {
		return super.hashCode()
	}

	override fun toString(): String {
		return "TransliteratedAddr() ${super.toString()}"
	}
}