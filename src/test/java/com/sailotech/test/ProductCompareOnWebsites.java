/**
 * 
 */
package com.sailotech.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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


	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\java\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void verifyProductCostTest() throws InterruptedException, IOException {
		String product = "iPhone XR (64GB) - Yellow";
		String websitesList = "amazon,flipkart";
		String[] websites = websitesList.split(",");
		Double amazonAmountValue = null;
		Double flipKartAmountValue = null;
		EcommerceWebsites eCommerceWebsite=null;
		
		for (String website : websites) {
			switch (website) {
			case "amazon":
				// finding product amount in amazon
				eCommerceWebsite=new AmazonWebsite();
				amazonAmountValue = eCommerceWebsite.getProductAmount(product,driver);
				break;
			case "flipkart":
				// finding product amount in FlipKart
				eCommerceWebsite=new FlipKartWebsite();
				flipKartAmountValue =eCommerceWebsite.getProductAmount(product,driver);
				break;
			default:
				System.out.println("no match");
			}
		}

		// compare amounts
		if (amazonAmountValue == flipKartAmountValue) {
			System.out.println(product+" is equal price in both web sites");
			Assert.assertEquals(amazonAmountValue, flipKartAmountValue);

		} else if (amazonAmountValue < flipKartAmountValue) {
			System.out.println(product+" is high price in flipKart " );
			Assert.assertTrue(amazonAmountValue < flipKartAmountValue, "product amount is high in flipkart");
		} else {
			System.out.println(product+" is high price in amazon " );
			Assert.assertTrue(amazonAmountValue > flipKartAmountValue, "product amount is high in amazon");

		}
		driver.close();
	}

	
}
