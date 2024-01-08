package actionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(By.id("input-email")), "poojkhatiyan@gmail.com").perform();
		act.sendKeys(driver.findElement(By.id("input-password")), "admin@123").perform();
		act.click(driver.findElement(By.xpath("//input[@type='submit']"))).perform();
	}

}
