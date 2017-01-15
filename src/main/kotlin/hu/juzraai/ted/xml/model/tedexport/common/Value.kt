package hu.juzraai.ted.xml.model.tedexport.common

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Text
import java.math.BigDecimal

/**
 * Model of VALUE element.
 *
 * @author Zsolt Jurányi
 */
data class Value(
		@field:Text var value: BigDecimal = BigDecimal.ZERO,

		@field:Attribute(name = "CURRENCY") var currency: Currency = Currency._NOT_AVAILABLE,
		@field:Attribute(name = "TYPE") var type: ValueType = ValueType._NOT_AVAILABLE
)