package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinksToCreateUtil {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		By langLinks = By.xpath(" //div[@id='SIvCob']/a");
		clickOnElement(langLinks, "বাংলা");
	}

	public static void clickOnElement(By locator, String eleText) {
		List<WebElement> langList = driver.findElements(locator);
		System.out.println(langList.size());
		for (WebElement e : langList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(eleText)) {
				e.click();
				break;
			}
		}
	}

}
