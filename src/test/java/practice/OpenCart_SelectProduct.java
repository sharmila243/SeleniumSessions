package practice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCart_SelectProduct extends BaseTest {
	
	
	@Test(priority = 1)
	public void searchForProductTest() {
		driver.findElement(By.name("search")).sendKeys("macbook");
		driver.findElement(By.cssSelector("button.btn.btn-default")).click();
		
		Assert.assertEquals(driver.getTitle(), "Search - macbook");
	}
	

	@Test(priority = 2)
	public void selectProductTest() {
		driver.findElement(By.xpath("//a[text() = 'MacBook Pro']")).click();
		
		Assert.assertEquals(driver.getTitle(), "MacBook Pro");
	}
	
	@Test(priority = 3)
	public void additionalImagesDisplayedTest() {
		int list = driver.findElements(By.cssSelector("li.image-additional")).size();
		System.out.println("additional Images For Selected Product DisplayedTest: " + list);
		
		Assert.assertEquals(list, 3);
	}
	
	@Test(priority = 4)
	public void infoTest() {
		boolean flag = driver.findElement(By.xpath("//div[@class = 'cpt_product_description ']//b[text() = 'Next-generation wireless']")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	
	

}
