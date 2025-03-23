package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_page {
	WebDriver driver;
	
	public Search_page(WebDriver driver) {
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//textarea[@name='q']") public WebElement searchbox;
	@FindBy(xpath = "(//input[@name='btnK'])[1]") public WebElement Search_btn;
	@FindBy(xpath = "//h3[text()='Facebook - log in or sign up']") public WebElement Facebook_link;

	
	public void searchgoogle(String Searchinput){
		try {
			searchbox.sendKeys(Searchinput);
			Search_btn.click();	
		} catch (Exception e) {
			System.out.println("Exceptions Caught" + e.getMessage());
		}
		
	}
	
	public void ClickFacebook() {
		try {
			Facebook_link.click();
			} catch (Exception e) {
			System.out.println("Exceptions Caught" + e.getMessage());
		}
	}
}
