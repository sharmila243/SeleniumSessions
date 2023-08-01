package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_1 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
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
		
	}

}
