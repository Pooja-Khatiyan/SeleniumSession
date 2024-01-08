package pseudosvgshadow;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMHandle {
//browser -- page -- shadowDOM -- element
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(10000);
		String pizza_script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\"); ";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement pizza = (WebElement)js.executeScript(pizza_script);
		pizza.sendKeys("veg corn pizza");
	}

}
