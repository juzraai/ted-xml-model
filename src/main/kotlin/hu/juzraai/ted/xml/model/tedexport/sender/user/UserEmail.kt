package hu.juzraai.ted.xml.model.tedexport.sender.user

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.DefinedOnlyIn
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Root
import org.simpleframework.xml.Text

/**
 * Model of USER_E_MAIL element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "USER_E_MAIL")
data class UserEmail(
		@field:Text var value: String = "",

		@field:Attribute(name = "TYPE")
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var type: UserEmailType = UserEmailType._NOT_AVAILABLE
)