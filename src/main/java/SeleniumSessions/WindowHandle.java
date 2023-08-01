package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //w1
		
		Thread.sleep(3000);
		
		 By twitterLink = By.xpath("//a[contains(@href, 'twitter')]"); //w2
		 
		 //"target = _blank" --> in DOM --> whenever we're clicking on any link or image or anything on a webPage and 
		 									//it is opening in a new window it is because of "target= _blank"
		 //target = _blank --> Opens any link or source in a new link upon clicking
		 
		 driver.findElement(twitterLink).click();   //opens twitter page of OrangeHRM in a new window 
		 											//Now we have 2 windows 
		 											//and still we're in the parent window 
		 											//we've to switch to child window to access anything on twitter page
		 Thread.sleep(3000);
		 
		 Set<String> handles = driver.getWindowHandles(); //since we're having 2 windows --> return type is Set<String
		 
		 Iterator<String> it = handles.iterator();
		 //Iterator starts pointing above the parent window that is Above the first Segment of SET object
		 	//Let's say if parent window ID is at at the address 1000
		 	//Iterator will be at 999
		 
		 //move your iterator - goes to the next segment in the memory
		 String parentWindowID = it.next(); //next() method says it returns next element in the iteration
		 System.out.println("parent Window ID: " + parentWindowID);
		 
		 //to move to child window - which is the next segment 
		 String childWindowID = it.next();
		 System.out.println("Child Window ID: " +childWindowID);
		 
		 //Now window handles are ready and we can switch to child window get our work done 
		 //and close it, after closing driver don't return to parent instead it will be lost and we need to again switch back to parent window
		 driver.switchTo().window(childWindowID);
		 System.out.println("Child window URL: " + driver.getCurrentUrl());
		 System.out.println("Child Window Title: " + driver.getTitle());
		 
		 driver.close(); //close the child window 
		 //and driver will not automatically return to the Parent window 
		 //driver is lost somewhere now 
		 //if we use driver.quit() - closes both the windows 
		 //so we're using driver.close() only to close the child window 
		 
		 //In order to return the driver back to the parent window
		 driver.switchTo().window(parentWindowID);
		 System.out.println("Parent Window URL:" + driver.getCurrentUrl());
		 System.out.println("Parent Window Title:" + driver.getTitle());
			
		 
		 
//		 //switch from parent to child 
//		 driver.switchTo().window(); //pass the name/handle --> window ID
//		 								 //how to get window handle? --> driver.getWindowHandle/ driver.getWindowHandles
		 
		
		driver.quit();
			
	}
	
	//List - order based collection - 0,1,2,3,4....
	
 	//Set - not an order based collection
 		//- Cannot have duplicate values --> window 1 handle != window 2 handle --> both are unique
		//- if set also stores in 0,1,2,3.. we would have used handles.get() method but there is no such method 
		//- we've memory address over here for 2 windows 
	
	//we can apply Iterator on those Java Collections which does not maintain any order like SET
		//iterator() is a method 
		//return type of iterator() is iterator<String> 
	
	//here since Set<String> --> Iterator<String>
 

}
