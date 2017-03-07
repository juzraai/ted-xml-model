package hu.juzraai.ted.xml.model.tedexport.sender

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.DefinedOnlyIn
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of IDENTIFICATION element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "IDENTIFICATION")
data class Identification(
		@field:Element(name = "ESENDER_LOGIN")
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R209)
		var esenderlogin: String = "",

		@field:Element(name = "CUSTOMER_LOGIN", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R209)
		var customerlogin: String = "",

		@field:Element(name = "NO_DOC_EXT")
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R209)
		var nodocext: String = "",

		@field:Element(name = "SOFTWARE_VERSION", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R209)
		var softwareversion: String = ""
)