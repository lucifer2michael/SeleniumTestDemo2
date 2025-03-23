package com.hu.c01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRadio17 {
	public static void main(String[] args){ 
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file;///C;/Users/Administrator/Desktop/mongodb/java/java/html/update.html");
		//获取第2个单选框韩信元素对象
		WebElement element= driver.findElement(By.xpath("//*[@id=\"hg\"]/div[2]/labe1[2]"));
		Boolean isSelected= element.isSelected(); 
		//查看韩信是否被选中
		if (isSelected){
			System.out.println("韩信已被选中,你只能选下一个英雄了");
		}else{
			element.click();
		}
	}
}