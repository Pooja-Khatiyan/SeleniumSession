package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent window
		Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[3]")).click();//a[contains(@href,'twitter')]:child
//DRIVER IS STILL ON PARENT WINDOW: there is a window id which is internally maintain by the browser
/**window id is available in the form of String ,List is a order based collection and Set is also part of collection
*coming from java.util package
*Properties of Set: 1->doesn't contain duplicate(maintain unique value) values but in List it is allowed to maintain duplicate values
*2->Set is always non order based doesn't maintain any order but List is ordered based
*getWindowHandles is a method available in selenium to use fetch the window id
**/

//1st part**************FETCHING THE WINDOW ID********************//
Set<String>handles=	driver.getWindowHandles();	
/**
 * .iterator is another method in selenium helps in iterating non order based collections,Set is one of them
 * it is also import from java.util:
 * iterator always pointing just above the object
 */
Iterator<String>it =handles.iterator();	//pointed just above/ previous windows memory address
/**
 * .next(): do 2 thing : go to the next memory address as well as capture the text
 */
String parentWindowId=it.next();//to move the iterator to current memory location;the next element in the iteration
System.out.println("Parent Window Id: " + parentWindowId );
String childWindowId=it.next();
System.out.println("Parent Child Id: " + childWindowId );
//we have applied driver.getWindowHandles = so it go from parent to child in the same fashion it will maintain the window id
//1st parent window id go to the 1st segment and child on 2nd segment
//2nd part*********************SWITCHING WORK************************//
driver.switchTo().window(childWindowId);
//this id are also called handles
System.out.println("Child Window URL: " + driver.getCurrentUrl());
System.out.println("Child Window Title: " + driver.getTitle());
driver.close();//child window will be closed here
//for moving driver back to parent window
driver.switchTo().window(parentWindowId);
System.out.println("Parent Window URL: " + driver.getCurrentUrl());
//to close the window now we can use any of the 2 methods
driver.quit();
	}

}
