package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Concept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		//inject JS script/code using Selenium-Java with JavaScriptExecutor
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("alert('Hello')");
		
		//Use Case: Landed on the particular page, search has been done successfully, proceed with the payment etc
				//Or while giving demo to the client we call call this method and show them 
			
		
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
			//2 ways of getting the title 
				//driver.getTitle;
				//document.title
		
		//driver.getCurrentURL
		//document.URL
		
		//Difference 
			//Client script written in Java --> server(chromeDriver.exe) --> browser
			//driver.getTitle request sent to --> Server --> same sent to browser
					//does browser understands JAVA(driver.getTitle())? NO
			//driver.getTitle request sent to --> Server --> internally calls the browser API written in Java
				//Selenium --> calls the browser API --> JS method will be executed (BY converting the code) and return exactly what we want in the JS
			
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
