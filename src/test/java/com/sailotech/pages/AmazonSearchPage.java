package com.sailotech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author dhanunjaya.potteti
 *
 */
public class AmazonSearchPage {
	 WebDriver driver; 
	  
	    public AmazonSearchPage(WebDriver driver) { 
	        this.driver = driver; 
	     
	    } 
	    
	 // Using FindBy for locating elements 
	    @FindBy(how = How.XPATH, using =  
	            "//*[@id=\"twotabsearchtextbox\"]") 
	   private WebElement searchBox; 
	    
	    @FindBy(how = How.ID, using =  
	            "priceblock_ourprice") 
	   private WebElement priceText; 
	    
	    
	    
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
	   
}
