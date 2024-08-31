package com.subbu.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepOnePage {

	WebDriver driver;
	
	@FindBy(xpath = "//span[text() = 'Checkout: Your Information']")
	WebElement checkoutTextEle;
	
	@FindBy(xpath = "//input[@id = 'first-name']")
	WebElement firstNameEle;
	
	@FindBy(xpath = "//input[@id = 'last-name']")
	WebElement lastNameEle;
	
	@FindBy(xpath = "//input[@id = 'postal-code']")
	WebElement postalCodeEle;
	
	@FindBy(xpath = "//input[@id = 'continue']")
	WebElement continueBtnEle;

	public CheckOutStepOnePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCheckOutPageOneLanding() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.saucedemo.com/checkout-step-one.html", url);
		Assert.assertTrue(checkoutTextEle.isDisplayed());
	}
	
	
	
	
}
