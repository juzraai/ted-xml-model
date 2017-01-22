package hu.juzraai.ted.xml.model.tedexport

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.DefinedOnlyIn
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R208
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion.R209
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Model of TECHNICAL_SECTION element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "TECHNICAL_SECTION")
data class TechnicalSection(
		@field:Element(name = "RECEPTION_ID")
		@field:Compatible(R208, R209)
		var receptionId: String = "",

		@field:Element(name = "DELETION_DATE")
		@field:Compatible(R208, R209)
		var deletionDate: String = "",

		@field:Element(name = "FORM_LG_LIST")
		@field:Compatible(R208, R209)
		var formLgList: String = "",

		@field:Element(name = "COMMENTS", required = false)
		@field:Compatible(R209)
		var comments: String = "", // TODO in R2.0.8 it has type "btx" instead of string
		/*
		<xs:complexType name="btx" mixed="true">
			<xs:choice minOccurs="0" maxOccurs="unbounded">
				<xs:element ref="FT"/>
				<xs:element ref="P"/>
			</xs:choice>
		</xs:complexType>
		 */

		@field:Element(name = "OLD_HEADING", required = false)
		@field:Compatible(R208, R209)
		@field:DefinedOnlyIn(R208)
		var oldHeading: String = "" // R2.0.8
)