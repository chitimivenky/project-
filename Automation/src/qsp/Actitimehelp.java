package qsp;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimehelp {
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
driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
driver.findElement(By.linkText("About your actiTIME")).click();
driver.findElement(By.xpath("//tr/td[1]/a[2]")).click();

Set<String> pw = driver.getWindowHandles();
for (String aw : pw) {
	driver.switchTo().window(aw);
	}
List<WebElement> s = driver.findElements(By.xpath("//h2"));
int count = s.size();
System.out.println(count);
for (int i = 1; i < count; i++) {
	String text = s.get(i).getText();
	System.out.println(text);
}
}
}