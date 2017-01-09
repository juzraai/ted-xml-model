package hu.juzraai.ted.xml.model.tedexport.translation

import hu.juzraai.ted.xml.model.common.TextFtSingleLine
import hu.juzraai.ted.xml.model.tedexport.coded.noticedata.CeLanguage
import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * @author Zsolt Jurányi
 */
@Root(name = "ML_TI_DOC")
data class MlTiDoc(
		@field:Attribute(name = "LG")
		var lg: CeLanguage = CeLanguage._NOT_AVAILABLE,

		@field:Element(name = "TI_CY")
		var tiCy: String = "",

		@field:Element(name = "TI_TOWN")
		var tiTown: String = "",

		@field:Element(name = "TI_TEXT")
		var tiText: TextFtSingleLine = TextFtSingleLine()
)