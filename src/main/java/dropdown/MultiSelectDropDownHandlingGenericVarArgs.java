package dropdown;

//VERY FAMOUS INTERVIEW QUESTION
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownHandlingGenericVarArgs {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		// here we can select multiple country : select based dropdown
		driver.get("https://html.com/attributes/select-multiple/");
		By dropDownLocator = By.xpath("//select");
		By optionLocator = By.xpath("//select/option");
		// Test Case 1: select multiple values
//selectDropDownMultipleValues(dropDownLocator,optionLocator ,"Lesser flamingo","Chilean flamingo","Greater flamingo");
		// Test Case 2: select single value
		// selectDropDownMultipleValues(dropDownLocator,optionLocator ,"American
		// flamingo");//now loop
		// will run one time only
		// Test Case 3: select every thing
		selectDropDownMultipleValues(dropDownLocator, optionLocator, "select all");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean isDropDownMultiple(By locator) {
		Select select = new Select(getElement(locator));
		return select.isMultiple() ? true : false;
	}

	/**
	 * this method is used to select the values from the drop down.It can select 1:
	 * single selection 2: multiple selection 3: all selection : please pass "select
	 * all" as a value to select all the value
	 * 
	 * @param locator
	 * @param values
	 */
	public static void selectDropDownMultipleValues(By locator, By optionLocator, String... values) {

		// to pass multiple value we use spread operator
		// in java ... these three dots are called var arguments
		// int.. values : it will give int array/[]
		/**
		 * 1>why we always call getElement method,why we are not passing by locator
		 * directly becz select class waiting for WebElement not by locator 2>why don't
		 * we supply by WebElement directly: if we want to supply webElement than we
		 * have to create the WebElement unnecessary ,which will hit server unnecessary
		 * here i have just maintain the By locator(list of locator) ,let the method
		 * decide/(requirement decide which locator we want) when to call the server and
		 * when to create the WebElement improve the performance,on the fly i can
		 * maintain webelement as per requirement let the utility create the web element
		 * on the fly
		 */
		Select select = new Select(getElement(locator));
		if (isDropDownMultiple(locator)) {
			if (values[0].equalsIgnoreCase("select all")) {// passing identifier in the method/logic : like :"select
															// all"
				List<WebElement> optionList = driver.findElements(optionLocator);
				for (WebElement e : optionList) {
					e.click();
				}

			} else {
				for (String value : values) {

					select.selectByVisibleText(value);
				}
			}
		}
	}

}
