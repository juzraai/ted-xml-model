package hu.juzraai.ted.xml.model.tedexport.translation

import hu.juzraai.ted.xml.model.tedexport.coded.noticedata.CeLanguage
import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Root
import org.simpleframework.xml.Text

/**
 * Model of AA_NAME element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "AA_NAME")
class AaName(
		@field:Text var value: String = "",

		@field:Attribute(name = "LG") var lg: CeLanguage = CeLanguage._NOT_AVAILABLE
)