package me.moree;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by MORE-E on 9/13/2017.
 */
public class CalendarTest {
	private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test() {
        Calendar startTime = Calendar.getInstance();
        startTime.setTime(new Date());
        startTime.set(Calendar.HOUR_OF_DAY, 10);
        startTime.set(Calendar.MINUTE, 0);
        startTime.set(Calendar.SECOND, 0);
        startTime.set(Calendar.MILLISECOND, 0);
        System.out.println(startTime.getTime());
    }

	// yyyy/MM/dd HH:mm:ss
	private static String format(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		return String.format("%04d/%02d/%02d %02d:%02d:%02d", year, month, date, hour, minute, second);
	}

    @Test
    public void timeZoneTest() {
	    Calendar defaultC = Calendar.getInstance();
	    defaultC.setTime(new Date());
	    defaultC.set(Calendar.HOUR_OF_DAY, 10);
	    defaultC.set(Calendar.MINUTE, 0);
	    defaultC.set(Calendar.SECOND, 0);
	    defaultC.set(Calendar.MILLISECOND, 0);

	    Calendar beijingC = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
	    beijingC.setTime(new Date());
	    beijingC.set(Calendar.HOUR_OF_DAY, 10);
	    beijingC.set(Calendar.MINUTE, 0);
	    beijingC.set(Calendar.SECOND, 0);
	    beijingC.set(Calendar.MILLISECOND, 0);

	    Calendar sfoC = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));
	    sfoC.setTime(new Date());
	    sfoC.set(Calendar.HOUR_OF_DAY, 10);
	    sfoC.set(Calendar.MINUTE, 0);
	    sfoC.set(Calendar.SECOND, 0);
	    sfoC.set(Calendar.MILLISECOND, 0);

	    System.out.println("Beijing Time: " + format(beijingC));

	    System.out.println(defaultC.getTime().getTime() - beijingC.getTime().getTime());
	    System.out.println((sfoC.getTime().getTime() - beijingC.getTime().getTime()) / 3600000);
    }

    @Test
    public void getTodayTimestamp() {
	    Calendar defaultC = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
	    defaultC.setTimeInMillis(System.currentTimeMillis() - 24 * 60 * 60 * 1000);
	    defaultC.set(Calendar.HOUR_OF_DAY, 0);
	    defaultC.set(Calendar.MINUTE, 0);
	    defaultC.set(Calendar.SECOND, 0);
	    defaultC.set(Calendar.MILLISECOND, 0);

	    System.out.println(defaultC.getTime().getTime());
    }

    @Test
    public void localDateTest() {
	    System.out.println(LocalDate.now(ZoneId.of("GMT+10")));
    }
}
