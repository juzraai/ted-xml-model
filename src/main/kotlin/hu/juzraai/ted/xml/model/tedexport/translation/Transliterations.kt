package hu.juzraai.ted.xml.model.tedexport.translation

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of TRANSLITERATIONS element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "TRANSLITERATIONS")
data class Transliterations(
		@field:Element(name = "TRANSLITERATED_ADDR")
		var transliteratedAddr: TransliteratedAddr = TransliteratedAddr()
)