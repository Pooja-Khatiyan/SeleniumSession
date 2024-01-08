package seleniumsession;

//BEFOR 4.6 SELENIUM VERSION WE HAVE TO MANAUALLY SET THE PATH of .exe
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver","C:\\Users\\pooja\\OneDrive\\Documents\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
//browser--118--> ideally need 118.exe
//using 4.3.0 version of selenium
//IllegalStateException: The path to the driver executable The path to the driver executable must be 
//set by the webdriver.chrome.driver system property;

	}

}
