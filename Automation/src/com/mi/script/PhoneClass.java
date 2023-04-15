package com.mi.script;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PhoneClass {
	@FindBy(linkText = "Phone")
	private WebElement phone;
	@FindBy(xpath = "//span[text()='All Xiaomi Phones']")
	 private WebElement allXiaomiPhones;
	@FindBys({
		@FindBy(xpath = "//h2[@class='product-item__title']")
	})
	private List<WebElement> productItem;
	@FindBys({
		@FindBy(xpath = "//div[@class='mi-price']")
	})
	private List<WebElement> miPrice;
	 
		@FindBy(xpath = "//span[text()='All Redmi Phones']")
 private WebElement allRedmiPhones;
		
	@FindBys({
		@FindBy(xpath = "//h2[@class='site-goods-sku__title']")
	})
	private List<WebElement> siteGood;
	 
 
public List<WebElement> getSiteGood() {
		return siteGood;
	}
	public void setSiteGood(List<WebElement> siteGood) {
		this.siteGood = siteGood;
	}
public WebElement getAllRedmiPhones() {
			return allRedmiPhones;
		}
		public void setAllRedmiPhones(WebElement allRedmiPhones) {
			this.allRedmiPhones = allRedmiPhones;
		}
public List<WebElement> getMiPrice() {
		return miPrice;
	}
	public void setMiPrice(List<WebElement> miPrice) {
		this.miPrice = miPrice;
	}
public List<WebElement> getProductItem() {     
		return productItem;
	}
	public void setProductItem(List<WebElement> productItem) {
		this.productItem = productItem;
	}
public WebElement getPhone() {
		return phone;
	}
	public void setPhone(WebElement phone) {
		this.phone = phone;
	}
public WebElement getAllXiaomiPhones() {
	return allXiaomiPhones;
}
public void setAllXiaomiPhones(WebElement allXiaomiPhones) {
	this.allXiaomiPhones = allXiaomiPhones;
}
public PhoneClass(WebDriver driver) {
PageFactory.initElements(driver,this);
	
}
}