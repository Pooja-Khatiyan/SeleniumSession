package selenium4feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class OpenCartRadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement baseEle = driver.findElement(By.xpath("(//label[@class='radio-inline'])[2]"));
		driver.findElement(with(By.tagName("input")).toRightOf(baseEle)).click();
		Thread.sleep(2000);
		driver.findElement(with(By.tagName("input")).toLeftOf(baseEle)).click();

	}

}
