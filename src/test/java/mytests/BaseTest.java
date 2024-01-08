package mytests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	protected WebDriver driver;// within the package

	@Parameters({ "url", "browser" }) // to read the parameter from runner file
	@BeforeTest
	public void setUp(String url, String browserName) {// it is holding parameter
		// 1 to 1 mapping with passed parameter
		// browserNamehere tstng or runner case is user for me
		System.out.println("browser name: " + browserName);
		// cross browser logic : testng will do the parallel execution becz testng helping us to write TC & runners
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser: " + browserName);
			break;
		}
        driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
