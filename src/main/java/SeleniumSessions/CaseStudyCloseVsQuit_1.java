package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudyCloseVsQuit_1 {

	public static void main(String[] args) {
		
		//Case 2: CLOSE
		
		
		//SID = 123
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("Actual title: " + title);
		driver.close();
		
//		System.out.println(driver.getTitle()); //SID = 123 - Invalid Session ID - NoSuchSessionException
		
		//initialize the driver again and SID = 456
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
		
			
	}

}
