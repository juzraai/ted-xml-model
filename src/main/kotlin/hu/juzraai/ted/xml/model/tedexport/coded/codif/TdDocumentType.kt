package hu.juzraai.ted.xml.model.tedexport.coded.codif

import hu.juzraai.ted.xml.model.helper.HasTextAndRequiredCode
import org.simpleframework.xml.Root

/**
 * Model of TD_DOCUMENT_TYPE element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "TD_DOCUMENT_TYPE")
class TdDocumentType : HasTextAndRequiredCode()