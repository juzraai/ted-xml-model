package hu.juzraai.ted.xml.model.meta.consistency

import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion

/**
 * @author Zsolt Jurányi
 */
data class Report(
		val compatible: List<TedXmlSchemaVersion>,
		val improperAnnotations: List<Warning>,
		val suggestedAnnotations: List<Warning>,
		val missingAnnotations: List<Warning>
)