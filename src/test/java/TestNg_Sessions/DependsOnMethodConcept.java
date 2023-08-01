package TestNg_Sessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	
	@Test
	public void loginTest() {
		System.out.println("Login to App");
	}

	
	@Test(dependsOnMethods = "loginTest")
	public void appSearchTest() {
		System.out.println("Searching for product");
	}
	
	
	@Test(dependsOnMethods = "appSearchTest")
	public void selectProductTest() {
		System.out.println("Select the product");
	}
	
	//If loginTest - FAILS 
		//searchTest - skipped
		//Since searchTest() is skipped, selectProductTest() which is depending on serachTest() will also be skipped
	
	//When we're using dependsOnMethods and priority --> preference is given to dependsOnMethods first
}
