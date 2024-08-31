package com.subbu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@id = 'user-name']")
	WebElement userNameEle;

	@FindBy(xpath = "//input[@id = 'password']")
	WebElement pwdEle;

	@FindBy(xpath = "//input[@id = 'login-button']")
	WebElement loginBtnEle;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String username, String pwd) {
		userNameEle.sendKeys(username);
		pwdEle.sendKeys(pwd);
	}

	public void clickOnLoginButton() {
		loginBtnEle.click();
	}

}
