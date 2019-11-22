package com.capgemini.seleniumdemowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
	static {
		System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new OperaDriver();
		driver.get("file:C://Users//Jgnissh pc//Desktop/Hotel.html");
		
		WebElement listBox= driver.findElement(By.id("slv"));
		Select select=new Select(listBox);
		Thread.sleep(1000);
		select.deselectAll();
		Thread.sleep(1000);
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("v");
		Thread.sleep(1000);
		select.selectByVisibleText("dosa");
		Thread.sleep(1000);
		select.deselectByIndex(0);
		Thread.sleep(1000);
		select.deselectByValue("v");
		Thread.sleep(1000);
		select.deselectByVisibleText("dosa");
	}
}
