package waitsconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitWithIntervalTime {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email_id = By.id("input-email");
		By email_id1 = By.id("input-email11");
		By pwd = By.id("input-password");
		By login_Button = By.xpath("//input[@value='Login']");
		By link = By.linkText("About Us");
		//without sleep or Interval Time/Polling Time
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// object:1--1st constructor
//another object
		/**
		 * sleep:Interval Time/Polling Time ; by default polling time is 500 millisec or 0.5 sec
		 */
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10), Duration.ofSeconds(2));
	//wait1.until(ExpectedConditions.visibilityOfElementLocated(email_id)).sendKeys("pooja@gmail.com");
	
		
		
	/**
	 * TimeoutException: Expected condition failed: waiting for visibility of element located by By.id: input-email11
	 *  (tried for 10 second(s) with 2000 milliseconds interval)
	 */
		wait1.until(ExpectedConditions.visibilityOfElementLocated(email_id1)).sendKeys("pooja@gmail.com");
	
	
	
	}

}
