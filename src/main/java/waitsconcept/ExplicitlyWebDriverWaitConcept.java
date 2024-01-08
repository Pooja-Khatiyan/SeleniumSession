package waitsconcept;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWebDriverWaitConcept {
//wait(until();)[interface] ---> fluent wait [class][until(){}+other methods]--> WebDriverWait (class)
static WebDriver driver;	
	public static void main(String[] args) {
 driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//i want to apply some wait for the email address only not for others for that we can create object of WebDriver wait class 
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));	
//for timeout we will use duration class.	
By email_id=By.id("input-email");

//*******************************IMPORTANT******************************//

/**
 * By email_id=By.id("input-email11");give TimeoutException with below message
 * waiting for presence of element located by: By.id: input-email11 (tried for 10 second(s) with 500 milliseconds interval)
 * along with it through NoSuchElementException: no such element: Unable to locate element
 * this is one more difference between Implicitly Wait & Explicitly Wait 
 * if after 10 secs no element will present it will give : TimeOutException + NoSuchElementException
 * 
 */


By pwd=By.id("input-password");
By login_Button=By.xpath("//input[@value='Login']");
By link=By.linkText("About Us");
	WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(email_id));
	email_ele.sendKeys("pooja@gmail.com");
//Two methods of creating WebElement:
	   //1>driver.findElement
	   //2>wait.until[through WebDriverWait]
	
//applied time is 10 sec: if ele visible in 2 secs : ignored secs are 8	
//for below element no wait will be applied as we didn't specified any explicit wait here
	driver.findElement(pwd).sendKeys("admin@123");
	driver.findElement(login_Button).click();//this is the better way of writing the wait instead of ImplicitlyWait
	//waitForPresenceOfElement(link,10).click();
	waitForVisibilityOfElement(link,5).click();
	}
	/**
	 * whenever we open any page DOM will come 1st
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible on the page.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitForPresenceOfElement(By locator,int timeout) {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));	
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}
	/**
	 * An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	
	public static List<WebElement> waitForPresenceOfElements(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));	
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}	

	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeout
	 * @return
	 * This method is better from the user point of view as it have visibility
	 */
	public static WebElement waitForVisibilityOfElement(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));	
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}	
	/**
	 * An expectation for checking that all elements present on the web page that match the locator are visible.
	 * Visibility means that the elements are not only displayed but also have a height and width that is greater than 0.
	 * @param locator
	 * @param timeout
	 * @return List<WebElement>
	 */

	public List<WebElement> waitForVisibilityOfElements(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public static void doClickWithWait(By locator, int timeout) {
		waitForVisibilityOfElement(locator,timeout).click();
	}
	public static void doSendKeysWithWait(By locator, int timeout, String value) {
		waitForVisibilityOfElement(locator,timeout).sendKeys(value);;
	}
	
	
}
