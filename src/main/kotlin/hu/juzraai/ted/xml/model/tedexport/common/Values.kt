package hu.juzraai.ted.xml.model.tedexport.common

import org.simpleframework.xml.ElementList
import org.simpleframework.xml.ElementListUnion
import org.simpleframework.xml.Root

/**
 * Model of VALUES element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "VALUES")
data class Values(
		@field:ElementListUnion(
				ElementList(entry = "VALUE", inline = true, type = Value::class, required = false),
				ElementList(entry = "VALUE_RANGE", inline = true, type = ValueRange::class, required = false)
		)
		var values: List<ValueOrValueRange> = mutableListOf<ValueOrValueRange>()
)