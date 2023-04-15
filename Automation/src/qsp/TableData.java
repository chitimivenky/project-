package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();
driver.get("https://demo.actitime.com/administration/btlist.do");
WebElement d = driver.findElement(By.cssSelector("#billingTypesTable > tbody"));
String d1 = d.findElement(By.cssSelector("tr:nth-child(3) > td.listtblcell.lastInRow")).getText();
String d2 = d.findElement(By.cssSelector("tr:nth-child(3) > td.listtblcell.lastInRow > span")).getText();
String d3 = d.findElement(By.cssSelector("tr:nth-child(3) > td.listtblcell.billableStatusCell")).getText();
System.out.println(d1);
System.out.println(d2);
System.out.println(d3);

}//#billingTypesTable > tbody > tr:nth-child(3) > td.listtblcell.lastInRow
}