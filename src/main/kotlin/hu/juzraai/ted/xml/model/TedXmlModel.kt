package hu.juzraai.ted.xml.model

import org.simpleframework.xml.core.Persister
import java.io.File
import java.io.InputStream

/**
 * @author Zsolt Jurányi
 */
class TedXmlModel {

	// TODO maybe we can add a CLASS/FIELD annotation which tells schema compatibility as self documenting
	// TODO + it can advise setting compatibility if all members are compatible
	// TODO + it can also verify annotations, e.g. if some member is incompatible, parent must be also
	// TODO e.g. @Compatible(value=TedXmlSchemaVersionEnum[])

	companion object {
		fun parse(inputStream: InputStream): TedExport = Persister().read(TedExport::class.java, inputStream)

		fun parse(file: File): TedExport = Persister().read(TedExport::class.java, file)

		fun parse(resourceName: String): TedExport = parse(ClassLoader.getSystemClassLoader().getResourceAsStream(resourceName))
	}
}