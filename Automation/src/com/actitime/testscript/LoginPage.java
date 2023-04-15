package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="username")
private WebElement UnT;
@FindBy(name="pwd")
private WebElement Pwd;
@FindBy(xpath ="//*[@id=\"loginButton\"]/div")
private WebElement Lgin;
@FindBy(name="remember")
private WebElement Cb;
@FindBy(id="keepLoggedInLabel")
private WebElement Kml;
@FindBy(id="toPasswordRecoveryPageLink")
private WebElement Fwd;
//@FindBy(id="username")
//private WebElement C;
@FindBy(xpath ="//*[@id=\"copyRight\"]/nobr/a")
private WebElement Aci;
@FindBy(xpath ="//tr/td[1]/nobr")
private WebElement Ac2;
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setlogin(String username,String password) {
UnT.sendKeys(username);
Pwd.sendKeys(password);
Lgin.click();
}



}
