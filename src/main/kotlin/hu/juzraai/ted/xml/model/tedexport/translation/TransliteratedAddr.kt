package hu.juzraai.ted.xml.model.tedexport.translation

import hu.juzraai.ted.xml.model.common.ContactContractingBody
import org.simpleframework.xml.Root

/**
 * Model of TRANSLITERATED_ADDR element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "TRANSLITERATED_ADDR", strict = false)
class TransliteratedAddr : ContactContractingBody()