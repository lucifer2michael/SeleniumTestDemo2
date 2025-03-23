package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpage{
	
		WebDriver driver;
		
		public GoogleSearchpage(WebDriver driver) {
			this.driver = driver;	
		}
		
		By searchbox= By.xpath("//textarea[@name='q']");
		By Search_btn=By.xpath("(//input[@name='btnK'])[1]");
		By Facebook_link =By.xpath("//h3[text()='Facebook - log in or sign up']");
		
		public void searchgoogle(String Searchinput){
			try {
				driver.findElement(searchbox).sendKeys(Searchinput);
				driver.findElement(Search_btn).click();	
			} catch (Exception e) {
				System.out.println("Exceptions Caught" + e.getMessage());
			}
			
		}
		
		public void ClickFacebook() {
			try {
				driver.findElement(Facebook_link).click();
				} catch (Exception e) {
				System.out.println("Exceptions Caught" + e.getMessage());
			}
		}
		
}
