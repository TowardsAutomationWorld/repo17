package com.subbu.steps;

import com.subbu.pages.InventoryPage;
import com.subbu.pages.LoginPage;
import com.subbu.setup.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage loginPage = new LoginPage(DriverManager.getDriver());
	InventoryPage inventoryPage = new InventoryPage(DriverManager.getDriver());

	@Given("user launch the sawglab application")
	public void user_launch_the_sawglab_application() {
		DriverManager.appLaunch();
	}

	@When("^user enter username as (.*) and password as (.*)$")
	public void user_enter_username_and_password(String username, String password) {
		loginPage.doLogin(username, password);
	}

	@Then("user click on login button in the login page")
	public void user_click_on_login_button_in_the_login_page() {
		loginPage.clickOnLoginButton();
	}

	@Then("verify that user landed on inventory page")
	public void verify_that_user_landed_on_inventory_page() {
		inventoryPage.verifyInventoryPageLanding();
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
		DriverManager.tearDown();
	}

}
