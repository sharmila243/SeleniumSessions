package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudyCloseVsQuit {

	public static void main(String[] args) {
			
		//Case 1: QUIT
		
		//Session ID - ChromeDriver: chrome on mac (622e899b7429cbdf537db07863d95445)
			//After debugging --> mouse hover on driver and check for session ID or click on driver --> Run --> watch
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("Actual title: " + title);
		driver.quit();
		
		//Even if we have 100 lines of code after quit, it will not work
			//session ID will be expired and becomes NULL 
			//In order to work we have to initialize the driver again
		
//		System.out.println(driver.getTitle()); //NoSuchSessionException - Session_ID = NULL
		
		//
		driver = new ChromeDriver(); //need not write WebDriver again, int i = 10; i = 20;
		driver.get("https://www.facebook.com");
		String title1 = driver.getTitle();
		System.out.println("Actual title: " + title1);
		driver.quit();
		
		
		
	}

}
