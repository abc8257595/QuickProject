
package me.moree.wsdl.holidayservice_v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Country.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Country">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Canada"/>
 *     &lt;enumeration value="GreatBritain"/>
 *     &lt;enumeration value="IrelandNorthern"/>
 *     &lt;enumeration value="IrelandRepublicOf"/>
 *     &lt;enumeration value="Scotland"/>
 *     &lt;enumeration value="UnitedStates"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Country")
@XmlEnum
public enum Country {

    @XmlEnumValue("Canada")
    CANADA("Canada"),
    @XmlEnumValue("GreatBritain")
    GREAT_BRITAIN("GreatBritain"),
    @XmlEnumValue("IrelandNorthern")
    IRELAND_NORTHERN("IrelandNorthern"),
    @XmlEnumValue("IrelandRepublicOf")
    IRELAND_REPUBLIC_OF("IrelandRepublicOf"),
    @XmlEnumValue("Scotland")
    SCOTLAND("Scotland"),
    @XmlEnumValue("UnitedStates")
    UNITED_STATES("UnitedStates");
    private final String value;

    Country(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Country fromValue(String v) {
        for (Country c: Country.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
