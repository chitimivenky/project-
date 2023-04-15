package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowersSp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			System.out.println("Enter the title");
			Scanner sc=new Scanner(System.in);
			String eTitle = sc.nextLine();
			WebDriver driver=new ChromeDriver();
			driver.get("https://secure.indeed.com/");
			driver.findElement(By.id("apple-signin-button")).click();
			driver.findElement(By.id("login-facebook-button")).click();
			Set<String> WNHS1 = driver.getWindowHandles();
			for (String lo1 : WNHS1) {
				driver.switchTo().window(lo1);
				String aTitle1 = driver.getTitle();
				System.out.println(aTitle1);
				if (aTitle1.contains(eTitle)) {
				driver.close();
					}
				}
				
}
		}
