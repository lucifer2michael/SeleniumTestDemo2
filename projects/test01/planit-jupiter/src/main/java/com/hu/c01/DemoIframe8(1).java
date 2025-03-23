package com.hu.c01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoIframe8 {
	public static void main(String[] args){
		//打开浏览器
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https;//mail.qq.com/"); 
		//没有点击密码登录 
		//原因：1.看自己的定位方式有没有问题
		//2.代码运行速度太快资源没加载
//		3.窗口切换没有窗口切换
//		4.页面中有 iframe一层套一层
//		找到iframe 跳转到iframe中去 
		WebElement iframe1=driver.findElement(By.className("QQMailSdkTool_login_loginBox_qq_iframe"));
		
		driver.switchTo().frame(iframe1); 
//		嵌套了两层iframe 跳到了第一个iframe 还需要再跳一遍
	
		WebElement iframe2=driver.findElement(By.id("ptlogin_iframe")); 
		driver.switchTo(). frame(iframe2);
		
	    //点击密码登录 
		driver.findElement(By.linkText("密登录")).click();
		Thread.sleep(3000);
		//输入账号 
		driver.findElement(By.id("u")).sendKeys("10174456@qq.com"); 
		Thread.sleep(3000);
		//输入密码 
		driver.findElement(By.id("p")).sendKeys("123456"); 
		//点击登录
		driver.findElement(By.id("login_button")).click();
	}
}
