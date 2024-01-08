package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawBorderAroundElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement element = driver.findElement(By.xpath("//h2[text()='New Customer']"));
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		jsUtil.drawBorder(element);//element could be anything
		
		/**
		 * while giving presentation if we want to highlight something we can do it like that
		 */
		driver.get("https://app.hubspot.com/login");
		WebElement ele=	driver.findElement(By.id("hs-login"));
		jsUtil.drawBorder(ele);
		
		
	}

}
