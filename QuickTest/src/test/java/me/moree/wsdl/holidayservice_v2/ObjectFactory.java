
package me.moree.wsdl.holidayservice_v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the me.moree.wsdl.holidayservice_v2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfHoliday_QNAME = new QName("http://www.holidaywebservice.com/HolidayService_v2/", "ArrayOfHoliday");
    private final static QName _ArrayOfCountryCode_QNAME = new QName("http://www.holidaywebservice.com/HolidayService_v2/", "ArrayOfCountryCode");
    private final static QName _ArrayOfHolidayCode_QNAME = new QName("http://www.holidaywebservice.com/HolidayService_v2/", "ArrayOfHolidayCode");
    private final static QName _DateTime_QNAME = new QName("http://www.holidaywebservice.com/HolidayService_v2/", "dateTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: me.moree.wsdl.holidayservice_v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfHolidayCode }
     * 
     */
    public ArrayOfHolidayCode createArrayOfHolidayCode() {
        return new ArrayOfHolidayCode();
    }

    /**
     * Create an instance of {@link ArrayOfCountryCode }
     * 
     */
    public ArrayOfCountryCode createArrayOfCountryCode() {
        return new ArrayOfCountryCode();
    }

    /**
     * Create an instance of {@link GetHolidayDate }
     * 
     */
    public GetHolidayDate createGetHolidayDate() {
        return new GetHolidayDate();
    }

    /**
     * Create an instance of {@link GetHolidaysForMonth }
     * 
     */
    public GetHolidaysForMonth createGetHolidaysForMonth() {
        return new GetHolidaysForMonth();
    }

    /**
     * Create an instance of {@link GetCountriesAvailable }
     * 
     */
    public GetCountriesAvailable createGetCountriesAvailable() {
        return new GetCountriesAvailable();
    }

    /**
     * Create an instance of {@link GetHolidaysForMonthResponse }
     * 
     */
    public GetHolidaysForMonthResponse createGetHolidaysForMonthResponse() {
        return new GetHolidaysForMonthResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHoliday }
     * 
     */
    public ArrayOfHoliday createArrayOfHoliday() {
        return new ArrayOfHoliday();
    }

    /**
     * Create an instance of {@link GetHolidaysForDateRangeResponse }
     * 
     */
    public GetHolidaysForDateRangeResponse createGetHolidaysForDateRangeResponse() {
        return new GetHolidaysForDateRangeResponse();
    }

    /**
     * Create an instance of {@link GetHolidaysForYearResponse }
     * 
     */
    public GetHolidaysForYearResponse createGetHolidaysForYearResponse() {
        return new GetHolidaysForYearResponse();
    }

    /**
     * Create an instance of {@link GetHolidaysAvailable }
     * 
     */
    public GetHolidaysAvailable createGetHolidaysAvailable() {
        return new GetHolidaysAvailable();
    }

    /**
     * Create an instance of {@link GetCountriesAvailableResponse }
     * 
     */
    public GetCountriesAvailableResponse createGetCountriesAvailableResponse() {
        return new GetCountriesAvailableResponse();
    }

    /**
     * Create an instance of {@link GetHolidaysAvailableResponse }
     * 
     */
    public GetHolidaysAvailableResponse createGetHolidaysAvailableResponse() {
        return new GetHolidaysAvailableResponse();
    }

    /**
     * Create an instance of {@link GetHolidaysForYear }
     * 
     */
    public GetHolidaysForYear createGetHolidaysForYear() {
        return new GetHolidaysForYear();
    }

    /**
     * Create an instance of {@link GetHolidaysForDateRange }
     * 
     */
    public GetHolidaysForDateRange createGetHolidaysForDateRange() {
        return new GetHolidaysForDateRange();
    }

    /**
     * Create an instance of {@link GetHolidayDateResponse }
     * 
     */
    public GetHolidayDateResponse createGetHolidayDateResponse() {
        return new GetHolidayDateResponse();
    }

    /**
     * Create an instance of {@link RegionCode }
     * 
     */
    public RegionCode createRegionCode() {
        return new RegionCode();
    }

    /**
     * Create an instance of {@link HolidayCode }
     * 
     */
    public HolidayCode createHolidayCode() {
        return new HolidayCode();
    }

    /**
     * Create an instance of {@link ArrayOfRegionCode }
     * 
     */
    public ArrayOfRegionCode createArrayOfRegionCode() {
        return new ArrayOfRegionCode();
    }

    /**
     * Create an instance of {@link Holiday }
     * 
     */
    public Holiday createHoliday() {
        return new Holiday();
    }

    /**
     * Create an instance of {@link CountryCode }
     * 
     */
    public CountryCode createCountryCode() {
        return new CountryCode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHoliday }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.holidaywebservice.com/HolidayService_v2/", name = "ArrayOfHoliday")
    public JAXBElement<ArrayOfHoliday> createArrayOfHoliday(ArrayOfHoliday value) {
        return new JAXBElement<ArrayOfHoliday>(_ArrayOfHoliday_QNAME, ArrayOfHoliday.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.holidaywebservice.com/HolidayService_v2/", name = "ArrayOfCountryCode")
    public JAXBElement<ArrayOfCountryCode> createArrayOfCountryCode(ArrayOfCountryCode value) {
        return new JAXBElement<ArrayOfCountryCode>(_ArrayOfCountryCode_QNAME, ArrayOfCountryCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHolidayCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.holidaywebservice.com/HolidayService_v2/", name = "ArrayOfHolidayCode")
    public JAXBElement<ArrayOfHolidayCode> createArrayOfHolidayCode(ArrayOfHolidayCode value) {
        return new JAXBElement<ArrayOfHolidayCode>(_ArrayOfHolidayCode_QNAME, ArrayOfHolidayCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.holidaywebservice.com/HolidayService_v2/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

}
