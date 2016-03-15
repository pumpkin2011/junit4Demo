package com.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {
	/*
	 * 1. 测试方法必须使用@Test进行修饰
	 * 2. 测试方法必须使用public vlod 进行修饰，不能带任何参数
	 * 3. 新建一个源代码目录来存放我们的测试代码
	 * 4. 测试类的包应该和被测试的类保持一直
	 * 5. 测试但愿中的每个方法必须可以独立测试，测试方法间不能有任何依赖
	 * 6. 测试类使用Test作为类名的后缀
	 * 7. 测试方法使用test为方法名的前缀
	 */
	@Test
	public void testAdd() {
		assertEquals(6, new Calculate().add(3, 3));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(3, new Calculate().subtract(5, 2));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(6, new Calculate().multiply(2, 3));
	}
	
	@Test
	public void testDivide() {
		assertEquals(3, new Calculate().divide(6, 2));
	}
}
