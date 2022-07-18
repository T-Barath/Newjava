package com.Maven.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RunnerClass extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		getBrowser("Chrome");
		getUrl("https://adactinhotelapp.com/");
		WebElement name = driver.findElement(By.name("username"));
		inputValueElement(name, "barath1234");
		WebElement pswd = driver.findElement(By.name("password"));
		inputValueElement(pswd, "9345720948");
		WebElement login = driver.findElement(By.name("login"));
		clickOnElement(login);

		WebElement loc = driver.findElement(By.xpath("//select[@name='location']"));
		dropdown(loc, "value", "New York");
		WebElement hotel = driver.findElement(By.name("hotels"));
		dropdown(hotel, "value", "Hotel Hervey");
		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		dropdown(roomtype, "value", "Super Deluxe");
		WebElement numberOfRoom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		dropdown(numberOfRoom, "value", "1");
		WebElement checkIn = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		inputValueElement(checkIn, "15082022");
		WebElement checkOut = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		inputValueElement(checkOut, "22082022");
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		dropdown(adult, "value", "2");
		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		dropdown(child, "value", "0");
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		clickOnElement(search);

		WebElement selHotel = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		clickOnElement(selHotel);
		WebElement continueee = driver.findElement(By.name("continue"));
		clickOnElement(continueee);

		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		inputValueElement(firstname, "Barath");
		WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
		inputValueElement(lastName, "Thangavel");
		WebElement address = driver.findElement(By.name("address"));
		inputValueElement(address, "Namakkal");
		WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
		inputValueElement(card, "5654854796581256");
		WebElement ex_cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		dropdown(ex_cardType, "value", "AMEX");
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		dropdown(month, "value", "8");
		WebElement ex_year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		dropdown(ex_year, "value", "2022");
		WebElement cvv_Number = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		inputValueElement(cvv_Number, "565");
		WebElement book_Now = driver.findElement(By.xpath("//input[@name='book_now']"));
		clickOnElement(book_Now);
		Thread.sleep(5000);

//		WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
//		clickOnElement(logout);
		close();
	}

}
