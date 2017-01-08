package hu.juzraai.ted.xml.model

import hu.juzraai.ted.xml.model.tedexport.CodedDataSection
import hu.juzraai.ted.xml.model.tedexport.LinksSection
import hu.juzraai.ted.xml.model.tedexport.Sender
import hu.juzraai.ted.xml.model.tedexport.TechnicalSection
import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of TED_EXPORT element which is the root element of TED-XMLs and represents a notice.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "TED_EXPORT", strict = false) // TODO turn on strict when done
data class TedExport(
		@field:Attribute(name = "DOC_ID") var docId: String = "",
		@field:Attribute(name = "EDITION") var edition: String = "",
		@field:Attribute(name = "VERSION") var version: String = "",

		@field:Element(name = "TECHNICAL_SECTION")
		var technicalSection: TechnicalSection = TechnicalSection(),

		@field:Element(name = "LINKS_SECTION")
		var linksSection: LinksSection = LinksSection(),

		@field:Element(name = "SENDER", required = false)
		var sender: Sender = Sender(),

		@field:Element(name = "CODED_DATA_SECTION")
		var codedDataSection: CodedDataSection = CodedDataSection()

		//@field:Element(name = "TRANSLATION_SECTION")
		//var translationSection: TranslationSection = TranslationSection(),

		//@field:Element(name = "FORM_SECTION")
		//var formSection: FormSection = FormSection()
)
