package hu.juzraai.ted.xml.model.common

import hu.juzraai.ted.xml.model.tedexport.coded.noticedata.Nuts
import org.simpleframework.xml.Element

/**
 * @author Zsolt Jurányi
 */
open class ContactContractingBody(
		@field:Element(name = "ADDRESS", required = false)
		var address: String = "",

		@field:Element(name = "TOWN")
		var town: String = "",

		@field:Element(name = "POSTAL_CODE", required = false)
		var postalcode: String = "",

		@field:Element(name = "COUNTRY")
		var country: Country = Country(),

		@field:Element(name = "CONTACT_POINT", required = false)
		var contactpoint: String = "",

		@field:Element(name = "PHONE", required = false)
		var phone: String = "",

		@field:Element(name = "E_MAIL")
		var email: String = "",

		@field:Element(name = "FAX", required = false)
		var fax: String = "",

		@field:Element(name = "NUTS")
		var nuts: Nuts = Nuts(),

		@field:Element(name = "URL_GENERAL")
		var urlgeneral: String = "",

		@field:Element(name = "URL_BUYER", required = false)
		var urlbuyer: String = ""
) : OrgIdNew() {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is ContactContractingBody) return false

		if (!super.equals(other)) return false

		if (address != other.address) return false
		
		if (town != other.town) return false
		if (postalcode != other.postalcode) return false
		if (country != other.country) return false
		if (contactpoint != other.contactpoint) return false
		if (phone != other.phone) return false
		if (email != other.email) return false
		if (fax != other.fax) return false
		if (nuts != other.nuts) return false
		if (urlgeneral != other.urlgeneral) return false
		if (urlbuyer != other.urlbuyer) return false

		return true
	}

	override fun hashCode(): Int {
		var result = address.hashCode()
		result = 31 * result + town.hashCode()
		result = 31 * result + postalcode.hashCode()
		result = 31 * result + country.hashCode()
		result = 31 * result + contactpoint.hashCode()
		result = 31 * result + phone.hashCode()
		result = 31 * result + email.hashCode()
		result = 31 * result + fax.hashCode()
		result = 31 * result + nuts.hashCode()
		result = 31 * result + urlgeneral.hashCode()
		result = 31 * result + urlbuyer.hashCode()

		result = 31 * result + super.hashCode()

		return result
	}
}