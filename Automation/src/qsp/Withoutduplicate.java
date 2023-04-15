package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Withoutduplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)  {
		HashSet<String> h1=new HashSet<String>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MAHESH/Desktop/mtr.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> all = s.getOptions();
		int count = all.size();
		for (int i = 0; i <count; i++) {
		String text =all.get(i).getText();
		if (h1.add(text)==true) {
		System.out.println(text);
				
								}
						}
				}
		}