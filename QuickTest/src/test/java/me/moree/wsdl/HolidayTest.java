package me.moree.wsdl;

import me.moree.wsdl.holidayservice_v2.*;
import org.junit.Test;

/**
 * Created by MORE-E on 6/24/2018.
 */
public class HolidayTest {

    @Test
    public void test1() {
        HolidayService2 service2 = new HolidayService2();
        HolidayService2Soap soap = service2.getHolidayService2Soap();
        ArrayOfCountryCode array = soap.getCountriesAvailable();
        String code = array.getCountryCode().get(0).getCode();
        System.out.println(code);
        ArrayOfHolidayCode array1 = soap.getHolidaysAvailable(Country.fromValue(code));
        System.out.println(array1);
    }
}
