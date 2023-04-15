package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class Chandra {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("roman reigns");
		Thread.sleep(3000);
		List<WebElement> asug = driver.findElements(By.xpath("//span[text()='roman reigns']/.."));
		Thread.sleep(3000);
		int count = asug.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
		String text = asug.get(i).getText();
		System.out.println(text);
			
		}
	}

}
