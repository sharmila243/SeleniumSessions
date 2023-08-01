package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//to Launch the broswer
		//open the browser - chrome
		//Can I interact with browser directly? NO, without exe we cannot 
		
		//The browser is right now in 100.x version
		//exe is only in 100.x version
		//SeleniumScript is also in 100.x 
		
		
		//I did not open eclipse in 2 months now browser's new version is 105.x
		//I did not download 105.x version of exe 
		//will I be able to send the request to 100.x of exe to interact with 105.x browser 
		//NO, which is not reliable 
		
		//So from Selenium 4.6.0 we need not download .exe files
		//Selenium will take care of it internally
		//SELENIUM MANAGER
		
		ChromeDriver driver = new ChromeDriver(); //Selenium will create the replica of the browser
													//and latest version will be picked
		//enter the URL
		driver.get("https://www.google.com"); //create another browser and enters the URL 
													//previous browser is gone now 
			//can we write simple www.google.com without https? 
			//we cannot enter the URL and eclipse gives InvalidArgumentexception - Protocol https is important
			//What if I'm missing www --> https://google.com --> we ca enter the URL, Selenium will take care of it
			//return type of get method is void that is why we have not stored in any variable
			
			
		//fetch the tab name - get the title
		String title = driver.getTitle(); //return type of driver.getTitle()--> String
		System.out.println("Actual title: " + title);
		
		//validate if the title is correct or not - actual vs expected result - CheckPoint/Verification point
		if(title.equals("Google")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect Title");
		}
		
		
	//Automation testing --> Automation Steps + CheckPoint (Actual vs Expected)
		
		driver.quit();
		
		
		
		
		
	}

}
