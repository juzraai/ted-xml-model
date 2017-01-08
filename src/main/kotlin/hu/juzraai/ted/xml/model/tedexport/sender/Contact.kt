package hu.juzraai.ted.xml.model.tedexport.sender

import hu.juzraai.ted.xml.model.common.Country
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
		var organisation: String = "",

		@field:Element(name = "COUNTRY")
		var country: Country = Country(),

		@field:Element(name = "PHONE", required = false)
		var phone: String = "",

		@field:Element(name = "E_MAIL")
		var email: String = ""
)