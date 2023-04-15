package com.actitime.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainMethodForLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
@Test
public void test() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	LoginPage login=new LoginPage(driver);
	login.setlogin("admin", "manager");
	HomePage home=new HomePage(driver);
	home.getTasks().click();
	home.getSwitchToACT().click();
	home.getClose().click();
	
}
}
