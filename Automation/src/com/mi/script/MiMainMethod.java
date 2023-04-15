package com.mi.script;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class MiMainMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public void homePageOfMi() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.mi.com/in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
		MiWebBrowser m = new MiWebBrowser(driver);
	m.getHomebutton().click();
	m.getStore().click();
		 m.getPhone().click();
	m.getTVSmartHome().click();
	m.getLifeStyle().click();
	m.getDiscover().click();
	m.getHomebutton().click();
	String etitle ="Xiaomi India";
	String atitle = driver.getTitle();
	Assert.assertEquals(atitle,etitle);
	m.getCartShortcut().click();
	m.getStore().click();
		 driver.navigate().refresh();
		PhoneClass c = new PhoneClass(driver);
		c.getPhone().click();
		c.getAllXiaomiPhones().click();
		int count = c.getProductItem().size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = c.getProductItem().get(i).getText();
			String text1 = c.getMiPrice().get(i).getText();
			System.out.println(text + "--------->" + text1);
		}
		c.getAllRedmiPhones().click();
		int count1 = c.getSiteGood().size();
		System.out.println(count1);
	}

}