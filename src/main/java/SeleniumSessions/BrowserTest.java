package SeleniumSessions;

public class BrowserTest {

	public static void main(String[] args) {
		
		BrowserUtil b = new BrowserUtil();
		
		//If WebDriver driver is not initiated as private I would be able to access it
				//Is this possible? - YES, we're giving an option to do that
				//Is this going to switchCase - NO 
				
//		b.driver = new ChromeDriver(); //Let's comment this line
//		b.driver.get("https://www.google.com"); //I will get NPE here
		
		String browserName = "chrome"; //I need not change my script, I need to change the browser name
		
		b.launchBrowser(browserName);
		b.enterUrl("https://www.facebook.com");
		
		
		String actTitle = b.getPageTitle();
		System.out.println("ActualTitle: " + actTitle);
		if(actTitle.contains("Facebook")) {
			System.out.println("Correct Title");
		}else {
			System.out.println("Incorrect Title");
		}
		
		
		String actUrl = b.getPageUrl();
		System.out.println("Actual Url: " + actUrl);
		if(actUrl.contains("facebook.com")) {
			System.out.println("Correct Url");
		}else {
			System.out.println("Incorrect Url");
		}
		
		b.quitBrowser();
	}

}
