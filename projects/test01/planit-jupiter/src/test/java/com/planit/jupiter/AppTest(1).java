package com.planit.jupiter;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@BeforeAll
	static void setup(){
	    System.out.println("@BeforeAll executed");
	}

	@BeforeEach
	void setupThis(){
	    System.out.println("@BeforeEach executed");
	}

	@AfterEach
	void tearThis(){
	    System.out.println("@AfterEach executed");
	}

	@AfterAll
	static void tear(){
	    System.out.println("@AfterAll executed");
	}
		
	/** -------- Rigorous Test ----------- **/
	@Test
	public void test01()
	{
	    System.out.println("@Test-01 executed");
	    Assertions.assertTrue(true);
	}    
	    
	@Test
	public void test02()
	{
	    System.out.println("@Test-02 executed");
	    Assertions.assertTrue(true);
	}    
}
