package hu.juzraai.ted.xml.model.tedexport.sender

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.DefinedOnlyIn
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import hu.juzraai.ted.xml.model.tedexport.sender.login.LoginClass
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of LOGIN element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "LOGIN")
data class Login(
		@field:Element(name = "ESENDER_LOGIN")
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var esenderLogin: String = "",

		@field:Element(name = "CUSTOMER_LOGIN", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var customerLogin: String = "",

		@field:Element(name = "CLASS")
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var loginClass: LoginClass = LoginClass._NOT_AVAILABLE
)