package me.moree;

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
	}
}
