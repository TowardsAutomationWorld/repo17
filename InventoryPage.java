package com.subbu.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

	WebDriver driver;

	@FindBy(xpath = "//div[@id = 'shopping_cart_container']")
	WebElement shoppingCartEle;

	@FindBy(xpath = "//span[text() = 'Products']")
	WebElement productstextEle;

	@FindBy(xpath = "//div[@data-test = 'inventory-list']")
	WebElement inventoryListEle;
	
	@FindBy(xpath = "//button[@id = 'add-to-cart-sauce-labs-backpack']")
	WebElement backPackProductEle;

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyInventoryPageLanding() {
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", url);

		Assert.assertTrue(shoppingCartEle.isDisplayed());
		Assert.assertTrue(productstextEle.isDisplayed());
		Assert.assertTrue(inventoryListEle.isDisplayed());
	}
	
	public void addTocart() {
		backPackProductEle.click();
	}
	
	public void clickOncart() {
		
	}
}
