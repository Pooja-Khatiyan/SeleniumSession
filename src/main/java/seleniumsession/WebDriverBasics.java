package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {
	static WebDriver driver;

	public static void main(String[] args) {
		// 1--select the browser:open the browser.
		// 2--enter url
		// 3--get the title
		// 4--verify the title -- actual vs expected
		// 5-- close the browser.
		// AUTOMATION STEPS
		String browser = "chrome";
		//NullPointerException(in other case )
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("please pass the right browser...");
			break;
			}
//top casting -- cross browser logic can be achieve through top casting: parallel testing
		//WebDriver driver = new ChromeDriver();// top casting

		// EdgeDriver driver = new EdgeDriver();
		// FirefoxDriver driver = new FirefoxDriver();//firefox
		// ChromeDriver driver = new ChromeDriver();//chrome
//this line creating the object of chromedriver and internally
//calling it's const...
		driver.get("https://www.google.com");
		// driver.get("https://www.facebook.com");
//without protocol--InvalidArgumentException :without protocol selenium will not launch browser
// we can ignore www no issue
// title is tab name : to know --right click on any web page-- view page source--ctrl f --title
		String actTitle = driver.getTitle();
		System.out.println("title is : " + actTitle);
		// VERIFICATION POINT/CHECKPOINT ?ACT vs EXPECTED : TESTING

		if (actTitle.equals("Google")) {
			System.out.println("title is correct-- PASS");
		} else {
			System.out.println("title is not correct-- FAIL");
		}
	String appurl =	driver.getCurrentUrl();
	System.out.println(appurl);	
	if(appurl.contains("google")) {
		System.out.println("url is correct--PASS");
	}	
	String pagesource =driver.getPageSource();	
	System.out.println(pagesource);
	if(pagesource.contains("google apps")) {
		System.out.println("PASS....");
	}
	
	
	
	//driver.quit();// close the browser

	}

}
