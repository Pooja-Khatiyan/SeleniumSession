package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelLoginPreceding {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String text = driver.findElement(By.xpath("//input[@name='email']/preceding-sibling::label")).getText();
		System.out.println(text);
	}

}
