package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCart_Login extends BaseTest {
	
	

	@Test(priority = 1)
	public void titleTest() {
		Assert.assertEquals(driver.getTitle(), "Account Login");
	}
	
	@Test(priority = 2)
	public void urlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));
	}
	
	@Test(priority = 3)
	public void logoTest() {
		WebElement logo = driver.findElement(By.xpath("//img[@title = 'naveenopencart']"));
		String logo_ele = logo.getAttribute("src");
		Assert.assertEquals(logo_ele, "https://naveenautomationlabs.com/opencart/image/catalog/opencart-logo.png");
	}
	
	
	
	
}
