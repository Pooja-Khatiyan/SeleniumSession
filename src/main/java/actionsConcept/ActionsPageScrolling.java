package actionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPageScrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions act = new Actions(driver);
//with builder pattern:page scrolling can be handle by actions class:1st we have to manually check a/c to that 
//we have to perform
		act.sendKeys(Keys.PAGE_DOWN)
		        .pause(1000)
		               .sendKeys(Keys.PAGE_DOWN)
		                     .pause(1000)
		                           .sendKeys(Keys.PAGE_UP)
		                                     .perform();
//without builder pattern
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(1000);
//for completely down :END , completely up : HOME
//ctrl(windows)/command(mac)+ arrow key down/up		
//linkdin,tweeter,facebook are infinite scrolling for that page direct support is not available in selenium
//on static pages we can perform this kind of actions	
	act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();	
	Thread.sleep(1000);
	act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();	
	Thread.sleep(1000);
	act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
	
	
//************************scrollToElement***************************//
//newly added to click particular element on the page	
	act.scrollToElement(driver.findElement(By.linkText("Help")))
	          .click(driver.findElement(By.linkText("Help"))).perform();
	
//**************************pageRefresh***************************//	
	//driver.navigate().refresh();
//through actions class
	
/**KeyDown/KeyUp:Performs a modifier key press. Does not release the modifier key - subsequent
* interactions may assume it's kept pressed. Note that the modifier key is never released implicitly -
* either keyUp(theKey) or sendKeys(Keys.NULL) must be called to release the modifier. 	
*/
act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
