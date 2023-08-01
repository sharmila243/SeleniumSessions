package SeleniumSessions;

public class Wait_ExplicitWait_Concept {

	public static void main(String[] args) {

	
		/* Explicit Wait
		 * 		1. WebDriver Wait
		 * 		2. Fluent Wait 
		 * 
		 * There is a class in Selenium
		 * 		WebDriverWait (Class) --> extends --> FluentWait Class --> has parent interface --> Wait(Interface) [in Wait there is a method called until()]
		 * 	
		 * Wait(Interface) --> has a method --> until() 
		 * 		- Interface does not have any method body then who should implement the method
		 * 		- FluentWait should implement this/override method with some method body --> already done by Selenium
		 * 		- FluentWait also has some other methods() defined
		 * 
		 * WebDriverWait --> can have access to all the methods of FluentWait (Inherit from FluentWait)
		 * 		- Does not have any individual methods 
		 * 		- takes all from Fluent Wait
		 * 
		 * 
		 * Explicit Wait - is not Global Wait
		 * 		- Will be applied for specific element
		 * 		- username - 10 - 5 -> 5sec nullified
		 * 		- pwd - 0
		 * 		- login button - 0
		 * 		- Can be applied for non-WebElements (title, URL, alerts)
		 * 		- expectedConditions - class in Selenium  --> various Conditions --> on what basis we want to apply the explicit wait
		 * 
		 */	
		
		
		
		
	}

}
