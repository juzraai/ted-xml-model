package hu.juzraai.ted.xml.model.tedexport

import hu.juzraai.ted.xml.model.tedexport.sender.Contact
import hu.juzraai.ted.xml.model.tedexport.sender.Identification
import hu.juzraai.ted.xml.model.tedexport.sender.Notification
import hu.juzraai.ted.xml.model.tedexport.sender.YesNo
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
		@field:Attribute(name = "PUBLICATION")
		var publication: YesNo = YesNo._NOT_AVAILABLE,

		@field:Element(name = "IDENTIFICATION")
		var identification: Identification = Identification(),

		@field:Element(name = "CONTACT")
		var contact: Contact = Contact(),

		@field:Element(name = "NOTIFICATION", required = false)
		var notification: Notification = Notification()

		// TODO R208 has other fields
)