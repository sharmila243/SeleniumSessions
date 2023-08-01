package SeleniumSessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_3 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String parentWindowHandle = driver.getWindowHandle();

		Thread.sleep(3000);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement e : links) {
			e.click();

			Thread.sleep(3000);

			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();

			while (it.hasNext()) {
				Thread.sleep(3000);
				String windowId = it.next();
				
				if (!windowId.equals(parentWindowHandle)) {
					driver.switchTo().window(windowId);
					Thread.sleep(3000);
					System.out.println("Title of the Page: " + driver.getTitle());
					System.out.println("URL of the Page: " + driver.getCurrentUrl());

					driver.close();
				}

				Thread.sleep(3000);
			}
			
			driver.switchTo().window(parentWindowHandle);
			System.out.println("---------");
			System.out.println("Title: " + driver.getTitle());
		

		}
		
		driver.quit();

	}
}
