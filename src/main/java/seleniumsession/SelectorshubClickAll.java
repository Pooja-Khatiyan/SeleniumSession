package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorshubClickAll {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		List<WebElement> list = driver.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord')]"));
		for (WebElement e : list) {
			e.click();
		}
	}

}
