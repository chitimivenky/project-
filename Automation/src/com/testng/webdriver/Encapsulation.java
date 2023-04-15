package com.testng.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Encapsulation {
private WebElement unTbx;
private WebElement unTbx1;
public Encapsulation(WebDriver driver) {
	unTbx=driver.findElement(By.id("username"));
	unTbx1=driver.findElement(By.name("pwd"));

}
public void setuser(String un) {
unTbx.sendKeys(un);
}
public void setpwd(String pw) {
unTbx1.sendKeys(pw);
}
}
	

	
	
	
	
