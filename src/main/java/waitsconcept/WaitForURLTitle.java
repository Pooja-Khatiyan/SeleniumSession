package waitsconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForURLTitle {
//non web element : explicitly wait is applied here
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By link = By.linkText("About Us");
		driver.findElement(link).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		if (wait.until(ExpectedConditions.titleContains("About"))) {
//			System.out.println(driver.getTitle());
//		} else {
//			System.out.println("Title value is not present...");
//		}
//String title = waitForTitleContains("About", 5);	
//	System.out.println(title);	
	String title1 = waitForTitleContains("About11", 5);	
	System.out.println(title1);
	}

	public static String waitForTitleContains(String fractionPart, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
//in title1 case if will not satisfied it will throw exception and terminate the program
//driver will never come inside the else part
		if (wait.until(ExpectedConditions.titleContains(fractionPart))) {
			return driver.getTitle();
		} else {
			System.out.println("Title value is not present...");
		}
		return null;
	}
}
