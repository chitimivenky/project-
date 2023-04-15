package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageEn {
	private WebElement uN;
	private WebElement pW;
	private WebElement lG;
	public PageEn(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	public  void pageEn(WebDriver driver) {
		uN=driver.findElement(By.id("username"));
		pW=driver.findElement(By.name("pwd"));
		lG=driver.findElement(By.xpath("//div[.=\"Login \"]"));
	}
	public void setLogin(String un,String pwd) {
		uN.sendKeys("");
		pW.sendKeys("");
		lG.click();
		
	
		
	}

}
