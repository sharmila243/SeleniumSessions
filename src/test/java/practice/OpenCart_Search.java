package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCart_Search extends BaseTest {
	

	@Test(priority = 1)
	public void searchTest() {
		WebElement search_field = driver.findElement(By.name("search"));
		boolean flag = search_field.isDisplayed();
		Assert.assertEquals(flag, true);
	}
	
	@Test(priority = 2)
	public void enterValueInSearchTest() {
		driver.findElement(By.name("search")).sendKeys("macbook");
		driver.findElement(By.cssSelector("button.btn.btn-default")).click();
		
		Assert.assertEquals(driver.getTitle(), "Search - macbook");
	}
	
	@Test(priority = 3)
	public void resultsDisplayedTest() {
		int list = driver.findElements(By.cssSelector("div.product-layout")).size();
		System.out.println("Results displayed: " + list);
		
		Assert.assertEquals(list, 3);
	}
	

}
