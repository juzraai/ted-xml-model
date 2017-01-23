package hu.juzraai.ted.xml.model.tedexport.sender.notification

import hu.juzraai.ted.xml.model.tedexport.common.YesNo
import org.simpleframework.xml.Attribute

/**
 * @author Zsolt Jurányi
 */
data class ToBeInformed(
		@field:Attribute(name = "ESENDER")
		var esender: YesNo = YesNo._NOT_AVAILABLE,
		@field:Attribute(name = "CONTRACTING_BODY", required = false)
		var contractingbody: YesNo = YesNo._NOT_AVAILABLE
)