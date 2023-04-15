package com.generic.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.testscript.LoginPage;

public class BaseClass {
//static {
//	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//}
public WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		Reporter.log("open browser",true);
//		driver=new ChromeDriver();
//		driver.get("https://demo.actitime.com/login.do");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
	}
@AfterTest
public void closeBrowser() {
	Reporter.log("close browser",true);
}
@BeforeMethod
public void login() {
	Reporter.log("login",true);
//	LoginPage l=new LoginPage(driver);
//	l.setlogin("admin","manager");
//	driver.findElement(By.id("container_tasks")).click();
//	driver.findElement(By.xpath("//div[text()='Add New']")).click();
//	driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
//	driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("HDFC_005");
//	driver.findElement(By.xpath("(//textarea[@class='textarea'])[9]")).sendKeys("Banking  Project");
//	driver.findElement(By.xpath("//span/div/div[1]/div[3]")).click();
//	driver.findElement(By.xpath("//span/div/div[2]/div/div[1]/div/div[5]")).click();
//	driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
//	String etitle = "HDFC_005";
//			List<WebElement> atitle = driver.findElements(By.xpath("//div[text()='HDFC_005']"));
//				int cou = atitle.size();
//			for (int i = 0; i <cou; i++) {
//				String text = atitle.get(i).getText();
//				System.out.println(text);
//				if (etitle.contains(text)) {
//					System.out.println("Customer is successfully created");
//				}
//				else {
//					System.out.println("Customer is successfully not created");
//				}
//			}
}
@AfterMethod
public void logout() {
	Reporter.log("logout",true);
//	driver.findElement(By.id("logoutLink")).click();
//	driver.quit();
}
}
