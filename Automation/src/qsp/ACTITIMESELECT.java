package qsp;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACTITIMESELECT {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("container_users")).click();
		driver.findElement(By.xpath("//tr[1]/td[3]/div/div[3]/div[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("venkey");
		driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("chiti");
}
}