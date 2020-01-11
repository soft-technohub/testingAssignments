/**
 * 
 */
package com.sailotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sailotech.pages.AmazonSearchPage;
import com.sailotech.util.TestUtil;

/**
 * @author dhanunjaya.potteti
 *
 */
public class AmazonWebsite implements EcommerceWebsites {

	@Override
	public Double getProductAmount(String product,WebDriver driver) {
		driver.get("https://www.amazon.in/");
		AmazonSearchPage amazonPage = PageFactory.initElements(driver, AmazonSearchPage.class);
		amazonPage.setProduct(product);
		amazonPage.getSearchBox().sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(.,'" + product + "')]")).click();
		String amazonAmount = amazonPage.getPriceText().getText();
		System.out.println("Amazon Product("+product+") Price: " + amazonAmount);
		Double amazonAmountValue = TestUtil.getValueFromString(amazonAmount);
		return amazonAmountValue;
	}

}
