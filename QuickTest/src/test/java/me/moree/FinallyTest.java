package me.moree;

import org.junit.Test;

/**
 * @author MORE-E
 * created on 2018-02-01
 */
public class FinallyTest {

	@Test
	// 这个测试说明异步操作无法被finally捕获
	public void asyncTest() {
		try {
			new Thread(() -> {
				try {
					Thread.sleep(2000);
					System.out.println("async");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}).start();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		System.out.println("after finally");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	// 这个测试说明finally会先被执行再return
	public void returnTest() {
		try {
			System.out.println("try");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}
