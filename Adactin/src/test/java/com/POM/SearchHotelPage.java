package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
public static WebDriver driver;

@FindBy(name="location")
private WebElement location;

@FindBy(name="hotels")
private WebElement hotels;

@FindBy(xpath="//select[@name='room_type']")
private WebElement roomType;

@FindBy(xpath="//select[@name='room_nos']")
private WebElement roomNumber;

@FindBy(xpath="//input[@name='datepick_in']")
private WebElement inDate;

@FindBy(xpath="//input[@name='datepick_out']")
private WebElement outDate;

@FindBy(xpath="//select[@name='adult_room']")
private WebElement adultRoom;

@FindBy(xpath="//select[@name='child_room']")
private WebElement childRoom;

@FindBy(xpath="//input[@type='submit']")
private WebElement submit;


public SearchHotelPage(WebDriver driver2) {
	this.driver= driver2;
	PageFactory.initElements(driver2, this);
}

public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getRoomNumber() {
	return roomNumber;
}

public WebElement getInDate() {
	return inDate;
}

public WebElement getOutDate() {
	return outDate;
}

public WebElement getAdultRoom() {
	return adultRoom;
}

public WebElement getChildRoom() {
	return childRoom;
	
}

public WebElement getSubmit() {
	return submit;
}



}
