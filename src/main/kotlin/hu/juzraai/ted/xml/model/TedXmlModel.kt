package hu.juzraai.ted.xml.model

import org.simpleframework.xml.convert.AnnotationStrategy
import org.simpleframework.xml.core.Persister
import java.io.File
import java.io.InputStream

/**
 * @author Zsolt Jurányi
 */
class TedXmlModel {

	companion object {
		@JvmStatic fun parse(inputStream: InputStream): TedExport = persister().read(TedExport::class.java, inputStream)

		@JvmStatic fun parse(file: File): TedExport = persister().read(TedExport::class.java, file)

		@JvmStatic fun parse(resourceName: String): TedExport = parse(ClassLoader.getSystemClassLoader().getResourceAsStream(resourceName))

		private fun persister(): Persister = Persister(AnnotationStrategy())
	}
}