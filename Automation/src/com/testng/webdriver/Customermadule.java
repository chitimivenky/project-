package com.testng.webdriver;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customermadule {
@Test(priority=3)
public void createcustomer() {
	Reporter.log("createcustomer",true);
}
@Test(priority=1,invocationCount = 3,dependsOnMethods = "createcustomer")
public void modifycustomer() {
	Reporter.log("modifycustomer",true);
}
@Test(priority=2)
public void deletecustomer() {
	Reporter.log("deletecustomer",true);
}

}
