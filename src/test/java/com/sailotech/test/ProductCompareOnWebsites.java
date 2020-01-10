/**
 * 
 */
package com.sailotech.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sailotech.util.TestUtil;

/**
 * @author dhanunjaya.potteti
 *
 */
public class ProductCompareOnWebsites {

	static WebDriver driver;
	
	 private static final Logger logger = LoggerFactory.getLogger(ProductCompareOnWebsites.class);

	

	@BeforeMethod
	public void setUp() throws Exception {
		 System.setProperty("webdriver.chrome.driver", 
			        System.getProperty("user.dir") +  
			            "\\src\\test\\java\\drivers\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	

	}

	@Test
	public void verifyProductCostTest() throws InterruptedException, IOException {
		String product = "iPhone XR (64GB) - Yellow";
		
		//finding product amount in amazon 
		driver.get("https://www.amazon.in/");
		AmazonSearchPage amazonPage = PageFactory.initElements(driver, AmazonSearchPage.class);
		amazonPage.setProduct(product);
		amazonPage.searchBox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(.,'" + product + "')]")).click();
		String amazonAmount = amazonPage.priceText.getText();
		System.out.println("amazon amount" + amazonAmount);
		Double amazonAmountValue = getValueFromString(amazonAmount);
		
		
		
		//finding product amount in FlipKart 
		driver.get("https://www.flipkart.com/");
		FlipKartSearchPage flipKartPage = PageFactory.initElements(driver, FlipKartSearchPage.class);
		if (flipKartPage.loginButton.isDisplayed()) {
			flipKartPage.loginButton.click();
		}
		flipKartPage.setProduct(product);
		flipKartPage.searchBox.sendKeys(Keys.ENTER);
		String flipKartamount = flipKartPage.priceText.getText();

		System.out.println("flipKart amount" + flipKartamount);
		Double flipKartAmountValue = getValueFromString(flipKartamount);
		if (amazonAmountValue == flipKartAmountValue) {
			System.out.println("Both Amounts are equal");
			Assert.assertEquals(amazonAmountValue, flipKartAmountValue);
			
		} else if (amazonAmountValue < flipKartAmountValue) {
			System.out.println("flip kart amount is high");
			Assert.assertTrue(amazonAmountValue < flipKartAmountValue, "product amount is high in flipkart");
		} else {
			System.out.println("amazon amount is high");
			Assert.assertTrue(amazonAmountValue > flipKartAmountValue, "product amount is high in amazon");
			
		}
		driver.close();
	}

	private Double getValueFromString(String amount) {
		String processedAmount = amount.replaceAll("[₹ ,]*", "");
		System.out.println("processedamount" + processedAmount);
		Double amountValue = Double.parseDouble(processedAmount);
		return amountValue;

	}

}
