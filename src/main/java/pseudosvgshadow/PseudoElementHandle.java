package pseudosvgshadow;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javascriptexecutor.JavaScriptUtil;

public class PseudoElementHandle {
/**
 * ::=these are pseudo classes
 * ::before/::after=pseudo classes based element i.e called pseudo element
 * 
 */
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"),'::before').getPropertyValue('content')";
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String mand_text = js.executeScript(script).toString();
//		System.out.println(mand_text);
//		if (mand_text.contains("*")) {
//			System.out.println("first name is mandatory");
//		}
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		jsUtil.mandField(script);//through generic method.

	}

}
