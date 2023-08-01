package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_ImplicitWait_Concept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		//Implicitly wait has to be written after driver is initialized
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Selenium 3.x method - deprecated 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		//If we do not write implicit wait condition for the above two lines code,
				//and the element is not visible exception will be thrown immediately as soon as the page get loaded
		//if we write implicitWait(Duration.timeunit(seconds)) - element is not visible exception will be thrown after 10sec
		
		
		driver.quit();
		
		

	}

}
