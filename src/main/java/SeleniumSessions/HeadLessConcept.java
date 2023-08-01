package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
		
		
		//HeadLess - No browser at all
			//No browser launching - Invisible - without UI
			//testing happens behind the scene
			//faster than the normal browser testing mode	
			//when to use? LINUX OS, 	, Docker, Non-UI
			//might not work for complex HTML, Navigations, Responsive testing(test on different size of the window - sceenSize, TV, Mobile, we, Laptop)
			
		
		//Firefox, Safari don't support headLess Concept
			//Only Chrome supports HeadLess
		ChromeOptions co = new ChromeOptions();
//		co.setHeadless(false);
		//Since Selenium 4.6.0/4.7.0 setHeadless was deprecated and was upgraded to use addArguments depends on the version
			//addArguments("--headless=new") - according to my google version
		co.addArguments("--headless=new");
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless"); 
		
		
//		WebDriver driver = new FirefoxDriver(fo); 
//		driver.quit();
		
		
		WebDriver driver1 = new ChromeDriver(co);
		driver1.get("https://www.amazon.com");
		driver1.navigate().back();
		driver1.navigate().to("https://www.google.com");
		System.out.println(driver1.getTitle());
		driver1.navigate().to("https://www.easemytrip.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver1.quit();
		
	}

}
