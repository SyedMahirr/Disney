package com.Disney.PageObjectFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class findResort {

	WebDriver driver;

	/*
	 * Constructor that will initialize the WebDriver Object and it will have the
	 * pagefactory initialzer element
	 */

	public findResort(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}// End of Constructor

	// Locator Elements
	@FindBy(name = "checkInDate_display")
	WebElement clickOnCheckIn;

	@FindBy (id = "checkOutDate_display")
	WebElement checkOutDateClick;
	
	@FindBy (className = "button")
	WebElement Adult;
	
	@FindBy (xpath =".//*[@value=\"3\"]	" )
	WebElement child;
	
	@FindBy (xpath = "(//SPAN[@class='caret'])[1]")
	WebElement childAgeOne;
	
	@FindBy( name = "findPricesButton")
	WebElement clickFind;
	
	@FindBy (id = "sortOption")
	WebElement selectName;
	
	@FindBy (id = "detailPageLink-dolphin-hotel")
	WebElement Hotel;
	
	@FindBy(name = "gnbCategoryTitle")
	WebElement hover;
	
	@FindBy (linkText = "Magic Kingdom")
	WebElement clickMagic;
	
	@FindBy(xpath = "//SPAN[text()='Select Tickets']")
	WebElement clickBlueTicket;
	
	//Method
	public WebElement checkInDate() {
		return clickOnCheckIn;
	}
	
	public WebElement CheckoutDate() {
		return checkOutDateClick;
	}
	
	public WebElement AdultPick() {
		return Adult;
	}
	
	public WebElement Child() {
		return child;
	}
	
	public WebElement childAge() {
		return childAgeOne;
	}
	
	public void selectAge(String Value) {
		Select drop = new Select (childAgeOne);
		drop.selectByValue(Value);	
	}
	
	public WebElement clickFindButton() {
		return clickFind;
	}
	
	public WebElement clickDropName() {
		return selectName; 
	}
	public void selectName(String Text) {
		Select drop = new Select (selectName);
		drop.selectByVisibleText(Text);;	
	}
	
	public WebElement clickHotel() {
		return Hotel;
	}
	
	public WebElement ticketHover() {
		return hover;
	}
	
	public WebElement MagicClick() {
		return clickMagic;
	}
	
	public WebElement clickBlue() {
		return clickBlueTicket;
	}
}
