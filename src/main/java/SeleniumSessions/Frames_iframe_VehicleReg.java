package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames_iframe_VehicleReg {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		
		driver.findElement(By.xpath("//img[@title = 'Vehicle-Registration-Forms-and-Examples']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, frame-one)]")));
		
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Title");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Hyderabad");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("2023-07-24");
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("Description");
		
		driver.findElement(By.className("file_upload")).sendKeys("/Users/guddu/Vedaabdhija FirstSem.pdf");
		
		String text = driver.findElement(By.xpath("//div[@id = 'q7']//div[@class = 'segment_header']/h1")).getText();
		System.out.println(text);
		
		driver.findElement(By.name("RESULT_TextField-8")).sendKeys("Sharmila");
		driver.findElement(By.name("RESULT_TextField-9")).sendKeys("Bhargav");
		driver.findElement(By.name("RESULT_TextField-10")).sendKeys("Irving");
		driver.findElement(By.name("RESULT_TextField-11")).sendKeys("NY");
		driver.findElement(By.name("RESULT_TextField-12")).sendKeys("NY");
		
		WebElement stateDropDown = driver.findElement(By.xpath("//select[@id = 'RESULT_RadioButton-13']"));
		Select select = new Select(stateDropDown);
		select.selectByVisibleText("New York");
		
		driver.findElement(By.name("RESULT_TextField-14")).sendKeys("441234");
		driver.findElement(By.name("RESULT_TextField-15")).sendKeys("51452313234");
		driver.findElement(By.name("RESULT_TextField-16")).sendKeys("sharmila213@gmail.com");
		
		driver.switchTo().defaultContent();
		
		driver.quit();
	}
	
	
	

}
