package selenium4feature;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightSidePrivacyPolicy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement baseEle = driver.findElement(By.linkText("Privacy Policy"));
		driver.findElement(with(By.tagName("input")).toRightOf(baseEle)).click();

	}

}
