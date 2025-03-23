package com.hu.c01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) {
		//open Chrome browser
		WebDriver driver = new ChromeDriver();
		// visit url
		driver.get("http;//novel.hctestedu.com/user/login.html");
		//maximize window
		driver.manage().window().maximize();
		//找输入框输入用户名 
		driver.findElement(By.id("txtUName")).sendKeys("18111111111");
		//找密码框输入密码 
		driver.findElement(By.name("txtPassword")).sendKeys("123456");
		//找按钮进行点击 
		driver.findElement(By.name("btnLogin")).click(); 
	}
}
