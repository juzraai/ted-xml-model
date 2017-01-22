package hu.juzraai.ted.xml.model.tedexport.sender

/**
 * Model of USER element.
 *
 * @author Zsolt Jurányi
 */
class User {

	/*
			<xs:element name="USER" minOccurs="0">
				<xs:complexType>
					<xs:sequence>
						<xs:element ref="ORGANISATION" minOccurs="0"/> class
						<xs:element ref="ATTENTION" minOccurs="0"/> string
						<xs:element ref="ADDRESS" minOccurs="0"/> string
						<xs:element ref="POSTAL_CODE" minOccurs="0"/> string
						<xs:element ref="TOWN" minOccurs="0"/> string
						<xs:element name="COUNTRY" minOccurs="0">
							<xs:complexType>
								<xs:attribute name="VALUE" type="t_country_list_eu_union" use="required"/>
							</xs:complexType>
						</xs:element>
						<xs:element ref="PHONE" minOccurs="0"/> string
						<xs:element ref="FAX" minOccurs="0"/> string
						<xs:element ref="USER_E_MAILS" minOccurs="0"/> list
						<xs:element ref="URL" minOccurs="0"/> string
					</xs:sequence>
				</xs:complexType>
			</xs:element>

	<xs:element name="ORGANISATION">
		<xs:complexType>
			<xs:sequence>
				<xs:element ref="OFFICIALNAME"/> string
				<xs:element ref="NATIONALID" minOccurs="0"/> string
			</xs:sequence>
		</xs:complexType>
	</xs:element>

	<xs:element name="USER_E_MAIL" type="user_email"/>
	<xs:complexType name="user_emails">
		<xs:sequence>
			<xs:element ref="USER_E_MAIL" maxOccurs="unbounded"/>
		</xs:sequence>
	</xs:complexType>

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
}