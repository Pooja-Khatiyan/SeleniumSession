package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSessionID {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String actTitle = driver.getTitle();
		System.out.println("title is: " + actTitle);
		// *********************quit*****************************
		// driver.quit();//our browser is close server is still running in the
		// background after quit.
//after quit session id is null
		// after quit what is the sessionID? SessionId will be null as we write quit()
//we shouldn't use driver/selenium after quit
//after quit if we want to use the browser we have to launch the browser once again
		// driver = new ChromeDriver();null
		// driver.get("https://www.google.com");
		// System.out.println(driver.getTitle());// NoSuchSessionException: Session ID
		// is null.
		// Using WebDriver after calling quit()?-->it is asking....
		// ************************close********************
		driver.close();
//now what will be session id?--it will give NoSuchSessionException: invalid session id
		driver = new ChromeDriver();// invalid session Id/Expired SessionId
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

//if we are using browser with 3 tab close() will close the current tab where driver control is and 
//then driver lost,where in case of quit() it close the entire browser.
	}

}
