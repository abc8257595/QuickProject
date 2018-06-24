
package me.moree.wsdl.holidayservice_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetHolidaysAvailableResult" type="{http://www.holidaywebservice.com/HolidayService_v2/}ArrayOfHolidayCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getHolidaysAvailableResult"
})
@XmlRootElement(name = "GetHolidaysAvailableResponse")
public class GetHolidaysAvailableResponse {

    @XmlElement(name = "GetHolidaysAvailableResult")
    protected ArrayOfHolidayCode getHolidaysAvailableResult;

    /**
     * Gets the value of the getHolidaysAvailableResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHolidayCode }
     *     
     */
    public ArrayOfHolidayCode getGetHolidaysAvailableResult() {
        return getHolidaysAvailableResult;
    }

    /**
     * Sets the value of the getHolidaysAvailableResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHolidayCode }
     *     
     */
    public void setGetHolidaysAvailableResult(ArrayOfHolidayCode value) {
        this.getHolidaysAvailableResult = value;
    }

}
