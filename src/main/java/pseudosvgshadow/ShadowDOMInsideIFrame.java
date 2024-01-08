package pseudosvgshadow;
/**
 * svg : only Xpath : method name for parents: local-name() :: for child: name()
 * shadow DOM : only css : method name : document.querySelector used for cssSelector 
 */
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMInsideIFrame {
//browser --- page -- iframe -- shadowDOM -- element
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(1000);
		driver.switchTo().frame("pact");
		String snacks = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\");";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement search = (WebElement) js.executeScript(snacks);
		search.sendKeys("samosa");
	}
/**
 * just for knowledge consider playwright
 * browser -- page -- shadow DOM -- e1
 * in playwright we don;t go inside the shadowdom ,there is a auto mechanism(auto piercing inside the shadow DOM)
 * for shadow DOM based application use playwright
 * 
 */
}
