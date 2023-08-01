package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{ 
	//AAA - Arrange Act Assert
	//1 test should've have 1 Assertion
	
//	WebDriver driver;
	
//	@BeforeTest
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}
	
	@Test(priority = 1)
	public void orangeTitleTest() {
//		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
	}
	
	@Test(priority = 2)
	public void orangeUrlTest(){
		Assert.assertTrue(driver.getCurrentUrl().contains("orangehrm"));
	}
	
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
}
