package com.JunitTest;

public class JunitDemoTest21 {	
	
	public void test_01(){
	System.out.println("第一条用例");
	}
	
	public void test_02(){
	System.out.println("第二条用例");
	}
	
	public static void main(String[] args) {
	
	JunitDemoTest21 jd=new JunitDemoTest21();
	jd.test_01();
	jd.test_02();
	}
}
