
package me.moree.wsdl.holidayservice_v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HolidayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HolidayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Notable"/>
 *     &lt;enumeration value="Religious"/>
 *     &lt;enumeration value="NotableReligious"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HolidayType")
@XmlEnum
public enum HolidayType {

    @XmlEnumValue("Notable")
    NOTABLE("Notable"),
    @XmlEnumValue("Religious")
    RELIGIOUS("Religious"),
    @XmlEnumValue("NotableReligious")
    NOTABLE_RELIGIOUS("NotableReligious"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    HolidayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HolidayType fromValue(String v) {
        for (HolidayType c: HolidayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
