package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_EW_WaitForElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/try-it-free");
		
		Thread.sleep(1000);
		
		By countryList = By.cssSelector("#Form_getForm_Country > option");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		List<WebElement> optionsList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(countryList));
//		System.out.println(optionsList.size());
		
		List<WebElement> list = waitForPresenceOfElementsLocated(10, countryList);
		System.out.println(list.size());
		
		driver.quit();
		
	}
	
	public static List<WebElement> waitForPresenceOfElementsLocated(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	public static List<WebElement> waitForVisibilityOfElementsLocated(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

}
