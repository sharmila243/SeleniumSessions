package TestNg_Sessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount = 10, priority = 1, expectedExceptions = Exception.class) //Even if exception is not throw by executing --> test'll FAIL
	public void searchTest() {
		System.out.println("Test -- Search");
		Assert.assertEquals("Google", "Google");
	}
	
	@Test(priority = 2)
	public void cartTest() {
		System.out.println("Test -- Cart");
		Assert.assertEquals("Macbook", "Macbook");
	}

}
