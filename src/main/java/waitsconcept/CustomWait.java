package waitsconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumsession.AutomationException;
import seleniumsession.ElementUtil;

public class CustomWait {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		ElementUtil eleUtil = new ElementUtil(driver);

		if (eleUtil.isPageLoaded(10)) {
			System.out.println("page is fully loaded");
		}
		// By forgotPwd = By.xpath("//p[@class='oxd-text oxd-text--p
		// orangehrm-login-forgot-header11']");//wrong xpath
		By forgotPwd = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
		// retryingElement(forgotPwd, 10).click();
		// By button = By.xpath("//button[@type='submit']");
		// retryingElement(button, 20).click();
		retryingElement(forgotPwd, 10, 2000).click();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement retryingElement(By locator, int timeOut) {
//here timeOut is related to number of attempt
		WebElement element = null;
		int attempts = 0;
//as number of iteration is not fixed we will use while loop
		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				System.out.println("element is found...." + locator + " in attempt " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found...." + locator + " in attempt " + attempts);
				try {
					Thread.sleep(500);// default polling time = 500 ms
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

			}

			attempts++;
		}

		if (element == null) {
			System.out.println("element is not found....tried for " + timeOut + " times " + " with the interval of "
					+ 500 + " milli seconds ");
			throw new AutomationException("No Such Element");
		}

		return element;
	}

	public static WebElement retryingElement(By locator, int timeOut, int intervalTime) {
//intervalTime is in milli seconds multiple of 1000 is have to supply
		WebElement element = null;
		int attempts = 0;

		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				System.out.println("element is found...." + locator + " in attempt " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found...." + locator + " in attempt " + attempts);
				try {
					Thread.sleep(intervalTime);// custom polling time
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

			}

			attempts++;
		}

		if (element == null) {
			System.out.println("element is not found....tried for " + timeOut + " times " + " with the interval of "
					+ 500 + " milli seconds ");
			throw new AutomationException("No Such Element");
		}

		return element;
	}

}