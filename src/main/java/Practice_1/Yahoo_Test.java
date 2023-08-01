package Practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Test {

	static WebDriver driver; 
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/manage_account?.intl=in&signin=true&done=https%3A%2F%2Fwww.yahoo.com%2F&eid=100");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
	
		By logo_xpath = By.xpath("//*[@id=\"login-body\"]/div[2]/div[1]/div[1]/img[1]");
		
		WebElement logo_ele = driver.findElement(logo_xpath);
		String src_value = logo_ele.getAttribute("src");
		String alt_value = logo_ele.getAttribute("alt");
		
		System.out.println(src_value);
		System.out.println(alt_value);
		
		
//		By add_account = By.cssSelector("#account-switcher > div.bottom-relative > a");
//		driver.findElement(add_account).click();
//		
		
		By userName = By.id("login-username");
		driver.findElement(userName).sendKeys("jockedu400");
		
		By next_button = By.id("login-signin");
		driver.findElement(next_button).click();
		
		
		
		By pwd = By.id("login-passwd");
		
		try {
			Thread.sleep(5000);
			driver.findElement(pwd).sendKeys("Sorry.786");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		By next = By.cssSelector("#login-signin");
		driver.findElement(next).click();
		
		By later = By.xpath("//*[@id=\"login-body\"]/div[2]/div[1]/div[3]/form/div[2]/a[2]");
		driver.findElement(later).click();
		
		driver.quit();
		
		
		
	}

}
