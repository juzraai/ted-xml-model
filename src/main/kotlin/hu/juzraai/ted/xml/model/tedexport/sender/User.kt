package hu.juzraai.ted.xml.model.tedexport.sender

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.DefinedOnlyIn
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import hu.juzraai.ted.xml.model.tedexport.common.Country
import hu.juzraai.ted.xml.model.tedexport.sender.user.Organisation
import hu.juzraai.ted.xml.model.tedexport.sender.user.UserEmail
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

/**
 * Model of USER element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "USER")
data class User(
		@field:Element(name = "ORGANISATION", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var organisation: Organisation = Organisation(),

		@field:Element(name = "ATTENTION", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		val attention: String = "",

		@field:Element(name = "ADDRESS", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		val address: String = "",

		@field:Element(name = "POSTAL_CODE", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		val postalCode: String = "",

		@field:Element(name = "TOWN", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		val town: String = "",

		@field:Element(name = "COUNTRY", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		val country: Country = Country(),

		@field:Element(name = "PHONE", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		val phone: String = "",

		@field:Element(name = "FAX", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		val fax: String = "",

		@field:ElementList(name = "USER_E_MAILS", entry = "USER_E_MAIL", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		val userEmails: List<UserEmail> = mutableListOf<UserEmail>(),

		@field:Element(name = "URL", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		val url: String = ""
)
