package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_WebTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
//		By checkbox = By.xpath("//a[text() = 'Joe.Root']//parent::td//preceding-sibling::td/input[@type = 'checkbox']");
//		By empDetails = By.xpath("(//a[text() = 'Joe.Root']//parent::td//following-sibling::td)");
//		
//		driver.findElement(checkbox).click();
//		List<WebElement> empInfo = driver.findElements(empDetails);
//		
//		for(WebElement e: empInfo) {
//			String employeeInfo = e.getText();
//			System.out.println(employeeInfo);
//		}
		
		selectEmp("Garry.White");
		selectEmp("Jordan.Mathews");
		selectEmp("Jasmine.Morgan");
		selectEmp("John.Smith");
		
		
		List<String> e1 = getEmployeeInfo("Garry.White");
		List<String> e2 = getEmployeeInfo("Jordan.Mathews");
		List<String> e3 = getEmployeeInfo("Jasmine.Morgan");
		List<String> e4 = getEmployeeInfo("John.Smith");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		//driver.quit();
		
	}
	
	
	public static void selectEmp(String empName) {
		driver.
			findElement(By.xpath("//a[text() = '"+empName+"']//parent::td//preceding-sibling::td/input[@type = 'checkbox']")).
							click();
	}
	
	
	public static List<String> getEmployeeInfo(String empName) {
		List<WebElement> infoList = driver.findElements(By.xpath("(//a[text() = '"+empName+"']//parent::td//following-sibling::td)"));
		System.out.println(infoList.size());
		
		List<String> infoValList = new ArrayList<String>();
		for(WebElement e: infoList) {
			String text = e.getText();
			infoValList.add(text);
		}
		
		return infoValList;
	}
	
	

}
