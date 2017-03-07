package hu.juzraai.ted.xml.model.tedexport.sender.user

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Root
import org.simpleframework.xml.Text

/**
 * Model of USER_E_MAIL element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "USER_E_MAIL")
data class UserEmail (
		@field:Text var value: String = "",

		@field:Attribute(name = "TYPE") var code: String = "" // TODO

/*
<xs:restriction base="xs:string">
						<xs:enumeration value="FUNCTIONAL"/>
						<xs:enumeration value="TECHNICAL"/>
						<xs:enumeration value="CONTENT"/>
						<xs:enumeration value="RESPONSIBLE"/>
						<xs:enumeration value="COORDINATION"/>
					</xs:restriction>
 */
)