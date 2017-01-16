package hu.juzraai.ted.xml.model.meta.consistency

import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion

data class Warning(
		val clazz: String,
		val field: String,
		val version: TedXmlSchemaVersion,
		val annotated: Boolean,
		val shouldBeAnnotated: Boolean
)