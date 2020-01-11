/**
 * 
 */
package com.sailotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author dhanunjaya.potteti
 *
 */
public class WebsiteReviewPage {
	
	// Using FindBy for locating elements 
    @FindBy(how = How.XPATH, using =  
            "//*[@class='ui_icon search brand-global-nav-action-search-Search__icon--2DVjd']") 
  private  WebElement searchBox;
    
    
    @FindBy(how = How.XPATH, using =  
            "//*[@id='mainSearch']") 
    private  WebElement mainSearch; 
    
    
    
    @FindBy(how = How.XPATH, using =  
            "//*[@class='resultContainer local']/child::li[1]") 
    private  WebElement selectedResultUrl; 
    
    
    @FindBy(how = How.PARTIAL_LINK_TEXT, using =  
            "Write a review") 
    private  WebElement reviewLink; 
    
    @FindBy(how = How.ID, using =  
            "ReviewTitle") 
    private WebElement reviewTitle; 
    
    @FindBy(how = How.ID, using =  
            "ReviewText") 
    private  WebElement reviewText; 
    
    @FindBy(how = How.XPATH, using =  
            "//*[@id='trip_type_table']/div[1]") 
    private WebElement selectTripType; 
    
    @FindBy(how = How.ID, using =  
            "trip_date_month_year") 
    private  WebElement travelOptions; 
    
    @FindBy(how = How.ID, using =  
            "noFraud") 
    private   WebElement aggrementCheckBox; 
    
    @FindBy(how = How.XPATH, using =  
            "//*[@id='bubble_rating']") 
    private  WebElement overAllrating;
    
    @FindBy(how = How.XPATH, using =  
            "//*[@id='DQ_RATINGS']/div[1]") 
    private  WebElement hotelRatings;
    
    
    @FindBy(how = How.XPATH, using =  
            "//*[text()='Hotel Ratings']/following-sibling::div[1]/child::div[1]/child::div[2]/child::div/span") 
    private  WebElement serviceRating;
    
    @FindBy(how = How.XPATH, using =  
            "//*[text()='Hotel Ratings']/following-sibling::div[1]/child::div[2]/child::div[2]/child::div/span") 
    private  WebElement roomsRating;
    @FindBy(how = How.XPATH, using =  
            "//*[text()='Hotel Ratings']/following-sibling::div[1]/child::div[3]/child::div[2]/child::div/span") 
    private  WebElement sleepQualityRating;
    
    @FindBy(how = How.XPATH, using =  
            "//*[@id='BODY_BLOCK_JQUERY_REFLOW']") 
    private WebElement body; 
    
    // This method is to set name details to search text box 
    public void setName(String name) { 
    	mainSearch.sendKeys(name); 
        } 
    // This method is to set title details
    public void setReviewTitle(String name) { 
    	reviewTitle.sendKeys(name); 
        } 
    
 // This method is to set title details
    public void setReviewText(String name) { 
    	reviewText.sendKeys(name); 
        }
	public WebElement getSearchBox() {
		return searchBox;
	}
	public void setSearchBox(WebElement searchBox) {
		this.searchBox = searchBox;
	}
	public WebElement getMainSearch() {
		return mainSearch;
	}
	public void setMainSearch(WebElement mainSearch) {
		this.mainSearch = mainSearch;
	}
	public WebElement getSelectedResultUrl() {
		return selectedResultUrl;
	}
	public void setSelectedResultUrl(WebElement selectedResultUrl) {
		this.selectedResultUrl = selectedResultUrl;
	}
	public WebElement getReviewLink() {
		return reviewLink;
	}
	public void setReviewLink(WebElement reviewLink) {
		this.reviewLink = reviewLink;
	}
	public WebElement getReviewTitle() {
		return reviewTitle;
	}
	public void setReviewTitle(WebElement reviewTitle) {
		this.reviewTitle = reviewTitle;
	}
	public WebElement getReviewText() {
		return reviewText;
	}
	public void setReviewText(WebElement reviewText) {
		this.reviewText = reviewText;
	}
	public WebElement getSelectTripType() {
		return selectTripType;
	}
	public void setSelectTripType(WebElement selectTripType) {
		this.selectTripType = selectTripType;
	}
	public WebElement getTravelOptions() {
		return travelOptions;
	}
	public void setTravelOptions(WebElement travelOptions) {
		this.travelOptions = travelOptions;
	}
	public WebElement getAggrementCheckBox() {
		return aggrementCheckBox;
	}
	public void setAggrementCheckBox(WebElement aggrementCheckBox) {
		this.aggrementCheckBox = aggrementCheckBox;
	}
	public WebElement getOverAllrating() {
		return overAllrating;
	}
	public void setOverAllrating(WebElement overAllrating) {
		this.overAllrating = overAllrating;
	}
	public WebElement getHotelRatings() {
		return hotelRatings;
	}
	public void setHotelRatings(WebElement hotelRatings) {
		this.hotelRatings = hotelRatings;
	}
	public WebElement getServiceRating() {
		return serviceRating;
	}
	public void setServiceRating(WebElement serviceRating) {
		this.serviceRating = serviceRating;
	}
	public WebElement getRoomsRating() {
		return roomsRating;
	}
	public void setRoomsRating(WebElement roomsRating) {
		this.roomsRating = roomsRating;
	}
	public WebElement getSleepQualityRating() {
		return sleepQualityRating;
	}
	public void setSleepQualityRating(WebElement sleepQualityRating) {
		this.sleepQualityRating = sleepQualityRating;
	}
	public WebElement getBody() {
		return body;
	}
	public void setBody(WebElement body) {
		this.body = body;
	} 
}
