package qsp;

import java.awt.geom.CubicCurve2D;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class GoogleAlllinks {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) //throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
List<WebElement> alllink = driver.findElements(By.tagName("a"));
List<WebElement> alllink1 = driver.findElements(By.tagName("div"));
List<WebElement> alllink2 = driver.findElements(By.tagName("script"));
List<WebElement> alllink3 = driver.findElements(By.tagName("img"));
int count = alllink.size();
int count1 = alllink1.size();
int count2 = alllink2.size();
int count3 = alllink3.size();
System.out.println(count+count1+count2+count3);
for (WebElement a: alllink) {
	System.out.println(a.getAttribute("href"));
	for (int i = 0; i < alllink.size(); i++) {
		String td = alllink.get(i).getText();
		System.out.println(alllink.get(i).getAttribute("href")+ alllink1.get(i).getAttribute("href"));	
	}
}
	 
}
}
