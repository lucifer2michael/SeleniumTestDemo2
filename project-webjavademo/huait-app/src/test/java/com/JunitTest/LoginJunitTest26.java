package com.JunitTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginJunitTest26 {
//		第一条登录成功用例
		@Test
		void test_login(){
		WebDriver driver=new ChromeDriver();
		driver.get("http;//127.0.0.1;8080/jeewms/");
	
		driver.findElement(By.name("userName")).clear();
	
		driver.findElement(By.name("userName")).sendKeys("admin1");

		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys("11g123");
		
//		验证码一般在自动化不测试验证码 给个万能验证码 去掉验证码
		driver.findElement(By.name("randCode")).sendKeys("0000");
		driver.findElement(By.id("but_login")).click();
		driver.quit();
		}
		
//		第两条登录成功用例用户名错误的用例
		@Test
		void test_loginFail(){
		WebDriver driver=new ChromeDriver();
		driver.get("http;//127.0.0.1;8080/jeewms/");
	
		driver.findElement(By.name("userName")).clear();
	
		driver.findElement(By.name("userName")).sendKeys("admin");

		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys("11g123");
		
//		验证码一般在自动化不测试验证码 给个万能验证码 去掉验证码
		driver.findElement(By.name("randCode")).sendKeys("0000");
		driver.findElement(By.id("but_login")).click();
		driver.quit();
		}
		
//		第三条登录成功用例密码错误的用例.步骤一样,数据不同,重复案例,可以优化
	
		
	
}
