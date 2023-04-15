package com.testng.webdriver;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class DemoTestng {
@Test()
public void createcustomer() {
	Reporter.log("createcustomer",true);
}
@Test()
public void modifycustomer() {
	Reporter.log("modifycustomer",true);
}
@Test()
public void deletecustomer() {
	Reporter.log("deletecustomer",true);
}
}
 