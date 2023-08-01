package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import CustomException.FrameworkException;

public class Frames_iframe_VehicleRegistration {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		By clickOnFrameLocator = By.xpath("//img[@title = 'Vehicle-Registration-Forms-and-Examples']");
		By switchingFrameLocator = By.xpath("//iframe[contains(@id, frame-one)]");
		By title = By.id("RESULT_TextField-1");
		By location = By.id("RESULT_TextField-3");
		By proposedDate = By.id("RESULT_TextField-4");
		By description = By.id("RESULT_TextArea-5");
		By fileUpload = By.className("file_upload");
		By headerInfo = By.xpath("//div[@id = 'q7']//div[@class = 'segment_header']/h1");
		
		By fn = By.name("RESULT_TextField-8");
		By ln = By.name("RESULT_TextField-9");
		By streetAddress = By.name("RESULT_TextField-10");
		By city = By.name("RESULT_TextField-12");
		By dropDown = By.xpath("//select[@id = 'RESULT_RadioButton-13']");
		By pincode = By.name("RESULT_TextField-14");
		By phnumber = By.name("RESULT_TextField-15");
		By email = By.name("RESULT_TextField-16");
		
		clickOnFrame(clickOnFrameLocator);
		doSwitchToFrame(switchingFrameLocator);
		
		doSendkeys(title, "VehicleReg");
		doSendkeys(location, "Texas");
		doSendkeys(proposedDate, "2023-07-23");
		doSendkeys(description, "Vehicle Registration form");
		doUploadFile(fileUpload, "/Users/guddu/Vedaabdhija FirstSem.pdf");
		
		getheaderInformation(headerInfo);
		
		doSendkeys(fn, "Sharmila");
		doSendkeys(ln, "Bashakarla");
		doSendkeys(streetAddress, "Irving");
		doSendkeys(city, "Texas");
		selectDropDownByVisibleText(dropDown, "Texas");
		
		doSendkeys(pincode, "44136");
		doSendkeys(phnumber, "5141234123");
		doSendkeys(email, "sharmila243@gmail.com");
		
		
		driver.quit();
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void clickOnFrame(By locator) {
		getElement(locator).click();
	}
	
	public static void doSwitchToFrame(By locator) {
		driver.switchTo().frame(getElement(locator));
	}
	
	public static void doUploadFile(By locator, String locationOfTheFile) {
		getElement(locator).sendKeys(locationOfTheFile);
	}
	
	public static void getheaderInformation(By locator) {
		String text = getElement(locator).getText();
		System.out.println(text);
	}
	
	public static void selectDropDownByVisibleText(By locator, String stateName) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(stateName);
	}
	
	public static void doSendkeys(By locator, String value) {
		
		if(value == null) {
			throw new FrameworkException("StringValueCannotBeNull");
		}
		
		getElement(locator).sendKeys(value);
	}
	
	

}
