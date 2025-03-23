package com.hu.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;

@Epic("登录模块")
@Feature("用户登录")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AllureLoginPramJunitTest34 {
	//优化LoginJunitTest26
	
	WebDriver driver=null;
	@Step("打开浏览器，访问网址")
	@BeforeEach
	void BeforeEach() { 
		driver=new ChromeDriver();
		driver.get("http;//127.0.0.1;8080/jeewms/");
	}
	
	@Step("关闭浏览器")
	@AfterEach 
	void AfterEach(){ 
		Thread.sleep(3000);
		driver.quit();
	}

		
//		测试 正确的用户名 密码 验证码
//	    正确的用户名 错误的密码 验证码
//	    正确的用户名 错误的密码 错误的验证码
	    @DisplayName("参数化测试：输入用户名，输入密码，验证码登录")
		@ParameterizedTest		
		@CsvFileSource(resources="/login.csv",numLinesToSkip=1)
		void test_login2(String username,String password,String randeode){

	    Allure.step("输入用户名"+ username);
		driver.findElement(By.name("userName")).clear();
	
		driver.findElement(By.name("userName")).sendKeys("username");

		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys("randeode");
		
//		验证码一般在自动化不测试验证码 给个万能验证码 去掉验证码
		driver.findElement(By.name("randCode")).sendKeys("randeode");
		driver.findElement(By.id("but_login")).click();
		String sjmsg=driver.findElement(By.xpath("/*[@id=\"showErrMsg\"]")).getText();
		System.out.println(sjmsg); 
		Assertions.assertEquals("用户名或密码错误",sjmsg);
		}
		
//		第三条登录成功用例密码错误的用例.步骤一样,数据不同,重复案例,可以优化
	
		
	
}
