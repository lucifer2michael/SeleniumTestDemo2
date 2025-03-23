package com.hu.c01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCheckbox18 {
	public static void main(String[] args) { 
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file;///C;/Users/Administrator/Desktop/mongodb/java/java/html/update.html");
	WebElement element= driver.findElement(By.name("checkbox2"));
	if (!element.isSelected()){
		element.click();
	}
}
}
