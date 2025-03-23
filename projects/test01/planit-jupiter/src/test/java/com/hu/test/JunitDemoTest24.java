
package com.hu.test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JunitDemoTest24 {
	//beforeAll-beforeEach-test_01-afterEach-beforeEach-test_02-afterEach-afterAll
	@BeforeAll
	public static void beforeAll() { 
	System.out.println("所有用例执行之前要做的事情");
	}
	
	@AfterAll 
	public static void afterAll(){ 
	System.out.println("所有用例执行之后要做的事情");
	}
	
	@BeforeEach
	public void beforeEach() { 
	System.out.println("用例执行之前要做的事情");
	}
	
	@AfterEach 
	public void afterEach(){ 
	System.out.println("用例执行之后要做的事情");
	}
	
	@Test 
	@Order(1)
	public void test_03(){
	System.out.println("第一条用例");
	Assertions.assertEquals(2,1+1);
	}
	
	@Test 
	@Order(2)
	public void test_02(){
	System.out.println("第二条用例");
	Assertions.assertTrue(0>1);
	}
		
		@Test 
		@Order(3)
		@DisplayName("测试成功用例")
		@Timeout(value=10000,unit=TimeUnit.MILLISECONDS)
		public void test_01(){
		System.out.println("第三条用例");
		Assertions.assertTrue(true);
		
	}
}
