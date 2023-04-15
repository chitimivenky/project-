package com.actitime.testscript;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.webdriver.BaseClass;

public class CcMainMethod {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void Ccustomer() {
	BaseClass b=new BaseClass();
	b.openBrowser();
	
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/login.do");
b.login();
LoginPage l=new LoginPage(driver);
l.setlogin("admin","manager");
driver.findElement(By.id("container_tasks")).click();
driver.findElement(By.xpath("//div[text()='Add New']")).click();
driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("HDFC_006");
driver.findElement(By.xpath("(//textarea[@class='textarea'])[9]")).sendKeys("Banking  Project");
driver.findElement(By.xpath("//span/div/div[1]/div[3]")).click();
driver.findElement(By.xpath("//span/div/div[2]/div/div[1]/div/div[5]")).click();
driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
String etitle = "HDFC_006";
		List<WebElement> atitle = driver.findElements(By.xpath("//div[text()='HDFC_006']"));
			int cou = atitle.size();
		for (int i = 0; i <cou-1; i++) {
			String text = atitle.get(i).getText();
			//System.out.println(text);
			if (etitle.contains(text)) {
				System.out.println("Customer is successfully created");
			}
			else {
				System.out.println("Customer is successfully not created");
			}
		}
	b.logout();
		driver.findElement(By.id("logoutLink")).click();
		driver.quit();
		b.closeBrowser();
}
}