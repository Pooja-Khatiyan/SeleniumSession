package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrencyButton {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By link = By.xpath("//form[@id='form-currency']//ul[@class='dropdown-menu']//button");

		List<WebElement> currencyList = driver.findElements(link);
		System.out.println(currencyList.size());
		List<String> eleList = new ArrayList<String>();
		for (WebElement e : currencyList) {
			String text = e.getText();
			eleList.add(text);

		}
		System.out.println(eleList);
	}

}
