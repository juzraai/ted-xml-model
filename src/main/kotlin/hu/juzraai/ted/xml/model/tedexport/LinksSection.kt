package hu.juzraai.ted.xml.model.tedexport

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import hu.juzraai.ted.xml.model.tedexport.links.Link
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "LINKS_SECTION")
data class LinksSection(
		@field:Element(name = "XML_SCHEMA_DEFINITION_LINK")
		@field:Compatible(R208, R209)
		var xmlSchemaDefinitionLink: Link = Link(),

		@field:Element(name = "OFFICIAL_FORMS_LINK")
		@field:Compatible(R208, R209)
		var officialFormsLink: Link = Link(),

		@field:Element(name = "FORMS_LABELS_LINK")
		@field:Compatible(R208, R209)
		var formsLabelsLink: Link = Link(),

		@field:Element(name = "ORIGINAL_CPV_LINK")
		@field:Compatible(R208, R209)
		var originalCpvLink: Link = Link(),

		@field:Element(name = "ORIGINAL_NUTS_LINK")
		@field:Compatible(R208, R209)
		var originalNutsLink: Link = Link()
)