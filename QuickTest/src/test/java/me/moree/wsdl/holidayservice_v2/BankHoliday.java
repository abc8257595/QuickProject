
package me.moree.wsdl.holidayservice_v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankHoliday.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankHoliday">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Recognized"/>
 *     &lt;enumeration value="NotRecognized"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BankHoliday")
@XmlEnum
public enum BankHoliday {

    @XmlEnumValue("Recognized")
    RECOGNIZED("Recognized"),
    @XmlEnumValue("NotRecognized")
    NOT_RECOGNIZED("NotRecognized");
    private final String value;

    BankHoliday(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankHoliday fromValue(String v) {
        for (BankHoliday c: BankHoliday.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
