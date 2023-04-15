package qsp;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.vtiger.com/");
			WebElement vt = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
			Actions a=new Actions(driver);
			a.moveToElement(vt).perform();
			driver.findElement(By.xpath("//a[contains(text(),'Customers')][1]")).click();
			WebElement log = driver.findElement(By.id("login"));
			Actions a1=new Actions(driver);
			a1.doubleClick(log).perform();
			String t = driver.getTitle();
			if (t.contains("Login")) {
				System.out.println("login page is displayed");
			}
			else {
				System.out.println("login page is notm displayed");
			}
		driver.quit();	
}
}