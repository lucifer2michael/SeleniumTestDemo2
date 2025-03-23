package com.JunitTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MultiCsvParameterTest28 {
	
	@ParameterizedTest
	@CsvFileSource(resources="/login.csv",numLinesToSkip=1)
	void test_param(String username,String password,String rando) {
		System.out.println(username);
		System.out.println(password);
		System.out.println(rando);
	}
			
	
}
