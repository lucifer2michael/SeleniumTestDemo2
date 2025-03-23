package com.hu.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitDemoTest22 {
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
	public void test_01() {
	System.out.println("第一条用例");
	}
	
	@Test 
	public void test_02() {
	System.out.println("第二条用例");
	}
}
