package seleniumsession;

//through inspect --go to chrome dev tool(under element tab--DOM)
//fullform of DOM: Document Object Model:having HTML code
//<input --like or after "<" 1st is HTML tag--after HTML tag there is multiple attribute with name and value(like-type,name,value,id,class...).
//it is also possible that any web element have html tag but doesn't have any attribute /may contain or have only text
//attribute and properties are same thing.
//By is class & id is method--we are using class name so id is static method
//code will execute line by line so 1st email id is enter then password
//By is a class already there in selenium--return type is WebElement
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
//formulae to interact with web element
//1-- create the web element + then perform an action(click,sendKey,getText, isDisplayed)	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//1st way of creating WebElement
//driver.findElement(By.id("input-email")).sendKeys("pooja@gmail.com");//should in string form or double quotes
//driver.findElement(By.id("input-password")).sendKeys("admin@123");

//2nd way(formula remain same)--no need to create WebElement again & again
//we are creating web element unnecessary back to back even they are not needed
//WebElement emailId =driver.findElement(By.id("input-email"));
//WebElement password =driver.findElement(By.id("input-password"));	
//	emailId.sendKeys("test@gamil.com");
//	password.sendKeys("admin@123");

//3rd approach:By locator	
//2 By locator	--behave like object repository
//		By eId = By.id("input-email");// by locator
//		By pwd = By.id("input-password");
//driver.findElement -- create the web element	
//		WebElement emailId = driver.findElement(eId);
//		WebElement password = driver.findElement(pwd);
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("admin@123");
//Advantage we are not hitting the server(server is not that busy) we are just maintaining by locator--whenever we want to create webElement we can hit the server at that time
//or will create webelement that time.
//giving better readability		

//4th approach:By locator + generic methods		
//By eId = By.id("input-email");
//By pwd = By.id("input-password");
//	getElement(eId).sendKeys("pooja@gmail.com");
//		getElement(pwd).sendKeys("admin@123");

//5th approach: By locator + generic method for element & action	
//		By eId = By.id("input-email");
//		By pwd = By.id("input-password");
//		doSendKeys(eId, "pooja@gmail.com");
//		doSendKeys(pwd, "admin@123");

//6th Approach:By locator +generic method for element & action in other element Util class		
//		By eId = By.id("input-email");
//		By pwd = By.id("input-password");
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(eId, "pooja@gmail.com");
//		eleUtil.doSendKeys(pwd, "admin@12");

//7th Approach:BrowserUtil + ElementUtil		

//8th Approach:By locator ----converting in String locator		
		String email_id = "input-email";
		String pwd_id = "input-password";
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys("id", email_id, "pooja@gmail.com");
		eutil.doSendKeys("id", pwd_id, "admin@123");

//9th : POM + framework		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
