package com.subbu.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;

	@FindBy(xpath = "//button[@id = 'add-to-cart-sauce-labs-backpack']")
	WebElement backPackProductEle;

	@FindBy(xpath = "//span[text() = 'Your Cart']")
	WebElement youCartTextEle;

	@FindBy(xpath = "//button[contains(@id , 'remove-sauce-labs')]")
	WebElement removeCartButtonEle;

	@FindBy(xpath = "//button[@id = 'checkout']")
	WebElement checkoutButtonEle;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyInventoryPageLanding() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.saucedemo.com/cart.html", url);

		Assert.assertTrue(removeCartButtonEle.isDisplayed());
		Assert.assertTrue(checkoutButtonEle.isDisplayed());
	}

	public void clickOnCheckout() {
		checkoutButtonEle.click();
	}
	
	
}
