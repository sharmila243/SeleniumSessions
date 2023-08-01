package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_CssSelector_Custom {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//No special characters available for other attributes in CSS other than for id and class
		//CSS works only on attributes not on the texts
		
		/* For id - #id
		 * 		1. #input-email
		 * 		2. #input-password
		 * Id with tagName - tag#id
		 * 		1. input#input-password
		 * 		2. input#input-email
		 * 
		 * 
		 * 
		 * For class - .className 
		 * 		1. .form-control
		 * className with tagName - tag.class
		 * 		1. input.form-control
		 * Multiple classes separated by space - .c1.c2.c3.c4.c5.. 
		 * 		1. input.form-control.private-form__control.login-email
		 * 		2. input.private-form__control.login-email
		 * 		3. input.login-email.form-control.private-form__control
		 * 		4. input.login-email - unique
		 * 
		 * 
		 * 
		 * id and class together - sequence does not matter
		 * 		1. .class#id
		 * 		2. #id.class
		 * Using tagName
		 * 		3. tag.class#id
		 * 				- input.form-control#input-email
		 * 		4. tag#id.class
		 * 				- input#input-email.form-control
		 * 
		 * 		5. Multiple classes and id - sequence does not matter
		 * 				- input.form-control#username.login-email
		 * 				- input#username.login-email.form-control.private-form__control
		 * 				- input.login-email#username.form-control.private-form__control
		 * 
		 * 
		 * 
		 * Other Attributes - a) CSS and b) Xpath
		 * 		1. a) tagName[attr = 'value']
		 * 				- input[placeholder = 'E-Mail Address']
		 * 		   b) //tagName[@attr = 'value']
		 * 				-//input[@placeholder = 'E-Mail Address']
		 * 
		 * 		2. Multiple attributes 
		 * 		   a) tagName[attr1 = 'value'][attr2 = 'value']#id.class 
		 * 				- input[type = 'text'][name = 'email']#input-email.form-control 
		 * 				- input.form-control#input-email[name][placeholder]
		 * 				- input[type][name][placeholder]
		 * 				- [id] - all the webElements with attribute ID - no hardCoding
		 * 				- input[id]
		 * 		   b) //tagName[@attr1 = 'value' and @attr2 = 'value' and @attr3 = 'value']
		 * 				- //*[@id] - all the webElements with attribute ID 
		 * 
		 * 
		 * 
		 * No text() function in CSS - limitation of CSS
		 * 
		 * 
		 * 
		 * CSS and Xpath
		 * Contains - *
		 * 		1. a)input[placeholder *= 'Address']
		 * 		   b) //input[contains(@placeholder, 'Address')]
		 * 
		 * starts-with - ^
		 * 		1. a)input[placeholder ^= 'E']
		 * 		   b) //input[starts-with(@placeholder, 'E-Mail')]
		 * ends-with - $
		 * 		1. a) - input[placeholder $= 'Address']
		 * 			  - input[placeholder $= 'Name']
		 * 		   b) No ends-with function in Xpath - Removed - NA 
		 * 
		 * Different Combinations
		 * 			- input[placeholder *= 'Address'][name]#id.class
		 * 			- input[placeholder *= 'Address'][id = 'input-email']
		 * 			- input[placeholder *= 'E'][class ^= 'form']#input-email[placeholder $= 'Address']
		 * 			- input[placeholder *= 'E'][class ^= 'form']#input-email[placeholder $= 'Address'][name = 'email']
		 * 
		 * 
		 * 
		 * Parent to Child:  '>'
		 * 		1. select#Form_getForm_Country > option - immediate direct child elements
		 * 		   select#Form_getForm_Country option - space separated - direct and indirected child elements (Xpath practice page WebTable, entire values we can get)
		 * 		
		 * 		2. ORANGEHRM
		 * 			- form > div --> 8 following child (direct)
		 * 			- form div --> 22 direct and indirect
		 * 		
		 * 		3. Xpath Practice page - both will give the same result
		 * 			- table#resultTable > tbody > tr > td
		 * 			- table#resultTable td 
		 * 
		 * 
		 * 		
		 * Child to Parent: Not Available
		 * Child to GrandParent: Not Available
		 * Preceding sibling: Not Available
		 * 
		 * 
		 * 
		 * Following-sibling: '+' (direct)         '~'(all = direct and indirect)
		 * 		1. label[for = 'input-email'] + input
		 * 
		 * 
		 * 
		 * Indexing in CSS:
		 * 		- select#Form_getForm_Country option:first-child
		 * 		- select#Form_getForm_Country option:last-child
		 * 		- select#Form_getForm_Country option:nth-child(10)
		 * 		- select#Form_getForm_Country option:nth-last-child(2)  last 2nd
		 * 		- select#Form_getForm_Country option:nth-last-child(3)
		 * 		- select#Form_getForm_Country option:nth-last-child(6)
		 * 		- select#Form_getForm_Country option:nth-child(odd) 	 odd
		 * 		- select#Form_getForm_Country option:nth-child(even)	 even
		 * 		- select#Form_getForm_Country option:nth-child(2n)		 alternate
		 * 		- select#Form_getForm_Country option:nth-child(4n)		 4 times one another
		 * 		- select#Form_getForm_Country option:nth-child(n+4) 	 starts from 4th and then continue
		 * 		- select#Form_getForm_Country option:nth-child(4n+1)	 n = 0,1,2,3,4... indexes
		 * 
		 * 
		 * 
		 * not in CSS:
		 * 		- input.form-control:not([name = 'search'])
		 * 		- input.form-control:not(.input-lg)
		 * 		- input.form-control:not(.input-lg):not(#input-password)   -  	exclude one by one adding extra not():not():not()... 
		 * 
		 * 		
		 * 
		 * comma in CSS:
		 * 		- Kind of sanity check - to check if the important elements are present are there or not 
		 * 		- instead of writing 4 different By locators 
		 * 		- we can write it in a single locator separated by comma 
		 * 			- input#username, input#password, span#checkbox-content-4, i18n-string[data-key = 'login.form.remember'], button#loginBtn
		 * 
		 */
		
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		By impElements = By.cssSelector("input#username, input#password, i18n-string[data-key = 'login.form.remember'], button#loginBtn");
		int size = driver.findElements(impElements).size();
		
		if(size == 4) {
			System.out.println("All the important elements are present: PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		driver.quit();
		
	}
	
	
	
	/* Comparison						XPATH					CSS
	 * 
	 * Syntax							Complex					Simple
	 * text()							YES						NO		
	 * AND								YES						YES
	 * OR								YES						YES, Comma
	 * Forward (P to C)					YES						YES	
	 * Backward (C to P, GP)			YES						NO
	 * Following-sibling				YES						YES			
	 * preceding-sibling				YES						NO
	 * not()							NO						YES
	 * indexing							YES						YES
	 * Capture group					YES						NO
	 * performance						Good					Good
	 * starts-with (^)					YES						YES	
	 * contains (*)						YES						YES	
	 * ends-with ($)					NO						YES
	 * WebTable							EASY					Limited
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
