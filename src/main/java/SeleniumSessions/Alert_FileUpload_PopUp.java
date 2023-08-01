package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_FileUpload_PopUp {
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//For all UploadFile webElements in DOM there should be an attribute type = "file"
			//if there is no such attribute, we should ask the dev team to insert 
			//else it could become difficult to automate 
			
		//Drag and drop a file from a PC to webPage is not possible 
			//Drag and drop is possible from WebElement to another WebElement 
		
		//we cannot click() because it freezes the page
		//Only Case where we use SendKeys where we actually use click action - syntax
		//Never click() on choseFile
		
		//driver.findElement(locator of upload file element on webPage).sendkeys(locator of the file in the PC/laptop)
		
		
		//type = file 
		driver.findElement(By.name("upfile")).sendKeys("/Users/guddu/Vedaabdhija FirstSem.pdf");
		
		
		
	}
	
	//If type = 'file' is not available 
	//1. we should ask the dev team to insert /add an attribute
	//2. Robot Class - not recommended - works only on windows does not work not Mac, LINUX, DOCKER, CLOUD, JENKINS, HeadLess
	//3. AutoIt - not recommended - works only on windows does not work not Mac, LINUX, DOCKER, CLOUD, JENKINS, HeadLess, GRID
	//4. Sikuli - not recommended - works/based on images 

}
