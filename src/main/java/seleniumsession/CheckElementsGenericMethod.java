package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementsGenericMethod {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By logo = By.cssSelector(".img-responsive");

		if (checkSingleElementPresent(logo)) {
			System.out.println("logo is pass");
		} else {
			System.out.println("FAIL");
		}

	}

	public static boolean checkSingleElementPresent(By locator) {
		return driver.findElements(locator).size() == 1 ? true : false;
	}
	public static boolean checkMultipleElementPresent(By locator) {
		return driver.findElements(locator).size() >0 ? true : false;
		//return driver.findElements(locator).size() >=1 ? true : false;
	}
}
