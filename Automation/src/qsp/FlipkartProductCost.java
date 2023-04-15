package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProductCost {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get( "https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);
List<WebElement> allph = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
List<WebElement> allcast = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

for (int i = 0; i <allph.size(); i++) {
System.out.println(allph.get(i).getText() +"---------------->"+allcast.get(i).getText());	
}		

}
}