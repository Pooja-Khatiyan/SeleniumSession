package selenium4feature;
//CRM APPLICATION
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class AssignmentRelativeLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");// important point
		Thread.sleep(1000);
		driver.findElement(By.linkText("CONTACTS")).click();
		WebElement ele = driver.findElement(By.linkText("Anne Nal"));
		String above = driver.findElement(with(By.tagName("a")).above(ele)).getText();
		System.out.println(above);
		String below = driver.findElement(with(By.tagName("a")).below(ele)).getText();
		System.out.println(below);
String right = driver.findElement(with(By.tagName("a")).toRightOf(ele)).getText();
//it will take any random right ele so get particular,we should be specific in xpath.
		System.out.println(right);
		driver.findElement(with(By.tagName("input")).toLeftOf(ele)).click();
	}

}
