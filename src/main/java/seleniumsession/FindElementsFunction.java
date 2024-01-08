package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFunction {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		By links = By.tagName("a");
		By images = By.tagName("img");
		int linkcount = getElementsCount(links);
		System.out.println(linkcount);
//		int imagescount = getElementsCount(images);
//		System.out.println(imagescount);
//
//		List<String> actualLinksTextList = getElementsTextList(links);
//		System.out.println(actualLinksTextList);
//		if (actualLinksTextList.contains("My Account")) {
//			System.out.println("My Account-- PASS");
//		}
//		if (actualLinksTextList.contains("Wish List")) {
//			System.out.println("Wish List---PASS");
//		}
		List<String> hrefList = getElementsAttributeList(links, "href");
		for (String e : hrefList) {
			System.out.println(e);
		}

	}

//WAF :capture the text of all the page links & return List<String>
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

//WAF : capture specific attribute from the List	

	public static List<String> getElementsAttributeList(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			eleAttrList.add(attrValue);
		}
		return eleAttrList;
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
