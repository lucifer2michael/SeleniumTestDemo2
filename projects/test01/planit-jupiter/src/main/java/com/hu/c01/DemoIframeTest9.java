package com.hu.c01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoIframeTest9 {
	public static void main(String[] args){ 
		WebDriver driver=new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("http;/192.168.1.111;8888/jeewms/loginController.do?login"); 
		
//		进行登录 
//	
//		默认有账号 需要先清除
		driver.findElement(By.id("userName")).clear(); 
		driver.findElement(By.id("userName")).sendKeys("admin"); 
		driver.findElement(By.id("password")).clear(); 
		driver.findElement(By.id("password")).sendKeys("llg123"); 
		driver.findElement(By.id("randCode")).sendKeys("0000"); 
		driver.findElement(By.id("but_login")).click(); 
		
//		定位基础资料 
		driver.findElement(By.xpath("//span[text()='基础资料']"));
//		定位商品 
		driver.findElement(By.xpath("//a[text()=商品'").click(); 
		
//		找到iframe数字的值看它是动态 
	
		WebElement frame1=driver.findElement(By.xpath("//*[@id='tab_8a7ba3345d93bb87015d93e6e8dd0023']/iframe"));
		
		driver.switchTo().frame(frame1);

//		输入商品名称 表达式有没有写错 等待 窗口 iframe 
		driver.findElement(By.name("shpMingCheng")).sendKeys("1"); 
	}
}
