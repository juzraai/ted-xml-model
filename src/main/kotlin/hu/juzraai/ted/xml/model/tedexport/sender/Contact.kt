package hu.juzraai.ted.xml.model.tedexport.sender

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.DefinedOnlyIn
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import hu.juzraai.ted.xml.model.tedexport.common.Country
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of CONTACT element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "CONTACT")
data class Contact(
		@field:Element(name = "ORGANISATION")
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var organisation: String = "",

		@field:Element(name = "COUNTRY")
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var country: Country = Country(), // TODO consistency check fails?

		@field:Element(name = "PHONE", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var phone: String = "",

		@field:Element(name = "E_MAIL")
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var email: String = ""
)