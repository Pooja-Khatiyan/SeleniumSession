package elementisvisible;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisible {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement logo = driver.findElement(By.cssSelector(".img-responsive"));
		System.out.println(logo.isDisplayed());// if displayed it will return boolean:true
		System.out.println(logo.isEnabled());// if button is enabled then it will return true else false
//like in registration form submit button is disabled sometime due to attribute disabled and return false
		System.out.println(logo.isSelected());// if button is selected it will return true else false
		WebElement e = driver.findElement(By.xpath("//a[@class='agree']//following-sibling::input"));
		System.out.println(e.isDisplayed());
		System.out.println(e.isEnabled());
		System.out.println(e.isSelected());
		e.click();
		System.out.println(e.isEnabled());
		System.out.println(e.isSelected());
	}

}
