package dropdown;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptionsUtil {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		By country = By.id("Form_getForm_Country");
		selectDropDownOption(country, "Brazil");
		// we can call this method n no. of times
		System.out.println("*************");
		selectDropDownOption(country, "American Samoa");
		int count = getDropDownOptionCount(country);
		System.out.println(count);
		System.out.println("*********************");
		List<String> list = getDropDownOptions(country);
		System.out.println(list);
		if (getDropDownOptions(country).contains("India")) {
			System.out.println("test--pass");
		}
		ArrayList<String> expList = new ArrayList<String>(
				Arrays.asList("Belgium", "Bouvet Island", "Algeria", "Afghanistan", "Aruba"));
		if (getDropDownOptions(country).containsAll(expList)) {
			System.out.println("Test--PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("*************************");
		int countryCount = getDropDownOptionCount(country) - 1;
		if (countryCount == 232) {
			System.out.println("PASS");
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	/**
	 * in this generic method we don't handle size as in few case header is included
	 * and in some cases header is excluded so we do it in caller method
	 * 
	 */
	public static int getDropDownOptionCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}

	public static List<String> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String text = e.getText();
			//to exclude we can add a line of code
			//if text is country don;t add it:programmatically we can add
			optionsTextList.add(text);
		}
		return optionsTextList;
	}

	public static void selectDropDownOption(By locator, String dropDownValue) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(dropDownValue)) {
				e.click();
				break;
			}
		}

	}

}
