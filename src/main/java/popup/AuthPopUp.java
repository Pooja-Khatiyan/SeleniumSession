package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String userName ="admin";
		String password ="admin";
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//Limitation if password & username have @.after@ it is expecting domain  name
		// between protocol & domain name we supply username& password

		
		//this is Basic Auth
		driver.get("https://"+userName+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");		
	}

}
