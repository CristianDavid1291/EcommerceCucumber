package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {

	/*
	 * Ajax element lcoator you can use 
	 * AjaxElementLocatorFactory factory = new AjaxElementFactory(driver,30)
	 * PageFactory.initElements(factory,this)
	 */
	
	WebDriver driver;
	
	@FindBy(id = "name")
	@CacheLookup //Save locator in the memory in order to not look for the element again, not use if DOM change (Ajax)
	WebElement username_field;
	
	@FindBy(id = "password")
	WebElement password_field;
	
	@FindBy(id = "login")
	WebElement login_button;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		if (!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This url is not correct: " + driver.getCurrentUrl());
		}
	}

	public void setUsername(String username) {
		username_field.sendKeys(username);
	}

	public void setPassword(String password) {
		password_field.sendKeys(password);
	}

	public void clickLoginButton() {
		login_button.click();
	}
}
