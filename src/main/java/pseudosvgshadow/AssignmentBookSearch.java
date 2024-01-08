package pseudosvgshadow;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentBookSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		Thread.sleep(4000);
		String book_script = "return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\"); ";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement search = (WebElement) js.executeScript(book_script);
		search.sendKeys("Bhagat singh");

	}

}
