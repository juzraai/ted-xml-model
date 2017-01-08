package hu.juzraai.ted.xml.model.tedexport.coded.noticedata

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Root
import org.simpleframework.xml.Text

/**
 * Model of URI_DOC element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "URI_DOC")
data class UriDoc(
		@field:Text var value: String = "",

		@field:Attribute(name = "LG", required = false)
		var lg: CeLanguage = CeLanguage._NOT_AVAILABLE
)