package com.POM;

import org.openqa.selenium.WebDriver;

import com.Maven.Adactin.BaseClass;

public class RunnerClass extends BaseClass {
public static WebDriver driver;
public static void main(String[] args) {
	driver = getBrowser("ChromE");
	getUrl("https://adactinhotelapp.com/");
	
	Loginpage lp = new Loginpage(driver);
	inputValueElement(lp.getUserName(), "barath1234");
	inputValueElement(lp.getPassword(), "9345720948");
	clickOnElement(lp.getLogin());
	
	SearchHotelPage sp = new SearchHotelPage(driver);
	dropdown(sp.getLocation(), "value", "New York");
	dropdown(sp.getHotels(), "value", "Hotel Hervey");
	dropdown(sp.getRoomType(), "value", "Super Deluxe");
	dropdown(sp.getRoomNumber(), "value", "1");
	inputValueElement(sp.getInDate(), "19082022");
	inputValueElement(sp.getOutDate(), "22082022");
	dropdown(sp.getAdultRoom(), "value", "2");
	dropdown(sp.getChildRoom(), "value", "0");
	clickOnElement(sp.getSubmit());
	
	SelectHotelPage shp = new SelectHotelPage(driver);
	clickOnElement(shp.getSelectt());
	clickOnElement(shp.getContinuee());
	
	Book_A_HotelPage bp = new Book_A_HotelPage(driver);
	inputValueElement(bp.getFname(), "Barath");
	inputValueElement(bp.getLname(), "Thangavel");
	inputValueElement(bp.getAddress(), "Namakkal");
	inputValueElement(bp.getCcNum(), "5463985465874545");
	dropdown(bp.getCcType(), "value", "MAST");
	dropdown(bp.getExpmonth(), "value", "8");
	dropdown(bp.getExpYear(), "value", "2022");
	inputValueElement(bp.getCvv(), "619");
	clickOnElement(bp.getBookNow());
	

}
	
}

