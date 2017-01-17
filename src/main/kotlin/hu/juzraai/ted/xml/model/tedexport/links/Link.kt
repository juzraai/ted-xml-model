package hu.juzraai.ted.xml.model.tedexport.links

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.Root

@Root
data class Link(
		@field:Attribute(name = "type")
		@field:Namespace(prefix = "xlink", reference = "http://www.w3.org/1999/xlink")
		@field:Compatible(R208, R209)
		var type: String = "",

		@field:Attribute(name = "href")
		@field:Namespace(prefix = "xlink", reference = "http://www.w3.org/1999/xlink")
		@field:Compatible(R208, R209)
		var href: String = "",

		@field:Attribute(name = "title", required = false)
		@field:Namespace(prefix = "xlink", reference = "http://www.w3.org/1999/xlink")
		@field:Compatible(R208, R209)
		var title: String = ""
)