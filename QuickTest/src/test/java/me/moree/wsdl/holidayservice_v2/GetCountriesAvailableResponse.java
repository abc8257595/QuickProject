
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
 *         &lt;element name="GetCountriesAvailableResult" type="{http://www.holidaywebservice.com/HolidayService_v2/}ArrayOfCountryCode" minOccurs="0"/>
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
    "getCountriesAvailableResult"
})
@XmlRootElement(name = "GetCountriesAvailableResponse")
public class GetCountriesAvailableResponse {

    @XmlElement(name = "GetCountriesAvailableResult")
    protected ArrayOfCountryCode getCountriesAvailableResult;

    /**
     * Gets the value of the getCountriesAvailableResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountryCode }
     *     
     */
    public ArrayOfCountryCode getGetCountriesAvailableResult() {
        return getCountriesAvailableResult;
    }

    /**
     * Sets the value of the getCountriesAvailableResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountryCode }
     *     
     */
    public void setGetCountriesAvailableResult(ArrayOfCountryCode value) {
        this.getCountriesAvailableResult = value;
    }

}
