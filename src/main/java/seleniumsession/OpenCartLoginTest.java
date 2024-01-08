package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTest {

	public static void main(String[] args) {
		BrowserUtil butil = new BrowserUtil();
		WebDriver driver = butil.launchBrowser("chrome");
		butil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = butil.getPageTitle();
		System.out.println(title);
		By eId = By.id("input-email");
		By pwd = By.id("input-password");
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(eId, "pooja@gmail.com");
		eutil.doSendKeys(pwd, "admin@123");
		butil.closeBrowser();
	}

}
