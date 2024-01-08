package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//login page label of Returning Customer
public class ChildParentLabel {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	//String text =driver.findElement(By.xpath("//input[@name='email']/../label[@for='input-email']")).getText();
	//String text =driver.findElement(By.xpath("//input[@name='email']/../label")).getText();
	
	
	//using parent::name = this keyword instead of /..
	//String text =driver.findElement(By.xpath("//input[@name='email']/parent::div/label")).getText();
	
	//using parent and child keyword
	String text =driver.findElement(By.xpath("//input[@name='email']/parent::div/child::label")).getText();

	System.out.println(text);
	}

}
