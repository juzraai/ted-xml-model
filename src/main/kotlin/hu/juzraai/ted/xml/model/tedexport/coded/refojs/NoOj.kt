package hu.juzraai.ted.xml.model.tedexport.coded.refojs

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Root
import org.simpleframework.xml.Text

/**
 * Model of NO_OJ element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "NO_OJ")
data class NoOj(
		@field:Text var value: String = "",

		@field:Attribute(name = "CLASS", required = false) var clazz: String = "",
		@field:Attribute(name = "LAST", required = false) var last: String = ""
)