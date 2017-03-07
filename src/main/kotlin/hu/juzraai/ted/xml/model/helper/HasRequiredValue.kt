package hu.juzraai.ted.xml.model.helper

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.DefinedOnlyIn
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import org.simpleframework.xml.Attribute

/**
 * @author Zsolt Jurányi
 */
abstract class HasRequiredValue(
		@field:Attribute(name = "VALUE")
		@field:Compatible(R208, R209)
		var value: String = ""
) {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is HasRequiredValue) return false

		if (value != other.value) return false

		return true
	}

	override fun hashCode(): Int {
		return value.hashCode()
	}

	override fun toString(): String {
		return "${this.javaClass.simpleName}(value='$value')"
	}
}