package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mi {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://mi.com/");
//	Thread.sleep(1000);
//	WebElement li = driver.findElement(By.linkText("Phone"));	
//	Actions a=new Actions(driver);
//	a.moveToElement(li).perform();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//i[@class='micon micon-nav-redmi submenu__icon']")).click();
	
	driver.findElement(By.xpath("//a[@class='logo__link']")).click();
}

}

