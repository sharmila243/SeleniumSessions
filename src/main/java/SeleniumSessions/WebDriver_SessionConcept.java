package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_SessionConcept { //Quit and Close

	public static void main(String[] args) {
			

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("Actual title: " + title);
		if(title.equalsIgnoreCase("facebook")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect Title");
		}
		driver.quit();
		
		
		
		//After quit statement - what will be response or session ID? 
		System.out.println(driver.getTitle()); 
				//NoSuchSessionException -- Session ID is null. Using WebDriver after calling quit()?
		
		
		
		//In order to get the title we've to initialize the driver again - CaseStudyCloseVsQuit
		
		
	}

}
