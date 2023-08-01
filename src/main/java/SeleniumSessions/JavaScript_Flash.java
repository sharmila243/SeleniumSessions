package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Flash {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);

		//Flash - classic.crmpro.com
			//Flash and enter - so that we'll know where is our driver
		WebElement uName = driver.findElement(By.xpath("//input[@name = 'username']"));
		jsUtil.flash(uName);
		
		String name = "SharmilaBhargav";
		char[] ch = name.toCharArray();
		for(int i = 0; i<ch.length; i++) {
			uName.sendKeys(String.valueOf(ch[i]));
			Thread.sleep(100);
		}
		
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement fn = driver.findElement(By.id("input-firstname"));
		WebElement ln = driver.findElement(By.id("input-lastname"));
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement ph = driver.findElement(By.id("input-telephone"));
		WebElement pwd = driver.findElement(By.id("input-password"));
		WebElement confirmPwd = driver.findElement(By.id("input-confirm"));
		
		String fName = "SharmilaBhargav";
		char[] ch1 = fName.toCharArray();
		jsUtil.flash(fn);

		for(int i = 0; i<ch1.length; i++) {

			fn.sendKeys(String.valueOf(ch1[i]));
			Thread.sleep(100);
		}
		
		String lName = "Bashakarla";
		char[] ch2 = lName.toCharArray();
		jsUtil.flash(ln);

		for(int i = 0; i<ch2.length; i++) {
			
			ln.sendKeys(String.valueOf(ch2[i]));
			Thread.sleep(100);
		}
		
		String emailId = "sharmilabhargav@gmail.com";
		char[] ch3 = emailId.toCharArray();
		jsUtil.flash(email);

		for(int i = 0; i<ch3.length; i++) {
			
			email.sendKeys(String.valueOf(ch3[i]));
			Thread.sleep(100);
		}
		
		String phNum = "7093838986";
		char[] ch4 = phNum.toCharArray();
		jsUtil.flash(ph);

		for(int i = 0; i<ch4.length; i++) {
			
			ph.sendKeys(String.valueOf(ch4[i]));
			Thread.sleep(100);
		}
		
		String password = "Bhargav@123";
		char[] ch5 = password.toCharArray();
		jsUtil.flash(pwd);

		for(int i = 0; i<ch5.length; i++) {
			
			pwd.sendKeys(String.valueOf(ch5[i]));
			Thread.sleep(100);
		}
		
		String ConfirmPassword = "Bhargav@123";
		char[] ch6 = ConfirmPassword.toCharArray();
		jsUtil.flash(confirmPwd);

		for(int i = 0; i<ch6.length; i++) {
			
			confirmPwd.sendKeys(String.valueOf(ch6[i]));
			Thread.sleep(100);
		}
		
		
		driver.quit();

	}

}
