package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_HotelPage {
	public static WebDriver driver;
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fname;
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lname;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement ccNum;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement ccType;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expmonth;
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expYear;
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement bookNow;
	public Book_A_HotelPage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
}
