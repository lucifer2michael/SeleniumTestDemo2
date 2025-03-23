package com.JunitTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SingleParameterTest27 {
	@ParameterizedTest

//	@ParameterizedTest表明为参数化测试用例 

	@ValueSource(strings={"张三","李四","王五"})

	void test_param(String name){
	
	System.out.println(name); 
	}
	@ParameterizedTest

//	@ParameterizedTest表明为参数化测试用例 

	@ValueSource(ints={1,2,3,4})

	void test_param(int i){
	
	System.out.println(i); 
	}
	
}
