package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pseudo_Element_Handle {
	//::before, ::after - Pseudo classes in HTML and any elements associated with it are called Pseudo elements
		
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//*First Name - is the mandatory field, how'll we check that?
			//It is mandatory because of *
			//Inspect - ::before 
			//written under <label	 ::before 		First Name 		</label>
			//if we apply .getText() on the label, we don't get that ::before/* - we get only the text, which is First Name
			//So then I cannot verify if that's the mandatory field
			//So what do we do?? - These are not hidden, these are Pseudo elements
		//We have to use JSE
		
		//Selenium says that we cannot give you each and every method 	
			//If you're doing something inside browser (in console or script that we're running) and want to execute same script with Selenium java/python/ruby etc
			//then we give you the support of JSE
		//JavaScriptExecutor: is an existing interface available in Selenium
			//This help me to execute the JavaScript code
		
		//Cast the driver --> convert to JSE and then store it in the reference variable of JSE
		//because JSE is an interface we cannot create the object of an interface 
		
		//webDriver is also an interface and JSE is also an interface 
			//ChromeDriver --> Chromium --> RemoteWebDriver is the child of child of WebDriver interface and ALSO JSE interface 
			//RemoteWebDrievr class implements WebDriver, JSE;
		
		//conversion of driver  --> JSE
		
		
		
		//add a return keyword whenever script is returning something at the beginning of the script
		String script = "return window.getComputedStyle(document.querySelector(\"label[for = 'input-email']\"), '::before').getPropertyValue('content')";

		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
//		js.executeScript(script); //this returns JavaScript String so we cannot store it in a string 
			//convert to java String using toString() method
		
		String mandatory_text = js.executeScript(script).toString();
		System.out.println(mandatory_text);
			if(mandatory_text.contains("*")) {
				System.out.println("Element is mandatory element");
			}
		
		
		checkElementIsMandatory("telephone");
			
		
		driver.quit();
	}
	
	public static boolean checkElementIsMandatory(String text) {
		
		String script = "return window.getComputedStyle(document.querySelector(\"label[for = 'input-"+text+"']\"), '::before').getPropertyValue('content')";
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		String mandatory_text = js.executeScript(script).toString();
		System.out.println(mandatory_text);
			if(mandatory_text.contains("*")) {
				System.out.println("Element is mandatory element");
				
				return true;
			}
			
			return false;
	}
	
	
	
	//How to handle Pseudo Elements?
		//Pseudo elements are always written with Pseudo classes, pseudo classes are which starting with :: and does not have any kind of Information
		//so we have to use 
	
		//window.getComputedStyle(document.querySelector(\"label[for = 'input-email']\"), '::before').getPropertyValue('content')
			//window . getComputedStyle of '::before' which is in the CSS Selector of label[@attr = 'value']
					//to get the hidden property use - get property value of '::before' -> getPropertyValue('content')
		

}
