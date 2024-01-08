package fewconceptsremaining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
		/**
		 * prons >no active browser window >no active UI >testing is happening behind
		 * the scene >faster than UI mode cons >but might not interact with some complex
		 * applications:pop ups,user actions mouse over ,drag and drop in that case
		 * headless want work properly as nothing is visible headless is just blocking
		 * the display property of the browser. it is slightly faster than the normal
		 * mode. SAFARI DOES NOT SUPPORT ANY INCOGNITO OR HEADLESS
		 * 
		 */

		// for Chrome
//	ChromeOptions co = new ChromeOptions();
//	co.addArguments("--headless");
//	WebDriver driver = new ChromeDriver(co);//before this we have to write above lines

		// for Firefox
//	FirefoxOptions fo = new FirefoxOptions();
//	fo.addArguments("--headless");
//	WebDriver driver = new FirefoxDriver(fo);

		// for incognito mode
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

		// when to use:
		// CI-CD -- Cloud -- AWS -- linux -- Jenkins

	}

}
