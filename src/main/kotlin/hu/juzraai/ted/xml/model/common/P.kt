package hu.juzraai.ted.xml.model.common

import hu.juzraai.ted.xml.model.helper.PConverter
import org.simpleframework.xml.Root
import org.simpleframework.xml.convert.Convert

/**
 * Model of P element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "P")
@Convert(PConverter::class)
data class P(
		var values: List<Any> = mutableListOf() // String or Ft
)