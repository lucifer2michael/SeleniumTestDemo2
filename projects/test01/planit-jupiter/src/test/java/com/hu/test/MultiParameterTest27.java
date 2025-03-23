package com.hu.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MultiParameterTest27 {
//	ParameterizedTest表名是个参数化用例 
//	ValueSource单参数 
//	CsvSource 多参数 别的方式分割 delimiterString 指定数据分割符
	@ParameterizedTest
	@CsvSource({"张三,18","张三2,19","张三3,20"})
	void test_param1(String name, Integer age) {
		System.out.println("姓名"+name+"年龄"+age);
	}
	
	@ParameterizedTest
	@CsvSource(value={"张三-18","张三2-19","张三3-20"},delimiterString="-")
	void test_param2(String name, Integer age) {
		System.out.println("姓名"+name+"年龄"+age);
	}
	
	
}
