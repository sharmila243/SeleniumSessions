package TestNg_Sessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept { //HACK --> show to clients
	
	String name;
	
//	@Test
//	public void searchTest() {
//		System.out.println("Test -- Search");
//		int i = 9/0; //Arithmetic Exception --> test'll FAIL	
//	}


	//UseCase --> unit Testing --> deliberately making test Fail and I'm expecting it
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void searchTest() {
		System.out.println("Test -- Search");
		int i = 9/0; //Arithmetic Exception --> test'll PASS
		System.out.println(i);
		
//		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
//		obj = null;
//		obj.name = "Sharmila"; //NPE but we've written AE --> Mismatched Exception name --> test Fail
				//expectedExceptions =={Array} --> we can provide any exception name separated by , 
	}

}
