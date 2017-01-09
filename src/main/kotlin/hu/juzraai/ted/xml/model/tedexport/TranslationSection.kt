package hu.juzraai.ted.xml.model.tedexport

import hu.juzraai.ted.xml.model.tedexport.translation.AaName
import hu.juzraai.ted.xml.model.tedexport.translation.MlTiDoc
import hu.juzraai.ted.xml.model.tedexport.translation.Transliterations
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

/**
 * Model of TRANSLATION_SECTION element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "TRANSLATION_SECTION")
data class TranslationSection(
		@field:ElementList(name = "ML_TITLES", entry = "ML_TI_DOC")
		var mlTitles: List<MlTiDoc> = mutableListOf<MlTiDoc>(),

		@field:ElementList(name = "ML_AA_NAMES", entry = "AA_NAME")
		var mlAaNames: List<AaName> = mutableListOf<AaName>(),

		@field:Element(name = "TRANSLITERATIONS", required = false)
		var transliterations: Transliterations = Transliterations()
)