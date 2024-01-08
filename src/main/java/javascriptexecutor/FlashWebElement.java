package javascriptexecutor;
//while giving the demo we can use it
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashWebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		// WebElement ele = driver.findElement(By.id("hs-login"));
		// jsUtil.flash(ele);
		WebElement userName = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		jsUtil.flash(userName);
		userName.sendKeys("poojakhatiyan021@gmail.com");
		jsUtil.flash(pwd);
		pwd.sendKeys("admin@123");
		
//	java script click
		/**
		 * basically we have 3 click
		 * 1>normal click
		 * 2>action's click
		 * 3>javascript click
		 */
		WebElement rem = driver.findElement(By.id("remember"));
		jsUtil.clickElementByJS(rem);
		

	}

}
