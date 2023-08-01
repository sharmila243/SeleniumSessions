package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM_Handle_2 { //Interview Question
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("chrome://settings/");
		
//		document.querySelector("body > settings-ui").shadowRoot.querySelector("#toolbar").shadowRoot.querySelector("#search").shadowRoot.querySelector("#searchInput")
//		<input id=​"searchInput" aria-labelledby=​"prompt" autocapitalize=​"off" autocomplete=​"off" type=​"search" spellcheck=​"false" autofocus>​
		
		String script = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement search = (WebElement)js.executeScript(script);
		search.sendKeys("Profile");
		
		
		
	}

}
