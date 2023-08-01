package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_DropDown_Without_SelectTag {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		driver.findElement(By.xpath("//div[text() = 'Select Option']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@id, 'react-select-2-option')]"));
		System.out.println(list.size());
		for(WebElement e: list) {
			String text = e.getText();
			System.out.println(text);
				if(text.contains("A root option")) {
					e.click();
					break;
				}
		}
		
		driver.quit();
		

	}

}
