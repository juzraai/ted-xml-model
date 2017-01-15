package hu.juzraai.ted.xml.model.tedexport.common

import org.simpleframework.xml.Element

/**
 * @author Zsolt Jurányi
 */
data class TextFtSingleLine(
		@field:Element(name = "P") var p: P = P()
)