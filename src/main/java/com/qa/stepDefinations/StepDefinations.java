package com.qa.stepDefinations;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import junit.framework.TestCase;

public class StepDefinations extends TestBase {

	LoginPage login_page;
	HomePage home_page;

	@Before
	public void beforeScenario() {
		System.out.println("This will open the Browser and Launch the URL");
		TestBase.initialization();
	}

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() {
		login_page = new LoginPage();
		String title = login_page.verifyLoginPageTitle();
		Assert.assertEquals("Facebook – log in or sign up", title);
	}

	@Then("^User enters crendentials$")
	public void user_enters_crendentials() {
		home_page = login_page.setCrendentials_Login(prop.getProperty("userName"), prop.getProperty("password"));
	}

	@Then("^User verifies FaceBook Home Page$")
	public void user_verifies_FaceBook_Home_Page() {
		String title = home_page.verifyHomePageTitle();
		boolean flag = title.contains("Facebook");
		Assert.assertTrue(flag);
	}

	@After
	public void afterScenario() {
		System.out.println("This will close the Browser");
		TestBase.tearDown();
	}

}
