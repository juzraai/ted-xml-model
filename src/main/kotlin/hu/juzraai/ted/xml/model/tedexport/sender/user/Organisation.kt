package hu.juzraai.ted.xml.model.tedexport.sender.user

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.DefinedOnlyIn
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of ORGANISATION element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "ORGANISATION")
data class Organisation(
		@field:Element(name = "OFFICIALNAME")
		@field:Compatible(TedXmlSchemaVersion.R208, TedXmlSchemaVersion.R209)
		@field:DefinedOnlyIn(TedXmlSchemaVersion.R208)
		var officialName: String = "",

		@field:Element(name = "NATIONALID", required = false)
		@field:Compatible(TedXmlSchemaVersion.R208, TedXmlSchemaVersion.R209)
		@field:DefinedOnlyIn(TedXmlSchemaVersion.R208)
		val nationalId: String = ""
)