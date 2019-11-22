package com.capgemini.seleniumdemowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class actTime {
	static {
		System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
	}
	@Test
	public static void testOne() throws InterruptedException {
		WebDriver driver = new OperaDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		
		Thread.sleep(5000);
		String expected ="actiTIME - Enter Time-Track";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		//Thread.sleep(5000);
	//	driver.close();
	}
}
