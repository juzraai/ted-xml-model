package hu.juzraai.ted.xml.model.tedexport.common

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Root
import org.simpleframework.xml.Text

/**
 * Model of FT element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "FT")
data class Ft(
		@field:Text var value: String = "",

		@field:Attribute(name = "TYPE") var type: FtType = FtType._NOT_AVAILABLE

		// TODO in R208 its an extension of "btx"
)