package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM_Handle {
		//Shadow DOM is new in the HTML World for Security purpose
	
	//We're going to See, if element is available not only inside the frame but also inside the Shadow DOM	
		//Not hidden 
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		Thread.sleep(5000);
		
		//Check if there is any #shadow-root (open)  - should be open ALWAYS
			//all the child elements of shadow-root are shadow DOM elements
		//Developers create shadow-root for security reasons
			//there is no method called driver.switchTo().shadow-root
			//Use JSE
		
		//browser --> TBody --> ShadowDom --> ShadpwDom --> E1
		
		//xpath - does not work for shadow DOM elements - there's no support
		
		//go to the DOM --> go the webElementScript --> right click --> copy JS path --> paste in console of the DOM
			//document.querySelector("#userName").shadowRoot.querySelector("#app2").shadowRoot.querySelector("#pizza")
				//document . #Username --> ShadowRoot --> in ShadowRoot, #app2 --> shadowRoot --> #pizza (this is where we right clicked on)
				//This gives the HTML DOM of that element
					//result --> <input type=​"text" id=​"pizza" placeholder=​"Enter pizza name">​
		
		String script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//HTML WebElement is the result 
			//we've to convert it in to the WebElement so that we can use sendkeys, click methods
		
		WebElement pizza_ele = (WebElement)js.executeScript(script);
		pizza_ele.sendKeys("Veg Pizza");
		

	}

}
