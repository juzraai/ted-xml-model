package hu.juzraai.ted.xml.model.meta

/**
 * Indicates that the annotated field is compatible
 * with the specified versions of the TED XML Schema.
 *
 * This annotation is only a guide for development,
 * does not used by the parser in any way.
 *
 * All fields should be annotated with @Compatible.
 * Schema version X must present only if the field's
 * XML related annotations are compatible and all of
 * its subfields are compatible too.
 *
 * @author Zsolt Jurányi
 */
@Target(AnnotationTarget.FIELD)
annotation class Compatible(
		vararg val value: TedXmlSchemaVersion
)