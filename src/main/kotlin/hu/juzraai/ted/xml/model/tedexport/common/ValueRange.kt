package hu.juzraai.ted.xml.model.tedexport.common

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import java.math.BigDecimal

/**
 * Model of VALUE_RANGE element.
 *
 * @author Zsolt Jurányi
 */
data class ValueRange(
		@field:Attribute(name = "CURRENCY") var currency: Currency = Currency._NOT_AVAILABLE,
		@field:Attribute(name = "TYPE") var type: ValueType = ValueType._NOT_AVAILABLE,

		@field:Element(name = "LOW") var low: BigDecimal = BigDecimal.ZERO,
		@field:Element(name = "HIGH") var high: BigDecimal = BigDecimal.ZERO
)