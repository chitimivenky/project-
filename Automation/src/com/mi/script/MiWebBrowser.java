package com.mi.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiWebBrowser {
	@FindBy(linkText="Store")
	private WebElement store;
	@FindBy(xpath = "Store")
	private WebElement rightarrow;
	@FindBy(linkText = "Phone")
	private WebElement phone;
	@FindBy(xpath = "Phone")
	private WebElement redmi;
	@FindBy(xpath = "//a[@class='logo__link']")
	private WebElement homebutton;
	@FindBy(linkText = "TV & Smart Home")
	private WebElement TVSmartHome;
	@FindBy(linkText = "Laptop & Tablet")
	private WebElement LaptopTablet;
	@FindBy(linkText = "LifeStyle")
	private WebElement LifeStyle;
	@FindBy(linkText ="Discover" )
	private WebElement Discover;
	@FindBy(linkText = "Support")
	private WebElement Support;
	@FindBy(xpath = "//i[@class='micon micon-search-glass shortcut__icon']")
	private WebElement searchButton;
	@FindBy(xpath = "//i[@class='micon micon-shopping-cart shortcut__icon']")
	private WebElement cartShortcut;
	@FindBy(xpath = "micon micon-account shortcut__icon")
	private WebElement accountShortcut;
	
	public WebElement getAccountShortcut() {
		return accountShortcut;
	}
	public void setAccountShortcut(WebElement accountShortcut) {
		this.accountShortcut = accountShortcut;
	}
	public WebElement getCartShortcut() {
		return cartShortcut;
	}
	public void setCartShortcut(WebElement cartShortcut) {
		this.cartShortcut = cartShortcut;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}
	public WebElement getSupport() {
		return Support;
	}
	public void setSupport(WebElement support) {
		Support = support;
	}
	public WebElement getDiscover() {
		return Discover;
	}
	public void setDiscover(WebElement discover) {
		Discover = discover;
	}
	public WebElement getLifeStyle() {
		return LifeStyle;
	}
	public void setLifeStyle(WebElement lifeStyle) {
		LifeStyle = lifeStyle;
	}
	public WebElement getLaptopTablet() {
		return LaptopTablet;
	}
	public void setLaptopTablet(WebElement laptopTablet) {
		LaptopTablet = laptopTablet;
	}
	public WebElement getTVSmartHome() {
		return TVSmartHome;
	}
	public void setTVSmartHome(WebElement tVSmartHome) {
		TVSmartHome = tVSmartHome;
	}
	public WebElement getHomebutton() {
		return homebutton;
	}
	public void setHomebutton(WebElement homebutton) {
		this.homebutton=homebutton;
	}
	public WebElement getRedmi() {
		return redmi;
	}
	public void setRedmi(WebElement redmi) {
		this.redmi = redmi;
	}
	public WebElement getPhone() {
		return phone;
	}
	public void setPhone(WebElement phone) {
		this.phone=phone;
	}
	public WebElement getRightarrow() {
		return rightarrow;
	}
	public void setRightarrow(WebElement rightarrow) {
		this.rightarrow = rightarrow;
	}
	public WebElement getStore() {
		return store;
	}
	public void setStore(WebElement store) {
		this.store = store;
	}
	public MiWebBrowser(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
