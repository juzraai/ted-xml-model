package hu.juzraai.ted.xml.model.tedexport.coded

import hu.juzraai.ted.xml.model.tedexport.coded.refojs.NoOj
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of REF_OJS element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "REF_OJS")
data class RefOjs(
		@field:Element(name = "COLL_OJ")
		var collOj: String = "",

		@field:Element(name = "NO_OJ")
		var noOj: NoOj = NoOj(),

		@field:Element(name = "DATE_PUB")
		var datePub: String = ""
)