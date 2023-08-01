package SeleniumSessions;

public class Test {

	public static void main(String[] args) {
		
		
		BrowserUtil b = new BrowserUtil();
		
		String browserName = "chrome"; 
		
		
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
