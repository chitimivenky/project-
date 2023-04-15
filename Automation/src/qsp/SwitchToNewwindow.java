package qsp;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;
import org.seleniumhq.jetty9.util.PathWatcher.DirAction;

public class SwitchToNewwindow {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String d = driver.getWindowHandle();
driver.findElement(By.linkText("actiTIME Inc.")).click();
Set<String> d1 = driver.getWindowHandles();
for (String e1 : d1) {
	if (!e1.equals(d)) {
		driver.switchTo().window(e1);
		driver.findElement(By.xpath("//*[@id=\"home-page-banner\"]/div/a")).click();
		driver.close();
}
}
driver.switchTo().window(d);
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");

 }
}
