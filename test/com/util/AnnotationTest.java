package com.util;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {

	/*
	 * @Test : 1. 将一个普通方法修饰成一个测试方法
	 * 		   2. @Test(expected=XX.class)  : 设置捕获异常
	 * 		   3. @Test(timeout=ms)      ： 设置退出时间，比如处理死循环
	 * @BeforeClass：他会在所有的方法运行前被执行，static修饰
	 * @AfterClass：他会在所有的方法运行结束后被执行，static修饰
	 * @Before：会在每一个测试方法被运行前执行一次
	 * @After：会在每一个测试方法运行后被执行一次
	 * @Ignore：所修饰的测试方法会被测试运行器忽略
	 * @RunWIth：可以更改测试运行器，一般用默认的就可以了
	 */

	// 捕获异常
	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		assertEquals(3, new Calculate().divide(9, 0));
	}
	
	// 2000毫秒后结束循环
	@Ignore("...") // 说明为什么被忽略
	@Test(timeout=2000)
	public void testWhile() {
		while(true) {
			System.out.println("run forever...");
		}
	}
	
	@Test(timeout=3000)
	public void testTimeout() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
