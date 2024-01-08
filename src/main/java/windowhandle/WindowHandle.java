package windowhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
//In selenium 4 a special method is given
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent window
		String parentId = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);// it open new tab and driver automatically switch to that window
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();// now after this driver is lost
		driver.switchTo().window(parentId);
		driver.switchTo().newWindow(WindowType.WINDOW);// to open new window
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.close();// driver lost
		driver.switchTo().window(parentId);
//************************************************************//
		/**
		 * till now 3 type of switches we have seen
		 * 1)switch.window
		 * 2)switch.frame
		 * 3)switch.alert
		 */

	
	}

}
