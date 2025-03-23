package com.hu.c01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoInput11 {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file;///C;/Users/Administrator/Desktop/mongodb/java/java/html/update.html"); 
	
	driver.findElement(By.id("pic")).sendKeys("C;\\Users\\Administrator\\Desktop\\mongodb\\java\\java\\html\\a.png");
	Thread.sleep(3000);
	}
}
