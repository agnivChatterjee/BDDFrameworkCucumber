package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.qa.utils.TestBase;

public class HomePage extends TestBase{
	
	// Using FindBy for locating elements
	@FindBy(how = How.XPATH, using = "//textarea[contains(@title,'mind')]")
	WebElement statusBox;
	@FindBy(how = How.XPATH, using = "//button[@data-testid=\"react-composer-post-button\"]")
	WebElement shareButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	/*public void writeInStatusBox() {
		statusBox.sendKeys("Hello World");
	}

	public void sharePost() {
		shareButton.click();
	}*/
}
