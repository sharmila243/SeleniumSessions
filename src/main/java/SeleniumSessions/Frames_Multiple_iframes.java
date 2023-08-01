package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Multiple_iframes {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		//frame - switch to frame in 3 ways 	
			//1. based on index
			//2. name/id
			//3. WebElement
		
		driver.switchTo().frame("pact1"); //name/id
		driver.findElement(By.xpath("//input[@title = 'Enter your first crush name']")).sendKeys("ABCD");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("1234");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("XYZ");
		
//		driver.switchTo().defaultContent(); //From directly frame 3 to main webPage
//		String headerText = driver.findElement(By.xpath("//div[@class = 'elementor-widget-container']/h3")).getText();
//		System.out.println(headerText);
		
		driver.switchTo().parentFrame(); //this will move from frame 3 to frame 2
		String frame2Attr = driver.findElement(By.xpath("//input[@id = 'jex']")).getAttribute("placeholder");
		System.out.println(frame2Attr);
		
		//now it is in frame2
		driver.switchTo().parentFrame(); //this will move from frame 2 to frame 1
		String frame1Attr = driver.findElement(By.xpath("//input[@id = 'inp_val']")).getAttribute("placeholder");
		System.out.println(frame1Attr);
		
		//now in frame
		driver.switchTo().parentFrame(); //this now moves from frame 1 to main WebPage
		String headerText = driver.findElement(By.xpath("//div[@class = 'elementor-widget-container']/h3")).getText();
		System.out.println(headerText);

		driver.quit();
	}
	
	//parentframe - added in Selenium 4
		//parentframe() is used only to move from one frame to immediate parent frame 
		//we cannot jump from frame 3 to frame 2 
	
	//Whichever framer we might be in, we can directly jump to main WebPage by switchTo().defaultContent();
	
	
	//We cannot also jump from frame 1 to frame 3 - we've to go in orderly manner
	//Frame 1 --> frame 2 --> frame 3
	
	//using parentframe()
	//frame 3 --> frmae 2 --> frame 1 --> webPage 
	
}
