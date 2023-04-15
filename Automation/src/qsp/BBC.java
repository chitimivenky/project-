package qsp;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}
public static void main(String[] args) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.get( "https://www.bbc.com/");
	driver.findElement(By.xpath("//h2[text()='Latest Business News']")).click();
	Thread.sleep(3000);
	List<WebElement> bcc = driver.findElements(By.xpath("//h3[@class='top-list-item__headline']"));
	Thread.sleep(3000);
	int count = bcc.size();
	System.out.println(count);
	for (int i = 0; i<4; i++) {
		String text = bcc.get(i).getText();
		System.out.println(text);
	
	}
	
}
}