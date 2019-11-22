package com.capgemini.seleniumdemowebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Demo {
	static {
		System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new OperaDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
