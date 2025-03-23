package com.planit.jupiter;

import org.openqa.selenium.WebElement;

public class LoginPageNew {

	
	@FindBy(id="user_login") 
	WebElement username;
	

	@FindBy(How=How.ID,using="user_pass") 
	WebElement password;
	
	@FindBy(how=How.XPATH,using=".//*[@id='wp-submit']")
	WebElement submit_button;
	
	@FindBy(how=How.LINK_TEXT,using="Lost your password?")
	WebElement forget_password_link;
	
	
}
