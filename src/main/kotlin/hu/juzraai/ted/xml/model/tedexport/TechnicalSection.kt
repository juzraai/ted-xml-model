package hu.juzraai.ted.xml.model.tedexport

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of TECHNICAL_SECTION element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "TECHNICAL_SECTION")
data class TechnicalSection(
		@field:Element(name = "RECEPTION_ID")
		var receptionId: String = "",

		@field:Element(name = "DELETION_DATE")
		var deletionDate: String = "",

		@field:Element(name = "FORM_LG_LIST")
		var formLgList: String = "",

		@field:Element(name = "COMMENTS", required = false)
		var comments: String = "", // TODO in R2.0.8 it has type "btx" instead of string

		@field:Element(name = "OLD_HEADING", required = false)
		var oldHeading: String = "" // R2.0.8
)