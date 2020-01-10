package com.sailotech.test;

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
	    WebElement searchBox; 
	    
	    @FindBy(how = How.ID, using =  
	            "priceblock_ourprice") 
	    WebElement priceText; 
	    
	    
	    
	    // This method is to set product details to search text box 
	    public void setProduct(String productName) { 
	    	searchBox.sendKeys(productName); 
	        } 
	   
}
