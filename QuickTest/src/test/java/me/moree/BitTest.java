package me.moree;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MORE-E
 * created on 2017-12-29
 */
public class BitTest {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void test1() {
		int num = 0;
		logger.debug(Integer.toBinaryString(num));
		logger.debug(Integer.toBinaryString(setBit(num, 1)));
		logger.debug(Integer.toString(setBit(num, 1)));
		logger.debug(Integer.toBinaryString(setBit(num, 2)));
		logger.debug(Integer.toString(setBit(num, 2)));
		logger.debug(Integer.toBinaryString(setBit(num, 3)));
		logger.debug(Integer.toString(setBit(num, 3)));
		int num2 = 10;
		logger.debug(Integer.toBinaryString(num2));
		logger.debug(Integer.toBinaryString(clrBit(num2, 1)));
		logger.debug(Integer.toString(clrBit(num2, 1)));
		logger.debug(Boolean.toString(isTrue(num2, 1)));
		logger.debug(Integer.toBinaryString(clrBit(num2, 2)));
		logger.debug(Integer.toString(clrBit(num2, 2)));
		logger.debug(Boolean.toString(isTrue(num2, 2)));
		logger.debug(Integer.toBinaryString(clrBit(num2, 3)));
		logger.debug(Integer.toString(clrBit(num2, 3)));
		logger.debug(Boolean.toString(isTrue(num2, 3)));

		int num3 = 5; // 101
		int num4 = 3; // 011
		Assert.assertEquals(diff(num3, num4), 6);
	}

	/**
	 * 生成指定位数
	 */
	@Test
	public void ofTest() {
		Assert.assertEquals(3, of(0, 1));
		Assert.assertEquals(7, of(0, 1, 2));
	}

	private int setBit(int num, int pos) {
		return num | (1 << pos);
	}

	private int clrBit(int num, int pos) {
		return num & ~(1 << pos);
	}

	private static boolean isTrue(int num, int pos) {
		return ((num >> pos) & 1) == 1;
	}

	private static int diff(int num1, int num2) {
		return num1 ^ num2;
	}

	public static int of(int... posList) {
		int num = 0;
		for (int pos : posList) {
			num = num | (1 << pos);
		}
		return num;
	}
}
