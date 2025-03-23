package com.planit.jupiter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//-- # 01. load web driver
        System.setProperty("webdriver.chrome.driver", "C;\\Opt\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        //-- # 02. Launch website
        driver.navigate().to("https;//www.calculator.net");
      
        // Maximize the browser
        driver.manage().window().maximize();
        
        //-- # 03. check contents of POM
        String title = driver.getTitle();
        System.out.println("---> " + title);
        System.out.println("--->\n" + driver.getPageSource());
        
        //-- # 04. Click on Math Calculators
        driver.findElement(By.xpath(".//div[@id = 'contentout']//*[text()='7']")).click();
        driver.findElement(By.xpath(".//div[@id = 'contentout']//*[text()='+']")).click();
        driver.findElement(By.xpath(".//div[@id = 'contentout']//*[text()='8']")).click();

        //-- # 05. Get the Result Text based on its xpath
        String result = driver.findElement(By.xpath("//div[@id = 'sciOutPut']")).getText();

        int expectedResult = 15;

        // Print a Log In message to the screen
        System.out.println(" The Result is; [" + result + "]  Exoected result is; [" + expectedResult + "]");
        
        // Close the Browser.
        driver.close();
    }
}
