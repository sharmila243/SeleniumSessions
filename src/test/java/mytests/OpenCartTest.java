package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{ 
	//AAA - Arrange Act Assert
	//1 test should've have 1 Assertion
	
//	WebDriver driver;
	
//	@BeforeTest
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}
	
	@Test(priority = 1)
	public void openCartTitleTest() {
//s		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Assert.assertEquals(driver.getTitle(), "Account Login");
	}
	
	@Test(priority = 2)
	public void openCartUrlTest(){
		Assert.assertTrue(driver.getCurrentUrl().contains("opencart"));
	}
	
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
}
