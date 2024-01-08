package elementisvisible;
//very important interview question
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Selenium_18_Slider_Signature_RelativeLocators_IsDisplayed_IsEnabled_IsSelected_DisableElements.mp4
//1hr:20mins
public class HandlingDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com.register/");

		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.id("submitbutton"));
		//submit.click();
		//it will give ElementClickInterceptedException:click is not happening properly on that element
		Actions act = new Actions(driver);
		act.click(submit).perform();
		act.click().perform();
		//with actions class it will not give any exception
	}

}
