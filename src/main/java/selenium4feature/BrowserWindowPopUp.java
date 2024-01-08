package selenium4feature;

import java.util.Iterator;
import java.util.Set;

//IMPORTANT
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//CRM APPLICATION
public class BrowserWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");// important point
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).perform();
		driver.findElement(By.linkText("New Contact")).click();
		driver.findElement(By.xpath("//input[@name='client_lookup']/following-sibling::input")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		Thread.sleep(3000);
		driver.findElement(By.id("search")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//a)[1]")).click();
		driver.switchTo().window(parentWindowId);
		Thread.sleep(1000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(1000);
		driver.findElement(By.id("first_name")).sendKeys("Pooja");
		driver.findElement(By.id("surname")).sendKeys("Khatiyan");
		driver.findElement(By.xpath("//form[@id=\"contactForm\"]/table/tbody/tr/td/input[2]")).click();
	}

}
