package TestNg_Sessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	//Let's say only @test annotation methods are present no @before, @after --> yes, we can execute them
	//Default priority = 0 (ascending --> descending)
	//Both --> Non-priority first (alphabetically) and then priority wise
	//different test cases with same priority --> in that priority order it'll go alphabetically 
		//1,2,3(s),3(c),3(o) --> 1, 2, 3(c), 3(o), 3(s)
	
	@Test(priority = 1)
	public void cartTest() {
		System.out.println("Test -- Cart");
	}
	
	@Test(priority = 31)
	public void searchTest() {
		System.out.println("Test -- Search");
	}

	@Test(priority = 3)
	public void orderTest() {
		System.out.println("Test -- Order");
	}
	
	@Test(priority = 0)
	public void paymentTest() {
		System.out.println("Test -- Payment");
	}
	
	@Test(priority = -1)
	public void loginTest() {
		System.out.println("Test -- Login");
	}
	
	@Test(priority = -1)
	public void emailTest() {
		System.out.println("Test -- Email");
	}
}
