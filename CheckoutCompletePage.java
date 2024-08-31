package com.subbu.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {

	WebDriver driver;

	@FindBy(xpath = "//button[@id = 'back-to-products']")
	WebElement backToHomeBtnEle;

	@FindBy(xpath = "//span[text() = 'Checkout: Complete!']")
	WebElement checkoutCompleteEle;

	public CheckoutCompletePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyCheckoutCompletePageLanding() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.saucedemo.com/checkout-complete.html", url);
		Assert.assertTrue(backToHomeBtnEle.isDisplayed());
		Assert.assertTrue(checkoutCompleteEle.isDisplayed());
	}
}
