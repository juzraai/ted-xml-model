package hu.juzraai.ted.xml.model.tedexport

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.DefinedOnlyIn
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import hu.juzraai.ted.xml.model.tedexport.sender.*
import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of SENDER element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "SENDER")
data class Sender(
		@field:Attribute(name = "PUBLICATION", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R209)
		var publication: YesNo = YesNo._NOT_AVAILABLE,

		@field:Element(name = "IDENTIFICATION", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R209)
		var identification: Identification = Identification(),

		@field:Element(name = "CONTACT", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R209)
		var contact: Contact = Contact(),

		@field:Element(name = "NOTIFICATION", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R209)
		var notification: Notification = Notification(),

		@field:Element(name = "LOGIN", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var login: Login = Login(),

		@field:Element(name = "USER", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var user: User = User(),

		@field:Element(name = "NO_DOC_EXT", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var noDocExt: String = ""
)