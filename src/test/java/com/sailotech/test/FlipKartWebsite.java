/**
 * 
 */
package com.sailotech.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sailotech.pages.FlipKartSearchPage;
import com.sailotech.util.TestUtil;

/**
 * @author dhanunjaya.potteti
 *
 */
public class FlipKartWebsite implements EcommerceWebsites {

	@Override
	public Double getProductAmount(String product,WebDriver driver) {
		driver.get("https://www.flipkart.com/");
		FlipKartSearchPage flipKartPage = PageFactory.initElements(driver, FlipKartSearchPage.class);
		if (flipKartPage.getLoginButton().isDisplayed()) {
			flipKartPage.getLoginButton().click();
		}
		flipKartPage.setProduct(product);
		flipKartPage.getSearchBox().sendKeys(Keys.ENTER);
		String flipKartamount = flipKartPage.getPriceText().getText();

		System.out.println("flipKart Product("+product+") Price: " + flipKartamount);
		Double flipKartAmountValue = TestUtil.getValueFromString(flipKartamount);
		return flipKartAmountValue;
	}

}
