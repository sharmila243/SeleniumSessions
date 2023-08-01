package SeleniumSessions;

public class Wait_Concept {

	public static void main(String[] args) {
	}

	/* Without Wait we cannot maintain Synchronization
	 * 
	 * Synchronization 
	 * 
	 * Need of wait: Let's say application is running on the browser(WebApp) and handled by Selenium
	 * 						//Selenium is sending some instruction to the browser and then App
	 * 						//Browser might be slow or WebApp might be slow, some elements might not be visible or takes some time to display on the page
	 * 						//Selenium is not gonna wait for that and throws the respective exception as soon as if it finds something is missing
	 * 						//In this case, we have to do a SYNC between App and the Script
	 * 						//Synchronization between tool/client script (Selenium) and the browser which is running the app --> called SYNCHRONIZATION
	 *  
	 * Wait 
	 * 	  1. Static Wait - Thread.sleep(5000); --> is coming from Java Library--> Thread is a class, sleep() is a static method 
	 * 					 - script pauses for 5sec now, if element is visible within a second, then we're unnecessarily wasting the rest of the time - this is the problem with static wait
	 * 
	 * 	  2. Dynamic Wait - provided by Selenium Library
	 * 					- Same if I apply 10sec wait and the element is visible after 2sec, rest 8sec will be cancelled or nullified
	 * 					- If element is not visible even after 10sec then we can throw the exception 
	 * 			2a. Implicitly Wait
	 * 					- Implicit wait is written immediately after initializing the driver and we can overwrite it in between
	 * 					- Implicit wait is also called as Global wait, which means
	 * 					- Once implicit wait is written then right after creating every webElement this implicit wait is implied/applied.
	 * 					- Applicable for all the webElements
	 * 					- Won't work for non-WebElements - title, URL, alert() 
	 * 
	 * 					- DrawBack: If I land on Login Page and logged in successfully then I'll be on HomePage now 
	 * 						- Let's say homePage is taking lot of time to load and elements in homePage are also taking lots of time 
	 * 						- What would be the wait applied for the homePage and homePage webElements? - 10sec 
	 * 						- Because implicit wait once written will be applied to all the webElements
	 * 						- Selenium says we can overWrite implicit wait once again, we can change the property -- driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 * 						- Now wait applied for homePage elements will be updated to 20sec
	 * 						- Now I wanna logout and logged out successfully, now i'm on login Page
	 * 						- What will be the wait applied for login page elements? - 20sec, because the latest wait is 20sec and it is called global wait, now all the elements written after applying 20sec wait will take implicit wait of 20sec
	 * 						- If I want 10sec wait should be applied on loginPage, I need to overWrite it again	
	 * 
	 * 						- Let's say there is a form to fill-up, contains userName and Password, login-button, forgotPassword etc etc webElements
	 * 						- when we land on the page, entire form or all the webElements will be loaded at once, there is no such case that first userName will be loaded, then after 5sec password field then after 5sec forgotPassword etc
	 * 						- It is obvious if userName is loaded then all the elements will also be loaded at the same time
	 * 						- then why are we applying wait to all the webElements?	we've to check for every webElement the value of implicit wait, which is unnecessary burden on driver to check the value of implicit wait applied
	 * 
	 * 			2b. Explicit Wait
	 * 					2b.1: WebDriver Wait
	 * 					2b.2: Fluent Wait
	 * 
	 */
	
	
	
}
