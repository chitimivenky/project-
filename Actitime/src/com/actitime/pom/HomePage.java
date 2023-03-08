package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logo_aT")
	private WebElement logo;
	@FindBy(xpath = "//div[@class='logoSwitcherIcon']")
	private WebElement logoswitch;
	@FindBy(xpath = "//div[@class='logoSwitcherText']")
	private WebElement logoSwitcherText;
	@FindBy (id = "container_tasks")
	private WebElement container_tasks;
	@FindBy (id = "container_reports")
	private WebElement container_reports;
	@FindBy (id = "container_users")
	private WebElement container_users;
	@FindBy(xpath = "(//div[@class='menu_icon'])[1]")
	private WebElement menu_icon1;
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement menu_icon2;
	@FindBy(xpath = "(//div[@class='menu_icon'])[3]")
	private WebElement menu_icon3;
	@FindBy(xpath = "(//div[@class='menu_icon'])[4]")
	private WebElement menu_icon4;
	@FindBy (xpath = "//a[@class='userProfileLink username ']")
	private WebElement userProfileLink_username;
	@FindBy (xpath = "//td/div/div[5]/div/div/div")
	private WebElement light_on;
	@FindBy(id="logoutLink")
	private WebElement lgOut;
	@FindBy (xpath = "(//td[@class='pagetitle'])[1]")
	private WebElement pagetitle;
	@FindBy (xpath = "(//td[@class='pagetitle'])[2]")
	private WebElement pagetitle1;
	@FindBy(xpath = "//span[@class='dashedLink']")
	private WebElement dashedLink;
	@FindBy (xpath = "(//button[@class='x-btn-text'])[1]")
	private WebElement calendar_btn;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasksTab;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getContainer_tasks() {
		return container_tasks;
	}
	public void setContainer_tasks(WebElement container_tasks) {
		this.container_tasks = container_tasks;
	}
	public WebElement getContainer_reports() {
		return container_reports;
	}
	public void setContainer_reports(WebElement container_reports) {
		this.container_reports = container_reports;
	}
	public WebElement getContainer_users() {
		return container_users;
	}
	public void setContainer_users(WebElement container_users) {
		this.container_users = container_users;
	}
	public WebElement getMenu_icon1() {
		return menu_icon1;
	}
	public void setMenu_icon1(WebElement menu_icon1) {
		this.menu_icon1 = menu_icon1;
	}
	public WebElement getMenu_icon2() {
		return menu_icon2;
	}
	public void setMenu_icon2(WebElement menu_icon2) {
		this.menu_icon2 = menu_icon2;
	}
	public WebElement getMenu_icon3() {
		return menu_icon3;
	}
	public void setMenu_icon3(WebElement menu_icon3) {
		this.menu_icon3 = menu_icon3;
	}
	public WebElement getMenu_icon4() {
		return menu_icon4;
	}
	public void setMenu_icon4(WebElement menu_icon4) {
		this.menu_icon4 = menu_icon4;
	}
	public WebElement getUserProfileLink_username() {
		return userProfileLink_username;
	}
	public void setUserProfileLink_username(WebElement userProfileLink_username) {
		this.userProfileLink_username = userProfileLink_username;
	}
	public WebElement getLight_on() {
		return light_on;
	}
	public void setLight_on(WebElement light_on) {
		this.light_on = light_on;
	}
	public WebElement getPagetitle() {
		return pagetitle;
	}
	public void setPagetitle(WebElement pagetitle) {
		this.pagetitle = pagetitle;
	}
	public WebElement getPagetitle1() {
		return pagetitle1;
	}
	public void setPagetitle1(WebElement pagetitle1) {
		this.pagetitle1 = pagetitle1;
	}
	public WebElement getDashedLink() {
		return dashedLink;
	}
	public void setDashedLink(WebElement dashedLink) {
		this.dashedLink = dashedLink;
	}
	public WebElement getCalendar_btn() {
		return calendar_btn;
	}
	public void setCalendar_btn(WebElement calendar_btn) {
		this.calendar_btn = calendar_btn;
	}
	public WebElement getLogoSwitcherText() {
		return logoSwitcherText;
	}
	public void setLogoSwitcherText(WebElement logoSwitcherText) {
		this.logoSwitcherText = logoSwitcherText;
	}
	public WebElement getLogoswitch() {
		return logoswitch;
	}
	public void setLogoswitch(WebElement logoswitch) {
		this.logoswitch = logoswitch;
	}
	public WebElement getLogo() {
		return logo;
	}
	public void setLogo(WebElement logo) {
		this.logo = logo;
	}
	public WebElement getLgOut() {
		return lgOut;
	}
	public void setLgOut(WebElement lgOut) {
		this.lgOut = lgOut;
	}
	public WebElement getTasksTab() {
		return tasksTab;
	}
	public void setTasksTab(WebElement tasksTab) {
		this.tasksTab = tasksTab;
	}

	public void setLogout() {
		
	}
	 
	
}






