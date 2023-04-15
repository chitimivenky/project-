package com.testng.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethod {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/login.do");
Encapsulation e=new Encapsulation(driver);
e.setuser("admin");
e.setpwd("manager");
	}
}
