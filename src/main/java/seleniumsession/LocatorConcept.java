package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// 1. id: is an attribute : unique
//By eid = By.id("input-email");
//By pwd = By.id("input-password");
//ElementUtil eutil = new ElementUtil(driver);
//eutil.doSendKeys(eid, "pooja@gmail.com");
//eutil.doSendKeys(pwd, "admin@123");

		// 2.name: is an attribute: can be duplicate
//driver.findElement(By.name("email")).sendKeys("test@gmail.com");

		// 3.className:is an attribute: most of the time duplicate
//driver.findElement(By.className("form-control")).sendKeys("test@gamil.com");	
//it doesn't give any error or exception it interacted with 1st webelement on the page with that class name.	
//out of above 3 1st preference is always given to id ,if it is not there then to name then to className	

		// 4.xpath:not an attribute,it is address of the element in the HTML DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("pooja@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("admin@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//By eId = By.id("input-email");
//By pwd = By.id("input-password");
//By loginBtn	=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");	
//	doSendKeys(eId,"pooja@gamil.com");	
//	doSendKeys(pwd,"admin@123");
//	doClick(loginBtn);

		// 5.cssSelector:is not an attribute
//	driver.findElement(By.cssSelector("#input-email")).sendKeys("pooja@gmail.com");
//	driver.findElement(By.cssSelector("#input-password")).sendKeys("admin@123");
//	driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();

//		By emailId = By.cssSelector("#input-email");
//		By pwd =By.cssSelector("#input-password");
//	By loginBtn = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
//	doSendKeys(emailId,"pooja@gmail.com");
//	doSendKeys(pwd,"admin@123");
//	doClick(loginBtn);

		// 6.linkText:only for links,link text is not an attribute,this is the text of
		// the link
//all the links are always represent by "<a" this tag means anchor tag 	
//<h2-- means header ; <p>-- means paragraph	
//html tag for links is always : <a>
//link Text : can be duplicate
		// driver.findElement(By.linkText("Register")).click();
//By registerlink =By.linkText("Register");
//	doClick(registerlink);

		// 7.partialLinkText:only for links.
		// html tag: <a> anchor tag
		// driver.findElement(By.partialLinkText("Forgotten")).clear();

		// 8.tagName:html tag
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);

//		By header = By.tagName("h2");
//		String headervalue = doElementGetText(header);
//		if (headervalue.equals("New Customer")) {
//			System.out.println("header is correct-- PASS");
//		} else {
//			System.out.println("FAIL");
//		}

		By logoImage = By.className("img-responsive");
		doClick(logoImage);
	}
	// locator in Selenium:all locator are available under By class
	// 1--id -- 1st priority
	// 2--name-- 2nd "
	// 3--className--3rd "
	// 4--xpath
	// 5--css
	// 6--LinkText
	// 7--partialLinkText
	// 8--tagName
//inside the DOM ctrl + F = .class name -- to check if it is unique or not	
//#id -- to check if it is unique or not	

	public static String doElementGetText(By locator) {
		return getElement(locator).getText();
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
