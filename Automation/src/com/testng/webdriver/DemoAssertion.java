package com.testng.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test()
public void verifytitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https:www.google.com");
	String etitle = "gooogle";
	String atitle = driver.getTitle();
	if (atitle.equals(etitle)) {
		System.out.println("Title is not matching");
		
	} else {
		System.out.println("Title is not matching and fail");

	}
	
	driver.close();
}

}
