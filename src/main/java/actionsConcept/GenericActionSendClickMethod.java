package actionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GenericActionSendClickMethod {
static WebDriver driver;
	public static void main(String[] args) {
	driver= new ChromeDriver();
	

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
public static void doActionsSendKeys(By locator, String value) {
	Actions act = new Actions(driver);
	act.sendKeys(getElement(locator), value).perform();
}
public static void doActionsClick(By locator) {
	Actions act = new Actions(driver);
	act.click(getElement(locator)).perform(); 
}
}
