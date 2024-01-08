package actionsConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GenericContextClick {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		By rightClick = By.cssSelector("span.context-menu-one");
		By optionClick = By.cssSelector("ul>li.context-menu-icon");
		ContextClick(rightClick, optionClick, "Paste");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void ContextClick(By locator, By optionLocator, String req) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(locator)).perform();
		List<WebElement> optionList = driver.findElements(optionLocator);
		System.out.println(optionList.size());
		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(req)) {
				e.click();
				break;
			}
		}
	}

}
