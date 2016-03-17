package com.util;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class, TaskTest2.class, TaskTest3.class})
public class SuiteTest {
	/*
	 * 1. 测试套件就是组织测试类一起运行的
	 * a. 写一个作为测试套件的入口类，这个类不包含其他的方法
	 * b. 更改测试运行起Suite.class
	 * c. 将要测试的类作为数组传入到Suite.SuiteClasses({})
	 * 	  测试类也可以是一个套件
	 */
}
