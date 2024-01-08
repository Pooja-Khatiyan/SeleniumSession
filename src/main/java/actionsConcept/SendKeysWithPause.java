package actionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {
//very important interview question
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement userName = driver.findElement(By.id("input-email"));
		Actions act = new Actions(driver);
		String value = "pooja@gmail.com";
		char val[] = value.toCharArray();
		for (char c : val) {
//sendKeys support only char sequence: String,String Builder,String Buffer
			act.sendKeys(userName, String.valueOf(c)).pause(500).build().perform();

		}

	}

}
