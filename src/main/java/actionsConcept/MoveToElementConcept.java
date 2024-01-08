package actionsConcept;
//mouse over- move to element
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		Actions act = new Actions(driver);
		By parentMenu = By.cssSelector("a.menulink");
		WebElement parentMenuEle = driver.findElement(parentMenu);
		act.moveToElement(parentMenuEle).perform();// A convenience method for performing the actions without calling
													// build() first.
//act.moveToElement(parentMenuEle).build().perform();//it will also work
//act.moveToElement(parentMenuEle);//in this case it will through exception on next step 
//as element is not visible:NoSuchElementException: no such element: Unable to locate element:
//moveToElement:Moves the mouse to the middle of the element :Actions class
//build():Generates a composite action containing all actions so far : Action class
//build&perform : Action class
//to click on courses: preference always given to visible text	
		//Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();

	}

}
