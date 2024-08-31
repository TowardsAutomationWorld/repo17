package com.subbu.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepTwoPage {

	WebDriver driver;

	@FindBy(xpath = "//button[@id = 'finish']")
	WebElement finishBtnEle;
	
	@FindBy(xpath = "//span[text() = 'Checkout: Overview']")
	WebElement checkoutOverviewEle;

	public CheckOutStepTwoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCheckOutPageTwoLanding() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.saucedemo.com/checkout-step-two.html", url);
		Assert.assertTrue(checkoutOverviewEle.isDisplayed());
		Assert.assertTrue(finishBtnEle.isDisplayed());
	}
}
