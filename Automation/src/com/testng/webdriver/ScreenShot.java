package com.testng.webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void DemoScreenShot() throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	TakesScreenshot t=(TakesScreenshot) driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File f=new File("./Screenshot/ss.png");
	FileUtils.copyFile(src, f);
	driver.close();
}
}
