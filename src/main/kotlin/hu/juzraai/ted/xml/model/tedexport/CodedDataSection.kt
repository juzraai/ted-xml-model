package hu.juzraai.ted.xml.model.tedexport

import hu.juzraai.ted.xml.model.tedexport.coded.CodifData
import hu.juzraai.ted.xml.model.tedexport.coded.NoticeData
import hu.juzraai.ted.xml.model.tedexport.coded.RefOjs
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of CODED_DATA_SECTION element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "CODED_DATA_SECTION")
data class CodedDataSection(
		@field:Element(name = "REF_OJS")
		var refOjs: RefOjs = RefOjs(),

		@field:Element(name = "NOTICE_DATA")
		var noticeData: NoticeData = NoticeData(),

		@field:Element(name = "CODIF_DATA")
		var codifData: CodifData = CodifData()
)