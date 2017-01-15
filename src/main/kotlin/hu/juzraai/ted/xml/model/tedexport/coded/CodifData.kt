package hu.juzraai.ted.xml.model.tedexport.coded

import hu.juzraai.ted.xml.model.tedexport.coded.codif.*
import hu.juzraai.ted.xml.model.tedexport.common.Values
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

/**
 * Model of CODIF_DATA element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "CODIF_DATA")
data class CodifData(
		@field:Element(name = "DS_DATE_DISPATCH")
		var dsDateDispatch: String = "",

		@field:Element(name = "DD_DATE_REQUEST_DOCUMENT", required = false)
		var ddDateRequestDocument: String = "",

		@field:Element(name = "DT_DATE_FOR_SUBMISSION", required = false)
		var dtDateForSubmission: String = "",

		@field:Element(name = "AA_AUTHORITY_TYPE")
		var aaAuthorityType: AaAuthorityType = AaAuthorityType(),

		@field:Element(name = "TD_DOCUMENT_TYPE")
		var tdDocumentType: TdDocumentType = TdDocumentType(),

		@field:Element(name = "NC_CONTRACT_NATURE")
		var ncContractNature: NcContractNature = NcContractNature(),

		@field:Element(name = "PR_PROC")
		var prProc: PrProc = PrProc(),

		@field:Element(name = "RP_REGULATION")
		var rpRegulation: RpRegulation = RpRegulation(),

		@field:Element(name = "TY_TYPE_BID")
		var tyTypeBid: TyTypeBid = TyTypeBid(),

		@field:Element(name = "AC_AWARD_CRIT")
		var acAwardCrit: AcAwardCrit = AcAwardCrit(),

		@field:ElementList(inline = true, entry = "MA_MAIN_ACTIVITIES", required = false)
		var maMainActivities: List<MaMainActivities> = mutableListOf<MaMainActivities>(),

		@field:Element(name = "HEADING", required = false)
		var heading: String = "",

		@field:Element(name = "INITIATOR")
		var initiator: String = "",

		@field:Element(name = "DIRECTIVE", required = false)
		var directive: Directive = Directive(),

		@field:Element(name = "VALUES", required = false)
		var values: Values = Values()
)