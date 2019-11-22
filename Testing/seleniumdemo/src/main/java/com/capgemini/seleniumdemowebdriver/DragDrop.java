package com.capgemini.seleniumdemowebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class DragDrop {
	static {
		System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new OperaDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/");
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();;
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions actions = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));;
		WebElement drop = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(drag, drop).perform();
	}
}
