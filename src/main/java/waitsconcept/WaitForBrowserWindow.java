package waitsconcept;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForBrowserWindow {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		By twitter = By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[3]");
		// waitForVisibilityOfElement(twitter, 10).click();TimeoutException:if we remove
		// this line :it doesn't giving bye
		/**
		 * if timeout is done it will always give us exception not the else condition
		 * (bye):TimeoutException
		 */
		waitForVisibilityOfElement(twitter, 10).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// if (wait.until(ExpectedConditions.numberOfWindowsToBe(2))) {
		if (checkNewWindowExist(5, 2)) {// generic method
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			String parentWindowId = it.next();
			System.out.println("parent window id: " + parentWindowId);
			String childWindowId = it.next();
			System.out.println("child window id: " + childWindowId);
			driver.switchTo().window(childWindowId);
			System.out.println("child window URL:" + driver.getCurrentUrl());
			driver.switchTo().window(parentWindowId);
			System.out.println("parent window URL:" + driver.getCurrentUrl());
		} else {
			System.out.println("bye");
		}

	}

	public static boolean checkNewWindowExist(int timeOut, int expectedNumberOfWindows) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.numberOfWindowsToBe(expectedNumberOfWindows))) {
				return true;
			}
		} catch (TimeoutException e) {
			System.out.println("number of windows are not same...");
		}
		return false;
	}

	public static WebElement waitForVisibilityOfElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
