package hu.juzraai.ted.xml.model.tedexport

import hu.juzraai.ted.xml.model.tedexport.links.Link
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "LINKS_SECTION")
data class LinksSection(
		@field:Element(name = "XML_SCHEMA_DEFINITION_LINK")
		var xmlschemadefinitionlink: Link = Link(),

		@field:Element(name = "OFFICIAL_FORMS_LINK")
		var officialformslink: Link = Link(),

		@field:Element(name = "FORMS_LABELS_LINK")
		var formslabelslink: Link = Link(),

		@field:Element(name = "ORIGINAL_CPV_LINK")
		var originalcpvlink: Link = Link(),

		@field:Element(name = "ORIGINAL_NUTS_LINK")
		var originalnutslink: Link = Link()
)