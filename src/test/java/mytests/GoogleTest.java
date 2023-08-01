package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{ 
	//AAA - Arrange Act Assert
	//1 test should've have 1 Assertion
	
//	WebDriver driver;
	
//	@BeforeTest
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}
	
	@Test(priority = 1)
	public void googleTitleTest() {
//		driver.get("https://www.google.com");
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
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
	
	//If we have 100 test cases and using the above method
	//if we're launching the browser once and all the test cases are done on the same browser 
		//browser might behave different after 4 5 tests, blank page might show up, browser may not respond properly
		//then from 5 or 6 test case - till 100 All the tests will FAIL 
	//Test Coverage will be 4% or 5% 
	
	
	//We can go with this approach when we're performing Sanity/partial regression where there are less no of test cases
}
