package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_FooterHeaderTest_Amazon {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		Thread.sleep(5000);
		
//		By footerHeaderText = By.xpath("//a[text() = 'Amazon Science']//ancestor::div[@class = 'navFooterLinkCol navAccessibility']/div");
//		String catName = driver.findElement(footerHeaderText).getText();
//		System.out.println(catName);
		
		
		
		System.out.println(getFooterHeaderText("Blog"));
		System.out.println(getFooterHeaderText("Advertise Your Products"));
		System.out.println(getFooterHeaderText("Amazon Business Card"));
		System.out.println(getFooterHeaderText("Help"));
		
		
		driver.quit();
	}
	
	public static String getFooterHeaderText(String footerText) {
		String footerHeaderText = 
				driver.findElement(By.xpath("//a[text() = '"+footerText+"']//ancestor::div[@class = 'navFooterLinkCol navAccessibility']/div")).getText();
		
		return footerHeaderText;
	}

}
