package com.JunitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AllureTest32 {
	@Test 
	public void test_01(){ 
	System.out.println("第一条用例");
	Assertions.assertEquals(2, 1+1);
	}
	
	@Test 
	public void test_02(){ 
	System.out.println("第二条用例");
	Assertions.assertTrue(0>1);
	}
	
	@Test
	public void test_03(){
	System.out.println("第三条用例");
	Assertions.assertTrue(true);
	}
	
}
