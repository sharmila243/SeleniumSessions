package TestNg_Sessions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basics { //Java Class with TestNG Features --> testNG Java Class
	
	//Global pre-condition   		--> Application is working fine, Server is connected, Data is available  
	//pre-condition					--> If I want to do something or check something on my profile page, I need to Login
	//Test Steps + assert			--> test Cases --> assertion --> P/F
	//Post Steps 					--> Shut down the server, resources, logout, close the browser
	
	//all the above steps need to be implemented in the from of Annotations
	//Every Annotation should be associated with a method
	//No returning anything in Test methods 
	//Any no. of tests can be written (1 to many)
	//3 test cases below
	//Sequence --> BSuite --> BTest --> BClass --> (BMethod --> Test --> AMethod) --> AClass --> ATest --> ASuite
	//Default --> @Test will be picked in alphabetical order --> cartTest --> orderTest --> searchTest
	//If @BSuite is removed,from before Suite next sequence executes --> not mandatory
	//If I remove @Test annotations --> then console shows No tests to run
	
	//If I want to run specific test --> go to that particular test, right click and run it  
	
	
	
	
	@BeforeSuite 
	public void connectWithDB() {
		System.out.println("BS -- Connect with DB");
	}
	 
	@BeforeTest
	public void createAUser() {
		System.out.println("BT -- user creation");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch browser");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- Login to application");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Test -- Search");
		Assert.assertEquals("Google", "Google");
	}
	
	@Test
	public void cartTest() {
		System.out.println("Test -- Cart");
		Assert.assertEquals("Macbook", "Macbook");
	}
	
	@Test
	public void orderTest() {
		System.out.println("Test -- Order");
		Assert.assertEquals(1000, 1000);
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM -- Logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- Close Browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- delete user");
	}
	
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnect with DB");
	}
	
	
}
