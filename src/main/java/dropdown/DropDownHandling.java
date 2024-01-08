package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
static	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	driver = new ChromeDriver ();
	driver.get("https://www.orangehrm.com/30-day-free-trial/");
By country =	By.id("Form_getForm_Country");
//WebElement country_ele =driver.findElement(country);	
//	Select select = new Select(country_ele);//The constructor Select() is undefined
//	select.selectByIndex(5);//whatever present on 5th position in dropdown get selected 
	//it is good option for months dropdown as months are fixed :when ever data is static/fixed we can
	//opt ByIndex like for weeks etc
	/**
	 * methods available under  select are selectByIndex,selectByValue,selectByVisibleText 
	 */
//	Thread.sleep(1000);
//	select.selectByVisibleText("Brazil");//whenever data is dynamic :new data can be added it is good option
//	
//	Thread.sleep(2000);
//	select.selectByValue("India");
//	
	/**
	 * if more than one dropdown are available for that we can create a generic method
	 * idea behind writing the generic method /utility to avoid repetition of code 
	 * but if we have 20 dropdown we have to create object of select class 20 times but through
	 * generic method we can avoid writing same code again & again
	 */
doSelectDropDownByIndex(country,4);
Thread.sleep(1000);
DoSelectDropDownByVisible(country ,"Dominica");
Thread.sleep(1000);
DoSelectDropDownByValue(country, "India");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void DoSelectDropDownByVisible(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public static void DoSelectDropDownByValue(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	

}
