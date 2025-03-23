package com.hu.c01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		//open Chrome browser
		WebDriver driver = new ChromeDriver();
		// visit url
		driver.get("https;//www.youtube.com/");
		//maximize window
		driver.manage().window().maximize();
		//wait 3 seconds
		Thread.sleep(3000);
		//close browser
		driver.quit();
	}
}
