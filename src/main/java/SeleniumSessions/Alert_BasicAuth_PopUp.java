package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_BasicAuth_PopUp { //BasicAuth is not JavaScrip Alert
		//Basic Authentication Popup 
		//Coming because of the browser
	
		//Heroku app says - when we hit the URL - We don't have any login page, we have to give username and paasowrd then only allowed to login
				//these alerts are might be because of unavailability of login page 
				//OR some internal applications using in the company
				//modem router, url - 192.168.111 etc etc

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		String username = "admin";
		String password = "admin";
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		//limitation - Selenium thinks that the userrname and password are separated by colon
					//and credentials and the URL of the page are separated by '@'
					//so we cannot write another @ in either username/ password, even if we try that, it does not work
		
		
		String text = driver.findElement(By.xpath("//div[@id = 'content']//p")).getText();
		System.out.println(text);
		
		
		//BasicAuth?
		//use the username and password -- combines both the strings together and create one encoded String [encode with the help of "btoa" method]
				//username:password -- encoded String 
		
				//btoa("username:password") --> generate one random encoded String ENKJBVSBJLKCNJVB&%#&!^#*&(*!
				//btoa - is not java function it is a JAVASCRIPT function that browser uses automatically
		
				//Go to console in DOM
				//type btoa("admin:admin"); and enter 
				//Generate some random encoded String --> given to the server --> server will decode this String
		}

}
