package popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		Thread.sleep(2000);
		driver.findElement(By.id("justAnInputBox")).click();
//The best way to handle all the issues arising is to pass selective locator path we can use this Xpath
//h3[text()='Multi Selection']/parent::div/child::div/div//span[@class='comboTreeItemTitle']=it include the parent blank also
//h3[text()='Multi Selection']/following-sibling::div//span[@class='comboTreeItemTitle']=better=right
//just changing the text of h3 work for all group of drop down	
		
		List<WebElement> optionsList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		for (WebElement e : optionsList) {
			String text = e.getText();// we not getting any kind of exception here:as we are just capturing text
			// if it is not visible it will not give anything.
			System.out.println(text);
			if (text.contains("choice 6")) {
				e.click();
				break;
			}
		}
//Thread.sleep(4000);
//to handle space
//	if(text.isEmpty()) {
//	if (text.length() == 0) {
//break;
//}

		System.out.println("*********************************");
		for (WebElement E : optionsList) {
			try {// to handle this exception write inside try catch
				E.click();// ElementNotInteractableException: element not intractable
			} catch (ElementNotInteractableException ex) {
				System.out.println("Drop Down Choices Are Finish...");
				break;
			}
//we will get exception becz we are performing something on elements here we will get exception as
//element is not visible above/after 15th element.if nothing visible where should it will click

		}

	}

}
