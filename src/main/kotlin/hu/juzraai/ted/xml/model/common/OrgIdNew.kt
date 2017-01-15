package hu.juzraai.ted.xml.model.common

import org.simpleframework.xml.Element

/**
 * @author Zsolt Jurányi
 */
open class OrgIdNew(
		@field:Element(name = "OFFICIALNAME")
		var officialname: String = "",

		@field:Element(name = "NATIONALID", required = false)
		var nationalid: String = ""
) {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is OrgIdNew) return false

		if (officialname != other.officialname) return false
		if (nationalid != other.nationalid) return false

		return true
	}

	override fun hashCode(): Int {
		var result = officialname.hashCode()
		result = 31 * result + nationalid.hashCode()
		return result
	}

	override fun toString(): String {
		return "OrgIdNew(officialname='$officialname', nationalid='$nationalid')"
	}
}