package me.moree;

import org.junit.Assert;
import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * @author MORE-E
 * created on 2018-05-08
 */
public class TimeTest {

	// 2018-05-08
	@Test
	public void todayStr() {
		System.out.println(LocalDate.now(ZoneId.of("GMT+7")));
	}

	/**
	 * 从时间戳转换至指定格式字符串
	 * eg. 2018-05-08T10:24:38.695
	 */
	@Test
	public void formatFromTimestamp() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
		LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.of("GMT+7"));
		System.out.println(dateTime);
	}

	/**
	 * 带格式
	 * eg. 2018-05-14T09:16:54.867+07:00
	 * eg. May 14, 2018 9:21:12 AM
	 */
	@Test
	public void formatStr() {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("en"));
		OffsetDateTime dt = OffsetDateTime.now(ZoneId.of("GMT+7"));
		System.out.println(dt);
		System.out.println(dt.format(formatter));
	}

	/**
	 * 转至时间戳
	 */
	@Test
	public void toTimestamp() {
		OffsetDateTime dt = OffsetDateTime.now(ZoneId.of("GMT+7")).withMonth(4).withDayOfMonth(14);
		System.out.println(dt.toEpochSecond() * 1000);

		System.out.println(parseToTimestamp("20180514193000"));
		System.out.println(parseToTimestamp("20180514183000"));
	}

	private Long parseToTimestamp(String expireTimeStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime dt = LocalDateTime.parse(expireTimeStr, formatter);
		return dt.toEpochSecond(ZoneOffset.of("+7")) * 1000;
	}

	@Test
	public void localTimeTest() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime time = LocalTime.now();
		System.out.println(time.format(formatter));

		LocalTime time2 = LocalTime.parse("19:40:00", formatter);
		System.out.println(time2);

		System.out.println(time.atOffset(ZoneOffset.of("+8")));
		System.out.println(time2.atOffset(ZoneOffset.of("+8")));

		System.out.println(time2.isAfter(time2));
	}

	@Test
	public void offsetTimeTest() {
		ZoneId zone = ZoneId.of("GMT+8");
		OffsetTime time1 = OffsetTime.now(zone);
		OffsetTime time2 = OffsetTime.parse("10:15:30+01:00");
		System.out.println(time1.withOffsetSameInstant(ZoneOffset.of("+0")));
		System.out.println(time2.withOffsetSameInstant(ZoneOffset.of("+0")));
	}

	@Test
	public void beforeAfterTest() {
		OffsetTime startTime = OffsetTime.parse("21:00:00+07:00");
		OffsetTime endTime = OffsetTime.parse("01:00:00+07:00");

		OffsetTime time1 = OffsetTime.parse("20:00:00+07:00");
		Assert.assertFalse(time1.isAfter(startTime));
		Assert.assertFalse(time1.isBefore(endTime));

		OffsetTime time2 = OffsetTime.parse("22:00:00+07:00");
		Assert.assertTrue(time2.isAfter(startTime));
		Assert.assertFalse(time2.isBefore(endTime));

		OffsetTime time3 = OffsetTime.parse("00:30:00+07:00");
		Assert.assertFalse(time3.isAfter(startTime));
		Assert.assertTrue(time3.isBefore(endTime));

		OffsetTime time4 = OffsetTime.parse("01:30:00+07:00");
		Assert.assertFalse(time4.isAfter(startTime));
		Assert.assertFalse(time4.isBefore(endTime));

		OffsetTime now = OffsetTime.now();
		System.out.println(now.withOffsetSameInstant(ZoneOffset.of("+0")));
		System.out.println(now.isAfter(startTime));
	}

	@Test
	public void beforeAfterTest2() {
		OffsetTime now = OffsetTime.now(ZoneId.of("GMT+7"));
		OffsetTime startTime = OffsetTime.parse("21:00:00+07:00");
		OffsetTime endTime = OffsetTime.parse("01:00:00+07:00");
		Assert.assertTrue(now.isAfter(startTime));
		Assert.assertFalse(now.isBefore(endTime));

		startTime = OffsetTime.parse("23:40:00+07:00");
		endTime = OffsetTime.parse("01:00:00+07:00");
		Assert.assertFalse(now.isAfter(startTime));
		Assert.assertFalse(now.isBefore(endTime));

		startTime = OffsetTime.parse("23:30:00+07:00");
		endTime = OffsetTime.parse("01:00:00+07:00");
		Assert.assertTrue(now.isAfter(startTime));
		Assert.assertFalse(now.isBefore(endTime));

		startTime = OffsetTime.parse("23:30:00+07:00");
		endTime = OffsetTime.parse("23:50:00+07:00");
		Assert.assertTrue(now.isAfter(startTime));
		Assert.assertTrue(now.isBefore(endTime));
	}

	@Test
	public void beforeAfterTest3() {
		OffsetTime now = OffsetTime.now(ZoneId.of("GMT+7"));
		OffsetTime startTime = OffsetTime.parse("08:11:00+07:00");
		OffsetTime endTime = OffsetTime.parse("08:15:00+07:00");
		Assert.assertTrue(now.isAfter(startTime));
		Assert.assertTrue(now.isBefore(endTime));
	}
}
