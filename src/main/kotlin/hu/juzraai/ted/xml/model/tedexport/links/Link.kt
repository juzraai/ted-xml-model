package hu.juzraai.ted.xml.model.tedexport.links

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.Root

@Root
data class Link(
		@field:Attribute(name = "type")
		@field:Namespace(prefix = "xlink", reference = "http://www.w3.org/1999/xlink")
		var type: String = "",

		@field:Attribute(name = "href")
		@field:Namespace(prefix = "xlink", reference = "http://www.w3.org/1999/xlink")
		var href: String = "",

		@field:Attribute(name = "title", required = false)
		@field:Namespace(prefix = "xlink", reference = "http://www.w3.org/1999/xlink")
		var title: String = ""
)