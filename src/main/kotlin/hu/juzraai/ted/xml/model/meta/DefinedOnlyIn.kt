package hu.juzraai.ted.xml.model.meta

/**
 * Indicates that the annotated field represents an XML
 * attribute/element that is only defined in the specified
 * TED XML Schema versions.
 *
 * This annotation is only a guide for development,
 * does not used by the parser in any way.
 *
 * @DefinedOnlyIn annotation of a field can be omitted
 * if the represented attribute/element is defined in
 * all existing schema versions.
 *
 * @author Zsolt Jurányi
 */
@Target(AnnotationTarget.FIELD)
annotation class DefinedOnlyIn(
		vararg val value: TedXmlSchemaVersion
)