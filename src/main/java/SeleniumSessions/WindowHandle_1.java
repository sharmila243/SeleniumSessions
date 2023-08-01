package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_1 {	

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //w1
		
		Thread.sleep(3000);
		
		WebElement twitterLink = driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		WebElement fbLink = driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
		WebElement yTLink = driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));
		WebElement lILink = driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));
		
		twitterLink.click();
		fbLink.click();
		yTLink.click();
		lILink.click();
		
		//we now have 5 browsers - and driver is on the parent window	
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		//I dont want to it.next() for 5 times 
		
		while(it.hasNext()) { //it.hasNext() --> do you have the next element? - if yes condition satisfies
			String windowID = it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			driver.close();
			
			System.out.println("---------");
			
			//Problem with the above code is 
				//we're not returning to the parent window 
				//and in while loop all the windows are getting closed
			//Solution is 
				//get the parent window handle as soon as we launch the URL - parentWindowID
				//in the while loop add another loop, if(!window ID == parentWindowID) [reversing the condition by adding ! before]
						//which means if window ID is other than parent Window ID --> Close that particular window after finishing the work in child window.
		}
		
		
		//Check WindowHandle_2
		
		driver.quit();
		
		
		
	}

}
