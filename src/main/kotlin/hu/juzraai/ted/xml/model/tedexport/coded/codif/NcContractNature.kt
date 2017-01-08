package hu.juzraai.ted.xml.model.tedexport.coded.codif

import hu.juzraai.ted.xml.model.helper.HasTextAndRequiredCode
import org.simpleframework.xml.Root

/**
 * Model of NC_CONTRACT_NATURE element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "NC_CONTRACT_NATURE")
class NcContractNature : HasTextAndRequiredCode()