package com.capgemini.seleniumdemowebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver = new OperaDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("jagnishab61@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("J@gnish1998");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
}
