package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_2 {

	public static void main(String[] args) {
		
//		ChromeDriver driver = new ChromeDriver();

//		SafariDriver driver = new SafariDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.qatarairways.com");
		String title = driver.getTitle();
		System.out.println("Actual title: " + title);
		if(title.contains("Qatar Airways")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect Title");
		}
		driver.quit();
		
		
	}

}
