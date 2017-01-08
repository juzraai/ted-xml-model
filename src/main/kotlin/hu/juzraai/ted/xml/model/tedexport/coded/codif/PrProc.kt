package hu.juzraai.ted.xml.model.tedexport.coded.codif

import hu.juzraai.ted.xml.model.helper.HasTextAndRequiredCode
import org.simpleframework.xml.Root

/**
 * Model of PR_PROC element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "PR_PROC")
class PrProc : HasTextAndRequiredCode()