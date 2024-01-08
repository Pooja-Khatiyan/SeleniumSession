package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		By country = By.id("Form_getForm_Country");
		WebElement countryEle = driver.findElement(country);
		Select select = new Select(countryEle);

		List<WebElement> countryList = select.getOptions();// All options belonging to this select tag :return =
															// List<WebElement>
		System.out.println(countryList.size());
//IMPORTANT & FAMOUS INTERVIEW QUESTION	
		for (WebElement e : countryList) {
			String text = e.getText();
			System.out.println(text);
//simple interview question how to select a value without using select methods
			if(text.equals("India")) {
				e.click();
				break;
			}
		}
		System.out.println("*******");
		for (WebElement e : countryList) {
			String texts = e.getAttribute("value");
			System.out.println(texts);
		}
	}
}
