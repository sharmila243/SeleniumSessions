package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register_Test {

	public static void main(String[] args) {
		
		
		BrowserUtil b = new BrowserUtil();
		WebDriver driver = b.launchBrowser("chrome"); //Initialize the driver
		b.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String pageTitle = b.getPageTitle();
		System.out.println("Title of the page: " + pageTitle);
		
		System.out.println(b.getPageUrl());
		
		
		By firstName = By.id("input-firstname"); 
		By lastName = By.id("input-lastname");
		By email_id = By.id("input-email");
		By ph_number = By.id("input-telephone");
		By password = By.id("input-password");
		By confirm_pass = By.id("input-confirm");
		
		By privacy_policy = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		By continue_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		
		ElementUtil e = new ElementUtil(driver);
		e.doSendKeys(firstName, "Sharmila");
		e.doSendKeys(lastName, "Bashakarla");
		e.doSendKeys(email_id, "sharmila7@gmail.com");
		e.doSendKeys(ph_number, "9899898999");
		e.doSendKeys(password, "Sharmila97");
		e.doSendKeys(confirm_pass, "Sharmila97");
		
		e.doClick(privacy_policy);
		e.doClick(continue_xpath);
		
		
		//b.quitBrowser();
		
		
	}

}
