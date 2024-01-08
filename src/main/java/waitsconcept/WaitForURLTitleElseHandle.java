package waitsconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForURLTitleElseHandle {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By link = By.linkText("About Us");
		driver.findElement(link).click();
		String title = waitForTitleContains("About11", 5);
		System.out.println(title);
	}
/**
 * check if supplied part of title is present or not
 * @param titleFraction
 * @param timeOut
 * @return
 */
	public static String waitForTitleContains(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println(titleFraction + ": Title value is not present...");
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * check for exact title
	 * @param title
	 * @param timeOut
	 * @return
	 */
	public static String waitForTitleIs(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println(title + ": Title value is not present...");
			e.printStackTrace();
		}
		return null;
	}
	public static String waitForUrlContains(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println(urlFraction + ": Title value is not present...");
			e.printStackTrace();
		}
		return null;
	}

	public static String waitForUrlToBe(String url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.urlToBe(url))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println(url + ": Title value is not present...");
			e.printStackTrace();
		}
		return null;
	}
	
	
}
