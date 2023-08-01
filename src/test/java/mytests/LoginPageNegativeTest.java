package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
	
	WebDriver driver;
	
	//Data Driven Approach - derive the data from some source --> source could be method, excel file
		//test parameterization
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@DataProvider
	public Object[][] loginTestData() {
		return new Object[][] {
			{"sharmila@@gmail.com", "S@1233333333"},
			{"sharmilaBhargav", ""}, 
			{"", "sharmila@123"},
			{"Test@gmail.com", "tttteeessssssst"},
			{"@#@#@#@#@#@gmail.com", "0000000000"},
			{"   ", "    "}
		};
	}
	
	
	@Test(dataProvider = "loginTestData")
	public void loginWithWrongdataTest(String email, String pwd ) {
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String errorMsg = driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();
		System.out.println(errorMsg);
		
		Assert.assertTrue(errorMsg.contains("Warning: No match for E-Mail Address and/or Password"));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
