package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//WEbElement + perform action (getAttribute)		

		By email_Id = By.id("input-email");
		By registerLink = By.linkText("Register");
//String placeholdervalue =driver.findElement(email_Id).getAttribute("placeholder");
//	System.out.println(placeholdervalue);
//	
//	String hrefValue = driver.findElement(registerLink).getAttribute("href");
//	System.out.println(hrefValue);
//	
//String classValue =	driver.findElement(registerLink).getAttribute("class");
//	System.out.println(classValue);

//method used to capture the value of text field enter by us ---"value" 	

//	driver.findElement(email_Id).sendKeys("pooja@gmail.com");
//	String text = driver.findElement(email_Id).getAttribute("value");
//	System.out.println(text);
		// to capture password
		By pwd = By.id("input-password");
//	driver.findElement(pwd).sendKeys("admin@123");
//	String pass = driver.findElement(pwd).getAttribute("value");
//	System.out.println(pass);

		String placeholderval = doGetElementAttribute(email_Id, "placeholder");
		System.out.println(placeholderval);

		String pwdHref = doGetElementAttribute(pwd, "placeholder");
		System.out.println(pwdHref);

		String hrefValue = doGetElementAttribute(registerLink, "href");
		System.out.println(hrefValue);

		// get blank value as doesn't enter anything
		String value = doGetElementAttribute(email_Id, "value");
		System.out.println(value);

	}

	public static String doGetElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
