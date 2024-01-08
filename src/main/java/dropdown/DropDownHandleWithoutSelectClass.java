package dropdown;

//create generic method
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
//List<WebElement>countList=driver.findElements(By.cssSelector("select#Form_getForm_Country>option"));
//	for(WebElement e : countList) {
//	String text=	e.getText();
//		System.out.println(text);
//	}

//	driver.findElements(By.xpath(" //select[@class='dropdown']/option"));
By country = By.cssSelector("select#Form_getForm_Country>option");
selectDropDownValue(country, "Brazil");
	}

	public static void selectDropDownValue(By locator, String value) {
		List<WebElement> optionList = driver.findElements(locator);
		for (WebElement e : optionList) {
			/**
			 * this code will work problem with "if(e.getText().equals(value))" this code is
			 * that it will not helping much in debugging
			 */
			String text = e.getText();
			if (text.equals(value)) {
				// if(e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}

}
