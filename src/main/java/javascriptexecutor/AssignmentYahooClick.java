package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//important Notice(observation)at this click normal click and action click won't work ,here only js click work
//there is no reason behind it simply it is not working
public class AssignmentYahooClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
//		driver.findElement(By.id("persistent")).click();//ElementNotInteractableException
//		Actions act = new Actions(driver);//no exception but not working
//		act.click(driver.findElement(By.id("persistent"))).perform();
	
		WebElement tick = driver.findElement(By.id("persistent"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		JavaScriptUtil jUtil = new JavaScriptUtil(driver);
		jUtil.clickElementByJS(tick);
		jUtil.sendKeysUsingWithId("login-username", "pooja@gmail.com");//use only if other methods are not working
	}

}
/**one more use case of jsclick: if we are getting ElementNotInteractableException with normal click and 
 * ElementNotInterceptableException with action's click or if element is on page and we are not able 
 * to reach there with selenium then we can use this click.but avoid as much not recommended
 * 
 * 
 * 
 */
