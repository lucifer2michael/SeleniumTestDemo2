package com.JunitTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Login1JunitTest26 {
	//优化LoginJunitTest26
	
	WebDriver driver=null;
	@BeforeEach
	void BeforeEach() { 
		driver=new ChromeDriver();
		driver.get("http;//127.0.0.1;8080/jeewms/");
	}
	
	@AfterEach 
	void AfterEach(){ 
		Thread.sleep(3000);
		driver.quit();
	}
//		第一条登录成功用例 改变
		@Test
		@Order(1)
		void test_login(){
		
	
		driver.findElement(By.name("userName")).clear();
	
		driver.findElement(By.name("userName")).sendKeys("admin");

		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys("11g123");
		
//		验证码一般在自动化不测试验证码 给个万能验证码 去掉验证码
		driver.findElement(By.name("randCode")).sendKeys("0000");
		driver.findElement(By.id("but_login")).click();
//		取实际结果 
		String sjmsg=driver.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[3]/a/span/small")).getText();
		
		System.out.println(sjmsg);
		
		Assertions.assertEquals("admin",sjmsg);

		
		}
		
//		第两条登录成功用例用户名错误的用例
		@Test
		@Order(2)
		void test_login2(){
	
		driver.findElement(By.name("userName")).clear();
	
		driver.findElement(By.name("userName")).sendKeys("admin1");

		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys("11g123");
		
//		验证码一般在自动化不测试验证码 给个万能验证码 去掉验证码
		driver.findElement(By.name("randCode")).sendKeys("0000");
		driver.findElement(By.id("but_login")).click();
		String sjmsg=driver.findElement(By.xpath("/*[@id=\"showErrMsg\"]")).getText();
		System.out.println(sjmsg); 
		Assertions.assertEquals("用户名或密码错误",sjmsg);
		}
		
//		第三条登录成功用例密码错误的用例.步骤一样,数据不同,重复案例,可以优化
	
		
	
}
