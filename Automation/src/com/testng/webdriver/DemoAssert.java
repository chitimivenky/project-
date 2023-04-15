package com.testng.webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssert {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test()
	public void verifytitle() {
WebDriver driver=new ChromeDriver();
driver.get("https:www.google.com");
		String etitle = "Google";
		String atitle = driver.getTitle();
		Assert.assertEquals(atitle,etitle);
		driver.close();
	}
}
