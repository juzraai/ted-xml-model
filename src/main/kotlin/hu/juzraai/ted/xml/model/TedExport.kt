package hu.juzraai.ted.xml.model

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.DefinedOnlyIn
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import hu.juzraai.ted.xml.model.tedexport.*
import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of TED_EXPORT element which is the root element of TED-XMLs and represents a notice.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "TED_EXPORT", strict = false)
data class TedExport(
		@field:Attribute(name = "DOC_ID")
		@field:Compatible(R208, R209)
		var docId: String = "",

		@field:Attribute(name = "EDITION")
		@field:Compatible(R208, R209)
		var edition: String = "",

		@field:Attribute(name = "VERSION", required = false)
		@field:Compatible(R208, R209) @field:DefinedOnlyIn(R209)
		var version: String = "",

		@field:Element(name = "TECHNICAL_SECTION")
		@field:Compatible(R208, R209)
		var technicalSection: TechnicalSection = TechnicalSection(),

		@field:Element(name = "LINKS_SECTION")
		@field:Compatible(R208, R209)
		var linksSection: LinksSection = LinksSection(),

		@field:Element(name = "SENDER", required = false)
		var sender: Sender = Sender(),

		@field:Element(name = "CODED_DATA_SECTION")
		var codedDataSection: CodedDataSection = CodedDataSection(),

		@field:Element(name = "TRANSLATION_SECTION")
		var translationSection: TranslationSection = TranslationSection(),

		@field:Element(name = "FORM_SECTION")
		var formSection: FormSection = FormSection()
)
