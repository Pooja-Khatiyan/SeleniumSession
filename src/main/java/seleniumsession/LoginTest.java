package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String email_Id = "input-email";
	String password_Id = "input-password";
	String loginBtn_xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input";
	String register_linkText ="Register";
	ElementUtil eutil = new ElementUtil(driver);
	eutil.doSendKeys("id", email_Id ,"pooja@gmail.com");
	eutil.doSendKeys("id", password_Id, "admin@123");
	eutil.doClick("xpath", loginBtn_xpath);
	String registerValue = eutil.doElementGetText("linkText", register_linkText);
	System.out.println(registerValue);
	}

}
