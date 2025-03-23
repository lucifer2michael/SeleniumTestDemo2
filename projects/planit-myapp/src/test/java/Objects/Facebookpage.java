package Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookpage {
	WebDriver driver;
	
	public Facebookpage(WebDriver driver) {
		this.driver = driver;	
	}
	
	By Username_editbox=By.xpath("//*[@id='email']");
	By password_editbox=By.xpath("//*[@id='pass']");
	By Login_btn=By.xpath("//*[@name='login']");
	
	public void EnterUsername() {
		driver.findElement(Username_editbox).clear();
		driver.findElement(Username_editbox).sendKeys("Testuser");
		
	}
	public void EnterPassword() {
		driver.findElement(password_editbox).clear();
		driver.findElement(password_editbox).sendKeys("Tester123");
		
	}
	public void VerifyLogin() throws InterruptedException {
		driver.findElement(Login_btn).click();
		String title =driver.getTitle();
		assertEquals(title, "登录 Facebook");
	}
}
