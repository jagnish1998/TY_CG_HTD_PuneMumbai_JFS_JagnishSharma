package com.capgemini.seleniumdemowebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class OpenInNewTab {
	static {
		System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new OperaDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://actitime.com/");
		WebElement link = driver.findElement(By.linkText("actiTime Inc"));
		Actions ac = new Actions(driver);
		Thread.sleep(1000);
		ac.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
	}
}
