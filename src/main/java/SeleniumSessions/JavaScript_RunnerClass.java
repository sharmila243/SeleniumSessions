package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_RunnerClass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(10000);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);

		System.out.println(jsUtil.getTitleByJS());
		
		
		jsUtil.generateJSAlert("HIIIIII");
		
		
		String pageText = jsUtil.getPageInnerText();
		System.out.println(pageText);
			if(pageText.contains("Calls & Voice")) {
				System.out.println("PASS");
			}else {
				System.out.println("FAIL");
			}
		
		
		jsUtil.scrollPageDown();
		Thread.sleep(1000);
		jsUtil.scollPageUp();
		Thread.sleep(1000);
		jsUtil.scrollPageDown("1000");
		Thread.sleep(1000);
		jsUtil.scrollIntoView(driver.findElement(By.xpath("//h2[text() = 'New arrivals in Toys']")));
		Thread.sleep(5000);

		jsUtil.drawBorder(driver.findElement(By.xpath("//h2[text() = 'For your Fitness Needs']")));
		jsUtil.drawBorder(driver.findElement(By.xpath("//img[@src = 'https://m.media-amazon.com/images/I/613+CG1dP1L._AC_SY400_.jpg']")));
		Thread.sleep(5000);
		
		driver.quit();

	}
	
	

}
