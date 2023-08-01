package TestNg_Sessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept_1 {
	
	
	@Test
	public void loginTest() {//FAILED
		System.out.println("Login to App");
		int i = 9/0;
		System.out.println(i);
	}

	
	@Test(dependsOnMethods = "loginTest") //SKIPPED
	public void appSearchTest() {
		//create a Generic login() and then write the test Case for searchTest
		System.out.println("Searching for product");
	}
	
	
	@Test(dependsOnMethods = "appSearchTest") //SKIPPED	
	public void selectProductTest() {
		//login
		//search
		System.out.println("Select the product");
	}

}
