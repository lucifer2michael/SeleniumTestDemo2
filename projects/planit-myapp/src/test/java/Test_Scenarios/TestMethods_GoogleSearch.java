package Test_Scenarios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import Objects.Facebookpage;
import Objects.GoogleSearchpage;
import Objects.Search_page;

public class TestMethods_GoogleSearch {
	static WebDriver driver;
	GoogleSearchpage objectrepo;
	Search_page pagefactory;

	@BeforeAll
	public static void beforeall() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		URL url = new URL("http://localhost:4444/wd/hub");
		driver = new RemoteWebDriver(url, options);
		/*
		 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver();
		 */
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

	@Test
	public void SearchOperation() throws InterruptedException {
		/*
		 * GoogleSearchpage page = new GoogleSearchpage(driver);
		 * page.searchgoogle("facebook");
		 */
		pagefactory = new Search_page(driver);
		pagefactory.searchgoogle("facebook");
	}

	@Test
	public void VerifyandAccessFacebook() {
		objectrepo = new GoogleSearchpage(driver);
		objectrepo.ClickFacebook();
	}

	@Test
	public void VerifyLogin() throws InterruptedException {
		/*
		 * Facebookpage page = new Facebookpage(driver);
		 * 
		 * Thread.sleep(6000); page.EnterUsername(); page.EnterPassword();
		 * page.VerifyLogin();
		 */
	}

	@AfterAll
	public static void afterall() {
		driver.quit();
	}
}
