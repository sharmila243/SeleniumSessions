package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_EW_WaitFor_Title_URL {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Boolean Flag = wait.until(ExpectedConditions.titleContains("Flights"));
//			if(Flag == true) {
//				System.out.println(driver.getTitle());
//			}else {
//				System.out.println("Title value is not present");
//			}
		

		waitForTitleContains(10, "Amazon");
	
		driver.findElement(By.xpath("//img[@alt = 'Headsets']")).click();
		String url = waitForURLContains(10, "gaming");
		System.out.println(url);
		
		driver.quit();
	}
	
	public static String waitForURLContains(int timeOut, String urlFraction) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut)); 
		//we cannot make this Global like driver and actions class because it will be different for different webElements and 
			//also we cannot pass timeOut if we declare it in the constructor  
		
		try {
			if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			}else {
				System.out.println(urlFraction + "Url Value is not present");
				return "-1";
			}
		}catch(Exception e) {
			System.out.println(urlFraction + "Url Value is not present");
			e.printStackTrace();
			return "-1";
		}
	}
	
	public static String waitForURLToBe(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut)) ;
		
		try {
			if(wait.until(ExpectedConditions.urlContains(urlValue))) {
				return driver.getCurrentUrl();
			}else {
				System.out.println(urlValue + "Url Value is not present");
				return "-1";
			}
		}catch(Exception e) {
			System.out.println(urlValue + "Url Value is not present");
			e.printStackTrace();
			return "-1";
		}
	}
	
	
	
	public static String waitForTitleContains(int timeOut, String titleFraction) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		try {
			if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle(); //if true, it will return driver.getTitle()
			}else {
				System.out.println(titleFraction + "Title value is not present");
				return null; //if false
			}
		}catch(Exception e) {
			System.out.println(titleFraction + "Title value is not present");
			e.printStackTrace();
			return null; //If if() condition gives exception, it comes to catch block
		}
	}
	
	public static String waitForTitleIs(int timeOut, String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		try {
			if(wait.until(ExpectedConditions.titleIs(titleValue))) {
				return driver.getTitle(); 
			}else {
				System.out.println(titleValue + "Title value is not present");
				return null; 
			}
		}catch(Exception e) {
			System.out.println(titleValue + "Title value is not present");
			e.printStackTrace();
			return null; 
		}
	}

}
