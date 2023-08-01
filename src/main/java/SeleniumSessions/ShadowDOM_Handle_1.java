package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM_Handle_1 { //iframe inside ShadowDOM
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		Thread.sleep(5000);
		
		//Browser --> Page --> ShadowDOM --> iFrame --> webElement
		
		//document.querySelector("#userName").shadowRoot.querySelector("#pact1")
				//<iframe id=​"pact1" src=​"https:​/​/​selectorshub.com/​input-box-copy/​" height=​"80px" style=​"border:​none;​">​…​</iframe>​
				
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		//JS path for iframe
		String script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		
		//converting the result HTML WebElement --> WebElement (which is actually iframe)
		WebElement ele = (WebElement)js.executeScript(script);
		
		//switching to the iframe, we already have the WebElement of the iframe, pass it as the parameter
		driver.switchTo().frame(ele);
		
		//Enter the value using sendKeys
		driver.findElement(By.xpath("//input[@id = 'glaf']")).sendKeys("Destiny");
		
		driver.quit();
		
	}

}
