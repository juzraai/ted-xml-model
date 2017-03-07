package hu.juzraai.ted.xml.model.tedexport.sender

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.DefinedOnlyIn
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import hu.juzraai.ted.xml.model.tedexport.common.YesNo
import hu.juzraai.ted.xml.model.tedexport.sender.notification.ToBeInformed
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of NOTIFICATION element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "NOTIFICATION")
data class Notification(
		@field:Element(name = "TECHNICAL")
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R209)
		var technical: ToBeInformed = ToBeInformed(),

		@field:Element(name = "PUBLICATION")
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R209)
		var publication: YesNo = YesNo._NOT_AVAILABLE
)