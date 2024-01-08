package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEmpty {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	/** with find element
	 * Returns:The first matching element on the current page
	 * Throws:NoSuchElementException - If no matching elements are found
	 */
	
	//driver.findElement(By.xpath("//input[@class='pooja']")).sendKeys("tom@gmail.com");
	//NoSuchElementException: no such element: Unable to locate element == as synatx wise is correct
	//driver.findElement(By.xpath("//input[@class....'pooja']")).sendKeys("tom@gmail.com");
/** as syntax is incorrect
 * InvalidSelectorException: invalid selector: is not a valid XPath expression
 */
	
	
/**	
 * with find elements
 * Returns:A list of all matching WebElements, or an empty list if nothing matches
 */
	
List<WebElement> elist=driver.findElements(By.xpath("//input[@class='pooja']"));	
	System.out.println(elist);//give EMPTY LIST
	System.out.println(elist.size());// GIVE SIZE AS 0
	}

}
