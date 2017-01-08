package hu.juzraai.ted.xml.model.tedexport.sender

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
		var esenderlogin: String = "",

		@field:Element(name = "CUSTOMER_LOGIN", required = false)
		var customerlogin: String = "",

		@field:Element(name = "NO_DOC_EXT")
		var nodocext: String = "",

		@field:Element(name = "SOFTWARE_VERSION", required = false)
		var softwareversion: String = ""
)