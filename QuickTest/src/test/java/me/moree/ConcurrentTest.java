package me.moree;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author MORE-E
 * created on 2018-06-07
 */
public class ConcurrentTest {

	private Map<String, AtomicInteger> dateIdMap = new HashMap<>();

	@Test
	public void increaseTest() throws InterruptedException {
		new Thread(() -> getUniqueId("1")).start();
		new Thread(() -> getUniqueId("1")).start();
		new Thread(() -> getUniqueId("1")).start();
		new Thread(() -> getUniqueId("1")).start();
		new Thread(() -> getUniqueId("1")).start();
		new Thread(() -> getUniqueId("1")).start();
		new Thread(() -> getUniqueId("1")).start();
		new Thread(() -> getUniqueId("1")).start();
		new Thread(() -> getUniqueId("1")).start();
		new Thread(() -> getUniqueId("1")).start();
		new Thread(() -> getUniqueId("1")).start();

		new Thread(() -> getUniqueId("2")).start();
		new Thread(() -> getUniqueId("2")).start();
		new Thread(() -> getUniqueId("2")).start();
		new Thread(() -> getUniqueId("2")).start();

		new Thread(() -> getUniqueId("1")).start();
		new Thread(() -> getUniqueId("1")).start();
		new Thread(() -> getUniqueId("1")).start();

		new Thread(() -> getUniqueId("2")).start();
		new Thread(() -> getUniqueId("2")).start();
		new Thread(() -> getUniqueId("2")).start();
		new Thread(() -> getUniqueId("2")).start();
		new Thread(() -> getUniqueId("2")).start();
		new Thread(() -> getUniqueId("2")).start();
		new Thread(() -> getUniqueId("2")).start();
		new Thread(() -> getUniqueId("2")).start();
		new Thread(() -> getUniqueId("2")).start();
		Thread.sleep(1000);
	}

	private int getUniqueId(String date) {
		AtomicInteger isExist = dateIdMap.get(date);
		if (isExist == null) {
			dateIdMap.put(date, new AtomicInteger(0));
		}
		int id = dateIdMap.get(date).incrementAndGet();
		System.out.println(date + "-" + id);
		return id;
	}
}
