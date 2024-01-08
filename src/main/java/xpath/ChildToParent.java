package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildToParent {
//Registration Page
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	//String text =driver.findElement(By.xpath("//input[@name='firstname']/../../label")).getText();
	
//with parent and child keyword

String text =driver.findElement(By.xpath("//input[@name='firstname']/parent::div/parent::div/child::label")).getText();//more readable
//input[@name='firstname']/parent::div/parent::div/child::label[@for='input-firstname']
////input[@name='firstname']/ancestor::div[@class='form-group required']
	System.out.println(text);
	
	}

}
