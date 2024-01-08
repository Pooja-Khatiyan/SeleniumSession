package pseudosvgshadow;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/");
		Thread.sleep(2000);
		// driver.findElement(By.id("searchInput")).sendKeys("notification");
		// NoSuchElementException: no such element: Unable to locate element
		String search_script = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
//above script will give as html element
		JavascriptExecutor js = (JavascriptExecutor) driver;
//below we are type casting it in Selenium  WebbElement
		WebElement search = (WebElement) js.executeScript(search_script);// this script is giving html element but
																			// selenium understand only WebElement,
//so we will type caste it in webelement
		search.sendKeys("notification");

	}

}
