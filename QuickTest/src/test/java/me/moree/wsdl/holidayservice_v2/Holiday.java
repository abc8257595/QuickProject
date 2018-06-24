
package me.moree.wsdl.holidayservice_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Holiday complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Holiday">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://www.holidaywebservice.com/HolidayService_v2/}Country"/>
 *         &lt;element name="HolidayCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HolidayType" type="{http://www.holidaywebservice.com/HolidayService_v2/}HolidayType"/>
 *         &lt;element name="DateType" type="{http://www.holidaywebservice.com/HolidayService_v2/}HolidayDateType"/>
 *         &lt;element name="BankHoliday" type="{http://www.holidaywebservice.com/HolidayService_v2/}BankHoliday"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RelatedHolidayCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicableRegions" type="{http://www.holidaywebservice.com/HolidayService_v2/}ArrayOfRegionCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Holiday", propOrder = {
    "country",
    "holidayCode",
    "descriptor",
    "holidayType",
    "dateType",
    "bankHoliday",
    "date",
    "relatedHolidayCode",
    "applicableRegions"
})
public class Holiday {

    @XmlElement(name = "Country", required = true)
    @XmlSchemaType(name = "string")
    protected Country country;
    @XmlElement(name = "HolidayCode")
    protected String holidayCode;
    @XmlElement(name = "Descriptor")
    protected String descriptor;
    @XmlElement(name = "HolidayType", required = true)
    @XmlSchemaType(name = "string")
    protected HolidayType holidayType;
    @XmlElement(name = "DateType", required = true)
    @XmlSchemaType(name = "string")
    protected HolidayDateType dateType;
    @XmlElement(name = "BankHoliday", required = true)
    @XmlSchemaType(name = "string")
    protected BankHoliday bankHoliday;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "RelatedHolidayCode")
    protected String relatedHolidayCode;
    @XmlElement(name = "ApplicableRegions")
    protected ArrayOfRegionCode applicableRegions;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the holidayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolidayCode() {
        return holidayCode;
    }

    /**
     * Sets the value of the holidayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolidayCode(String value) {
        this.holidayCode = value;
    }

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptor(String value) {
        this.descriptor = value;
    }

    /**
     * Gets the value of the holidayType property.
     * 
     * @return
     *     possible object is
     *     {@link HolidayType }
     *     
     */
    public HolidayType getHolidayType() {
        return holidayType;
    }

    /**
     * Sets the value of the holidayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HolidayType }
     *     
     */
    public void setHolidayType(HolidayType value) {
        this.holidayType = value;
    }

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link HolidayDateType }
     *     
     */
    public HolidayDateType getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HolidayDateType }
     *     
     */
    public void setDateType(HolidayDateType value) {
        this.dateType = value;
    }

    /**
     * Gets the value of the bankHoliday property.
     * 
     * @return
     *     possible object is
     *     {@link BankHoliday }
     *     
     */
    public BankHoliday getBankHoliday() {
        return bankHoliday;
    }

    /**
     * Sets the value of the bankHoliday property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankHoliday }
     *     
     */
    public void setBankHoliday(BankHoliday value) {
        this.bankHoliday = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the relatedHolidayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedHolidayCode() {
        return relatedHolidayCode;
    }

    /**
     * Sets the value of the relatedHolidayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedHolidayCode(String value) {
        this.relatedHolidayCode = value;
    }

    /**
     * Gets the value of the applicableRegions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRegionCode }
     *     
     */
    public ArrayOfRegionCode getApplicableRegions() {
        return applicableRegions;
    }

    /**
     * Sets the value of the applicableRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRegionCode }
     *     
     */
    public void setApplicableRegions(ArrayOfRegionCode value) {
        this.applicableRegions = value;
    }

}
