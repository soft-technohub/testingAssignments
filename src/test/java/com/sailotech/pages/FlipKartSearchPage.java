/**
 * 
 */
package com.sailotech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author dhanunjaya.potteti
 *
 */
public class FlipKartSearchPage {

	WebDriver driver;

	public FlipKartSearchPage(WebDriver driver) {
		this.driver = driver;

	}

	// Using FindBy for locating elements
	@FindBy(how = How.CLASS_NAME, using = "LM6RPg")
	private WebElement searchBox;

	@FindBy(how = How.CLASS_NAME, using = "_6BWGkk")
	private WebElement priceText;

	@FindBy(how = How.XPATH, using = "//*[@class='_2AkmmA _29YdH8']")
	private WebElement loginButton;

	// This method is to set product details to search text box
	public void setProduct(String productName) {
		searchBox.sendKeys(productName);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public void setSearchBox(WebElement searchBox) {
		this.searchBox = searchBox;
	}

	public WebElement getPriceText() {
		return priceText;
	}

	public void setPriceText(WebElement priceText) {
		this.priceText = priceText;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	
}
