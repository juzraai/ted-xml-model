package hu.juzraai.ted.xml.model.test

import hu.juzraai.ted.xml.model.TedExport
import hu.juzraai.ted.xml.model.meta.consistency.Consistency
import org.junit.Test

/**
 * @author Zsolt Jurányi
 */
class ConsistencyTest {

	@Test
	fun consistencyTest() {
		val r = Consistency().check(TedExport::class.java)
		Consistency().printReport(r)
		// TODO fail if warn count > 0 ?
	}
}