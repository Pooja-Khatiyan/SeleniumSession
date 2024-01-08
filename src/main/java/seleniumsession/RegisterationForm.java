package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterationForm {
	static WebDriver driver;

//by relative xpath =//a[contains(@class,'list-group-item')]
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By email = By.id("input-email");
		By tele = By.id("input-telephone");
		By pwd = By.id("input-password");
		By cpwd = By.id("input-confirm");
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(fName, "Pooja");
		eutil.doSendKeys(lName, "Khatiyan");
		eutil.doSendKeys(email, "pooja@gmail.com");
		eutil.doSendKeys(tele, "7668034397");
		eutil.doSendKeys(pwd, "admin@123");
		eutil.doSendKeys(cpwd, "admin@123");

	}

}
