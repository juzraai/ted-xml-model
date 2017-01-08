package hu.juzraai.ted.xml.model.tedexport.coded.noticedata

import hu.juzraai.ted.xml.model.helper.HasTextAndOptionalCode
import org.simpleframework.xml.Root

/**
 * Model of ORIGINAL_CPV element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "ORIGINAL_CPV")
class OriginalCpv : HasTextAndOptionalCode()