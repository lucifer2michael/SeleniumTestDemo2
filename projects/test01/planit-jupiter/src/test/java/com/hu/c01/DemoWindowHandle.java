package com.hu.c01;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindowHandle {
	public static void main(String[] args){ 
		WebDriver driver=new ChromeDriver(); 
		driver.get("https;//cs.58.com/");
		driver.manage().window().maximize(); 
		driver.findElement(By.linkText("租房子")).click();
		//切换到新窗口 
		//获取所有窗口 
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles); 
		//循环所有的窗口
		for(String windowHandLe;windowHandles){ 
		//切换到当前句柄的窗口
			driver.switchTo().window(windowHandLe);
			//判断当前窗口的标题是否等于预期标题,如果相等则退出循环
			if(driver.getTitle().equals("长沙整租房价格信|房价租|长沙房产网—长沙58同城租房网")){
				break;
			}
		}	
		Thread.sleep(3000);
		driver.findELement(By.id("keyword")).sendKeys("三室一厅")；
		driver.findELement(By.xpath("//*[@id='header-wrap']/div/div/a/input")).click(); 
		
		} 
		
}
