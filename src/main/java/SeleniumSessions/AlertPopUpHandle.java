package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
	
	//Alert - JavaScrip Alert/ JavaScrip PopUp	
		//Any app - Console - Type, alert("This is an alert");
		//webPage - shows a popUp html.com says - This is an alert - with a button OK
	
	//JavaScrip Alert - coming because of javaScript method called Alert
	
	//we cannot inspect alert directly because it's not a webElement it's coming because of the javaScript inside the browser - Which javaScript alert() method
		//Instead we need to switchToAlert from Page - either accept/dismiss the alert and the driver automatically comes to the webPage 
	
	//3 types 
		//1. Normal Alert
		//2. Prompt Alert - Eg. asks us to enter the user ID / do something
		//3. Confirm Alert - Eg. Are you sure you want to delete the user?/ Are you sure you want to submit?
	
	//Any chance of getting multiple alerts at the same time? - NO 
	//If there's an alert it freezes the entire page till we either accept/ dismiss the alert (handle the alert	)
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//1. 
		driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		
		//for a normal alert if we write 
//		alert.dismiss(); //accepts the alert on webPage acc to the alert.accept and because of this line it throws NoAlertPresentException
		
		WebElement result = driver.findElement(By.xpath("//p[@id = 'result']"));
		String resultText = result.getText();
		
		System.out.println(alertText);
		System.out.println(resultText);
		
		
		//2. Confirm Alert
		driver.findElement(By.xpath("//button[text() = 'Click for JS Confirm']")).click();
		Alert alert2 = driver.switchTo().alert();
		String confirmAlertText = alert2.getText();
		alert2.accept();
		System.out.println(confirmAlertText);
		
		WebElement confirmResult = driver.findElement(By.xpath("//p[@id = 'result']"));
		String confirmResultText = confirmResult.getText();
		System.out.println(confirmResultText);
		
		
		//3. Prompt Alert
		driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']")).click();
		Alert alert3 = driver.switchTo().alert();
		String promptText = alert3.getText();
		System.out.println(promptText);

		alert3.sendKeys("Testing");
		alert3.accept();
		
		WebElement promptResult = driver.findElement(By.xpath("//p[@id = 'result']"));
		String promptResultText = promptResult.getText();
		System.out.println(promptResultText);
		
		String actTextEntered = promptResultText.split(":")[1].trim();
		System.out.println(actTextEntered);
		
		driver.quit();
	}

}
