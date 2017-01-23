package hu.juzraai.ted.xml.model.tedexport.sender

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.DefinedOnlyIn
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import hu.juzraai.ted.xml.model.tedexport.sender.user.Organisation
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
		val country: String = "",
		// TODO
		/*
		<xs:element name="COUNTRY" minOccurs="0">
			<xs:complexType>
				<xs:attribute name="VALUE" type="t_country_list_eu_union" use="required"/>
			</xs:complexType>
		</xs:element>

		<xs:simpleType name="t_country_list_eu_union">
			<xs:union memberTypes="t_country_list eu"/>
		</xs:simpleType>
		 */

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
		val userEmails: List<UserEmail> = mutableListOf<UserEmail>(), // TODO

		@field:Element(name = "URL", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		val url: String = ""
)
/*




<xs:complexType name="user_email">
	<xs:simpleContent>
		<xs:extension base="email"> string
			<xs:attribute name="TYPE">
				<xs:annotation>
					<xs:documentation>Allowed attributes for email element</xs:documentation>
				</xs:annotation>
				<xs:simpleType>
					<xs:restriction base="xs:string">
						<xs:enumeration value="FUNCTIONAL"/>
						<xs:enumeration value="TECHNICAL"/>
						<xs:enumeration value="CONTENT"/>
						<xs:enumeration value="RESPONSIBLE"/>
						<xs:enumeration value="COORDINATION"/>
					</xs:restriction>
				</xs:simpleType>
			</xs:attribute>
		</xs:extension>
	</xs:simpleContent>
</xs:complexType>
	 */
