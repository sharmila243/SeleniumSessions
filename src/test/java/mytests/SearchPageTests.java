package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchPageTests {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	
	@DataProvider(name = "searchData")
	public Object[][] searchTestData() {
		return new Object[][] {
			{"macbook", 3},
			{"imac", 1},
			{"samsung", 2},
			{"canon", 1},
			{"abcd", 0}
		};
	}
	
	
	@Test(dataProvider = "searchData")
	public void searchTest(String searchKey, int expectedResults) {
		
		driver.findElement(By.xpath("//input[@name = 'search']")).clear();
		driver.findElement(By.xpath("//input[@name = 'search']")).sendKeys(searchKey);
		driver.findElement(By.cssSelector("button.btn.btn-default")).click();
		
		String header = driver.findElement(By.cssSelector("div#content h1")).getText();
		System.out.println(header);
		Assert.assertTrue(header.contains(searchKey));
		
		int actResultsDisplayed = driver.findElements(By.cssSelector("div.product-layout")).size();
		System.out.println(actResultsDisplayed + " for " + searchKey);
		Assert.assertEquals(actResultsDisplayed, expectedResults);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
