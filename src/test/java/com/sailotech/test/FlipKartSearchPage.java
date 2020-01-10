/**
 * 
 */
package com.sailotech.test;

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
	    @FindBy(how = How.CLASS_NAME, using =  
	            "LM6RPg") 
	    WebElement searchBox; 
	    
	    @FindBy(how = How.CLASS_NAME, using =  
	            "_6BWGkk") 
	    WebElement priceText; 
	    
	    @FindBy(how = How.XPATH, using =  
	            "//*[@class='_2AkmmA _29YdH8']") 
	    WebElement loginButton; 
	    
	    // This method is to set product details to search text box 
	    public void setProduct(String productName) { 
	    	searchBox.sendKeys(productName); 
	        } 

}
