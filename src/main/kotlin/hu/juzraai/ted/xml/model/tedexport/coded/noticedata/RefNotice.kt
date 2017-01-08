package hu.juzraai.ted.xml.model.tedexport.coded.noticedata

import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

/**
 * Model of REF_NOTICE element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "REF_NOTICE")
data class RefNotice(
		@field:ElementList(inline = true, entry = "NO_DOC_OJS")
		val noDocOjs: List<String> = mutableListOf<String>()
)