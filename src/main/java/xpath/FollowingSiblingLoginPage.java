package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingSiblingLoginPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
driver.findElement(By.xpath(" //label[text()='E-Mail Address']/following-sibling::input"));
//to be more specific we can add property/attribute=//label[text()='E-Mail Address']/following-sibling::input[@name='email']
	}

}
