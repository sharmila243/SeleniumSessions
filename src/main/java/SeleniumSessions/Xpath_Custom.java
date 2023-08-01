package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Custom {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		
		/* xpath - address of the element in the HTML DOM
		 * 1. Absolute xpath - 	html/body/div/div[2]/ul/li[4]/a - Not recommended - does not work if UI changes
		 * 2. Relative xpath 
		 * 
		 * 
		 * 1. //htmlTag[@attr = 'value']
		 * 			//input[@id = 'input-email']
		 * 			//input[@type = 'submit']
		 * 
		 * 			//input -- 14
		 * 			//input[@id] -- 6	
		 * 			//input[@id = 'input-firstname']
		 * 
		 * 2. //htmltag[@attr1 = 'value' and @attr2 = 'value' and @attr3 = 'value']
		 * 			//input[@name = 'firstname' and @placeholder = 'First Name']
		 * 
		 * 3. //htmlTag[@attr1 and @attr2 and @attr3]
		 * 			//input[@class and @name and @placeholder]
		 * 			
		 * 3. //htmlTag[contains(@attr, 'value')]
		 * 			//input[contains(@class, 'login-email')]
		 * 			
		 * 			//long value
		 * 			//Dynamic attributes/id's
		 * 				//<input id = test_123> refresh
		 * 				//<input id = test_456> refresh
		 * 				//<input id = test_900> refresh some other value, In this case I can use contains keyword
		 * 				//input[contains(@id, 'test_')] 
		 * 
		 * 4. //htmlTag[contains(@attr1, 'value') and @attr2 = 'value']
		 * 			//htmlTag[@attr1 = 'value' and contains(@attr2, 'value') and @attr3 = 'value']
		 * 
		 * 5. //htmlTag[text() = 'value']
		 * 			//h1[text() = 'Register Account'] - for header/ paragraphs
		 * 
		 * 6. //htmlTag[contains(text(), 'value')]	
		 * 			//span[contains(text(), 'business of all sizes')]
		 * 
		 * 7. //htmlTag[text() = 'value' and @attr = 'value']
		 * 			//a[text() = 'Login' and @class = 'list-group-item']
		 * 
		 * 8. //htmlTag[contains(text(), 'value') and contains(@attr1, 'value') and @attr2 = 'value']
		 * 			//a[contains(text(), 'Address') and contains(@href, 'account/address') and @class = 'list-group-item']
		 * 
		 * 9. index/position
		 * 			//input[@class = 'form-control'] - gives the list of elements if there are multiple webelements with same class name
		 * 
		 * 			(//input[@class = 'form-control']) - capture group
		 * 			(//input[@class = 'form-control'])[1] - indexes start from 1 
		 * 			(//input[@class = 'form-control'])[position() = 1] - position function
		 * 			(//input[@class = 'form-control'])[last()] - goes to the last element using last() function, there is no function called first()
		 * 			(//input[@class = 'form-control'])[last()-1] - goes to 2nd last element
		 * 			(//input[@class = 'form-control'])[last()-2] - goes to 3rd last element
		 * 			(//input[@class = 'form-control'])[last()-(last()-1)] - goes to the first element		
		*/
		
		//Class names will be separated by spaces in the DOM with attribute @class
		
		//Class name should be full when we're passing it in the xpath using the attribute @class without any contain
		//If we're passing the className using By locator className - any one of the class name will be sufficient, giving full class name here will not work out
		
		By e1 = By.xpath("//input[@class='form-control private-form__control login-email']"); //-valid
//		By e2 = By.className("login-email");//- valid 
//		By e3 = By.className("form-control private-form__control login-email"); //- InValid -- InvalidSelectorException: Compound class names not permitted
//		By e4 = By.xpath("//input[contains(@class, 'login-email')]"); //-valid
//		By e5 = By.xpath("//input[@class = 'login-email']"); //-InValid - without contains it expects full class name not partial
		
		
		driver.findElement(e1).sendKeys("test@gmail.com");
		
		
		/* Parent to Child 
		 * 	parent/child - direct/immediate child 
		 *  parent//child - indirect + direct child
		 *  
		 *  
		 *  OrangeHRM
		 *  (//select[@name = 'Country']//option) - 233 options
		 *	//div[@class = 'footer-main']//a
		 * 	//form//input[@id = 'username']
		 */
					
		
		/* Child to Parent
		 * 	child to immediate parent - backward traverse - childXpath/../../../../../../.. - //input[@id = 'username']/../../../../../../../../../../../..
		 * 	child to parent - childXpath/parent::htmlTagName - //input[@id = 'username']/parent::div
		 *  child to Gp - childXpath/ancestor::htmlTagName - //input[@id = 'username']//ancestor::form
		 *  											   - //option[contains(text(), 'Country')]/ancestor::form/parent::div/.. 
		 */
		
		
		/* GET TO KNOW US
		 * //a[text() = 'Amazon Science']//ancestor::div[@class = 'navFooterLinkCol navAccessibility']/div
		 * //a[text() = 'Amazon Science']//ancestor::ul//parent::div//div
		 * //a[text() = 'Amazon Science']//parent::li//parent::ul//parent::div//div
		 * //a[text() = 'Amazon Science']//parent::li//parent::ul//preceding-sibling::div
		 */
		
		
		/* Pseudo Elements: *label -- * is called pseudo element is because of the below text in the DOM
		 * 		::before
		 * 		::after  
		 * 	We can get the Xpath for those using basic JavaScript as we don't have direct support in Selenium
		 */
	}

}
