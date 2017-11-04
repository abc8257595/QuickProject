package me.moree;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author MORE-E
 * created on 2017-11-04
 */
public class CacheTest {

	@Test
	public void timeBaseTest() throws InterruptedException {
		Cache<String, Long> phoneNumberCache = CacheBuilder.newBuilder()
				.expireAfterWrite(3, TimeUnit.SECONDS)
				.build();
		phoneNumberCache.put("1", 1L);
		phoneNumberCache.put("2", 2L);

		Assert.assertEquals(Long.valueOf(1), phoneNumberCache.getIfPresent("1"));
		Assert.assertEquals(Long.valueOf(2), phoneNumberCache.getIfPresent("2"));

		Thread.sleep(2 * 1000);
		Assert.assertEquals(Long.valueOf(1), phoneNumberCache.getIfPresent("1"));
		Assert.assertEquals(Long.valueOf(2), phoneNumberCache.getIfPresent("2"));

		Thread.sleep(3 * 1000);
		Assert.assertEquals(null, phoneNumberCache.getIfPresent("1"));
		Assert.assertEquals(null, phoneNumberCache.getIfPresent("2"));
	}
}
