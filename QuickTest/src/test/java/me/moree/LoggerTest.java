package me.moree;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MORE-E
 * created on 2017-09-16
 */
public class LoggerTest {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void loggerFormatTest() {
		int i = 1;
		String str = "haha";
		logger.info("{} {}", i, str);
	}

}
