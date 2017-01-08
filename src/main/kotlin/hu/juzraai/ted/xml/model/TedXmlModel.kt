package hu.juzraai.ted.xml.model

import org.simpleframework.xml.core.Persister
import java.io.File
import java.io.InputStream

/**
 * @author Zsolt Jurányi
 */
class TedXmlModel {

	companion object {
		fun parse(inputStream: InputStream): TedExport {
			return Persister().read(TedExport::class.java, inputStream)
		}

		fun parse(file: File): TedExport {
			return Persister().read(TedExport::class.java, file)
		}

		fun parse(resourceName: String): TedExport {
			val input: InputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(resourceName)
			return parse(input)
		}
	}
}