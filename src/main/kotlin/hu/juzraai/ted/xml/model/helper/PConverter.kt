package hu.juzraai.ted.xml.model.helper

import hu.juzraai.ted.xml.model.common.Ft
import hu.juzraai.ted.xml.model.common.FtType
import hu.juzraai.ted.xml.model.common.P
import org.simpleframework.xml.convert.Converter
import org.simpleframework.xml.stream.InputNode
import org.simpleframework.xml.stream.OutputNode

/**
 * Custom parser for P elements.
 *
 * @author Zsolt Jurányi
 */
class PConverter : Converter<P> {

	fun addPNodeText(pNode: InputNode, values: MutableList<Any>) {
		val t = text(pNode)
		if (!t.isEmpty()) values.add(t)
	}

	fun parseFt(ftNode: InputNode): Ft = Ft(text(ftNode), FtType.valueOf(ftNode.getAttribute("TYPE")?.value.toString()))

	override fun read(pNode: InputNode?): P {
		if (pNode == null) return P()
		val values = mutableListOf<Any>()
		addPNodeText(pNode, values)
		var ftNode = pNode.next
		while (ftNode != null) {
			values.add(parseFt(ftNode))
			addPNodeText(pNode, values)
			ftNode = pNode.next
		}
		return P(values)
	}

	fun text(n: InputNode): String = n.value?.trim() ?: ""

	override fun write(n: OutputNode?, e: P?) {
		throw UnsupportedOperationException("not implemented")
	}
}