package com.capgemini.seleniumdemowebdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class GetWindowHandle {
	static {
		System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new OperaDriver();
		driver.navigate().to("https://www.google.com/");
		String wh = driver.getWindowHandle();
		driver.get("https://naukri.com");
		Set<String> whs = driver.getWindowHandles();
		System.out.println("Number of Window :"+whs.size());
		System.out.println(whs);
		driver.quit();
		
	}
}

