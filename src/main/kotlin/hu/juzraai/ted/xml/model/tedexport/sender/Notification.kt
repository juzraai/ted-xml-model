package hu.juzraai.ted.xml.model.tedexport.sender

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
		var technical: ToBeInformed = ToBeInformed(),

		@field:Element(name = "PUBLICATION")
		var publication: YesNo = YesNo._NOT_AVAILABLE
)