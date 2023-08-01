package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest_1 { 
	//AAA - Arrange Act Assert
	//1 test should've have 1 Assertion
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test(priority = 1)
	public void googleTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@Test(priority = 2)
	public void googleUrlTest(){
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}
	
	@Test(priority = 3)
	public void googleSearchTest() {
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit(); //perform click - submit the search
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	//Here the advantage is time taking other than that nothing is wrong with the above code 
		//Time taking is because for every test case, before method and after every test case After method will be executed 
	//This give the better results 
	//Test Coverage will be 99% unless there is problem with the server 
	
	//We can use this for regression Testing
}
