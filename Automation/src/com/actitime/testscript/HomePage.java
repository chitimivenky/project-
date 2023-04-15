package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	@FindBy(id="logo_aT")
	private WebElement logo;
	@FindBy(xpath = "//div/a/div/div[1]")
	private WebElement switchToACT;
	@FindBy(id = "closeProjectLightBoxBtn")
	private WebElement close;
	@FindBy(id="container_tasks")
	private WebElement tasks;
	
	public WebElement getClose() {
		return close;
	}
	public void setClose(WebElement close) {
		this.close = close;
	}
	public WebElement getSwitchToACT() {
		return switchToACT;
	}
	public void setSwitchToACT(WebElement switchToACT) {
		this.switchToACT = switchToACT;
	}
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getTasks() {
		return tasks;
	}
	public void setTasks(WebElement tasks) {
		this.tasks = tasks;
	}

	


}
