package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_4_NewWindow {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentWindowHandle = driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		//Selenium 4.x feature
		driver.switchTo().newWindow(WindowType.TAB); //driver is now in new window
//		driver.navigate().to("https://www.google.com");
		driver.navigate().to(new URL("https://www.google.com"));
		
		System.out.println(driver.getTitle());
		driver.close(); //Lost the driver here
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindowHandle); //switching back
		System.out.println(driver.getTitle());
		
		driver.quit();
			
	}

}
