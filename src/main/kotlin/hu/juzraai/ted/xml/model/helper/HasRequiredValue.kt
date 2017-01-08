package hu.juzraai.ted.xml.model.helper

import org.simpleframework.xml.Attribute

/**
 * @author Zsolt Jurányi
 */
abstract class HasRequiredValue(
		@field:Attribute(name = "VALUE") var value: String = ""
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