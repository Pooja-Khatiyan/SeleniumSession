package actionsConcept;
//FAMOUS INTERVIEW QUESTION
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GenericMethodActionSendKeysPause {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement userName = driver.findElement(By.id("input-email"));
		String val = "vihan@gmail.com";
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	//purpose of pause to enter the value one by one
	//you can say pause():>selenium method = Thread.sleep():>java method,Thread is a class in java
	public static void doActionsSendKeysWithPause(By locator, String value) {
		Actions act = new Actions(driver);
		char val[] = value.toCharArray();
		for (char c : val) {
			 act.sendKeys(getElement(locator), String.valueOf(c)).pause(500).build().perform();
	//keep it pause(500) don't pass as a parameter if someone pass it as 5000 ,it become very slow
		}
	}
}
