package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import CustomException.FrameworkException;

public class Select_Mutiple_DropDown_SelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		By locator = By.xpath("//select[@multiple]");
		
//		WebElement dropDownElement = driver.findElement(By.xpath("//select[@multiple]"));
//		Select select = new Select(dropDownElement);
		
//		boolean multiple = select.isMultiple();
//		if(multiple == true) {
//			System.out.println("MultiSelect is possible");
//			
//			select.selectByVisibleText("Lesser flamingo");
//			select.selectByValue("Chilean");
//			select.selectByVisibleText("James's flamingo"); //If it was James"s then we need to use scape character - James\"s
//		}
		
//		select.deselectByVisibleText("Chilean flamingo");
//		select.deselectAll();
		
		
		checkIfMultiSelectIsPossible(locator);

		selectMultipleOptionsByVisibleText(locator, "Lesser flamingo");
		selectMutipleOptionsByValue(locator, "Chilean");
		selectMultipleOptionsByVisibleText(locator, "James's flamingo");
		
		deselectOptionByVisibleText(locator, "Lesser flamingo");
		deselectAll(locator);
		
		
		driver.quit();
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void checkIfMultiSelectIsPossible(By locator) {
		Select select = new Select(getElement(locator));
			if(select.isMultiple() == true){
				System.out.println("Muti Select is possible -- PASS");
			}
			else {
				System.out.println("Multi selection -- FAIL");
				throw new FrameworkException("MutiSelectIsNotPossibleException");
			}
	}
	
	public static void selectMultipleOptionsByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
		
	}
	
	public static void selectMutipleOptionsByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	
	}
	
	public static void deselectOptionByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.deselectByVisibleText(visibleText);
		
	}
	
	public static void deselectOptionByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.deselectByVisibleText(value);
		
	}
	
	public static void deselectAll(By locator) {
		Select select = new Select(getElement(locator));
		select.deselectAll();
		
	}

}
