package hu.juzraai.ted.xml.model.helper

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Text

/**
 * @author Zsolt Jurányi
 */
abstract class HasTextAndOptionalCode(
		@field:Text var value: String = "",

		@field:Attribute(name = "CODE", required = false) var code: String = ""
) {

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is HasTextAndOptionalCode) return false

		if (value != other.value) return false
		if (code != other.code) return false

		return true
	}

	override fun hashCode(): Int {
		var result = value.hashCode()
		result = 31 * result + code.hashCode()
		return result
	}

	override fun toString(): String {
		return "${this.javaClass.simpleName}(value='$value', code='$code')"
	}
}