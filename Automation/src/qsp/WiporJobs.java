package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiporJobs {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https:www.google.com/");
driver.findElement(By.name("q")).sendKeys("wipro.jobs");
driver.findElement(By.name("btnK")).click();
List<WebElement> q = driver.findElements(By.xpath("//h3"));
int count = q.size();
System.out.println(count);
 for (WebElement as : q) {
}
for (int i = 0; i < count; i++) {
	String text = q.get(i).getText();
	System.out.println("link=======>"  +text);
}
driver.quit();
	}}


