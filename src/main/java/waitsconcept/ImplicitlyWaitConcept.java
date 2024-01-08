package waitsconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// here we are using wrong id it will throw exception immediately :NoSuchElementException
		// driver.findElement(By.id("input11-email")).sendKeys("pooja@gmail.com");
//in case we apply implicitly wait it throw exception a/cly to the time we have define:after finishing
//the define time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// 10 sec is defined:implicitly wait
		driver.findElement(By.id("input11-email")).sendKeys("pooja@gmail.com");
//it doesn't throw exception immediately , it throw after 10 sec of time ,once 10 sec is finished
//it throw exception

	}

}
