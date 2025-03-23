package com.hu.c01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoActions19 {
	
	public static void main(String[] args) { 
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http;//www.treejs.cn/v3/demo/cn/exedit/drag.html");
		WebElement ele1= driver.findElement(By.id("treeDemo_2_span"));
		WebElement ele2= driver.findElement(By.id("treeDemo_3_span"));
		Actions actions= new Actions(driver);
		actions.clickAndHold(ele1).moveToElement(ele2).release().perform();
	}
}
