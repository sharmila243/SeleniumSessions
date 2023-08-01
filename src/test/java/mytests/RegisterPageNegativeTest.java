package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPageNegativeTest {

WebDriver driver;
	
	//Data Driven Approach - derive the data from some source --> source could be method, excel file
		//test parameterization
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@DataProvider
	public Object[][] RegisterTestData() {
		return new Object[][] {
			{"Sharmila", "", "abcd123@gmail.com", "abcdefghij", "    " }, 
			{"1212222", "B", "6654123@gmail.com", "99999999999", "    " }, 
			{"@@@@@", "#4@@", "54##3@gmail.com", "T123RR4", "Sharmi*97 " }, 
		};
	}
	
	
	@Test(dataProvider = "RegisterTestData")
	public void registerWithWrongdataTest(String fn, String ln,String email, String ph, String pwd) {
		
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(fn);
		
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(ln);
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);	
		
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(ph);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(pwd);
		
		driver.findElement(By.cssSelector("input.btn")).click();
		
		
		String errorMsg = driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();
		System.out.println(errorMsg);
		
		Assert.assertTrue(errorMsg.contains("Warning: You must agree to the Privacy Policy!"));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
