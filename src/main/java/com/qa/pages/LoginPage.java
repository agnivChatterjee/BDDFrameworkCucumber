package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.qa.utils.TestBase;

public class LoginPage extends TestBase {

	// Using FindBy for locating elements
	@FindBy(how = How.XPATH, using = "//input[@type='email'][@name='email']")
	WebElement emailTextBox;

	@FindBy(how = How.XPATH, using = "//input[@type='password'][@name='pass']")
	WebElement passwordTextBox;

	@FindBy(how = How.XPATH, using = "//input[contains(@value,'Log')]")
	WebElement signinButton;

	@FindBy(how = How.XPATH, using = "//i[contains(@class,'fb_logo')]")
	WebElement logo;

	// Initializing all these objects here:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Defining all the user actions (Methods) that can be performed in the Facebook
	// home page

	public boolean verifyLogo() {
		return logo.isDisplayed();
	}

	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}

	// This method will login to the application
	public HomePage setCrendentials_Login(String un, String pw) {
		emailTextBox.sendKeys(un);
		passwordTextBox.sendKeys(pw);
		signinButton.click();

		return new HomePage();
	}

}