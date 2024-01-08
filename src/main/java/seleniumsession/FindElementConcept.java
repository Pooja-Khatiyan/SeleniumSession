package seleniumsession;

import org.openqa.selenium.By;
//IMPORTANT INTERVIEW QUESTION
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.id("input-email111")).sendKeys("pooja@gmail.com");
//NoSuchElementException: no such element : unable to locate element	
//Exception is coming while creating the element i.e driver.findElemnt...
//sendKeys accept only String value no numerical or other character is not acceptable	
	
	 // if we want to pass numerical value 1st we have to convert it into in String using valueOf method
//	int totalBill = 123;
//	String totalBillAmount = String.valueOf(totalBill);
//	driver.findElement(By.id("input-email")).sendKeys(totalBillAmount);
	 
		//if we are passing null
//driver.findElement(By.id("input-email")).sendKeys(null);//IllegalArgumentException :keys to send should be a not null charSequence

		
		//can we pass StringBuffer or StringBuilder ?-- in SendKeys!!!
	
StringBuilder sb = new StringBuilder ("pooja@gmail.com");	
driver.findElement(By.id("input-email")).sendKeys(sb+ "Automation");	

//sendKeys will work with StringBuilder, StringBuffer & String--becz CharSequence is already built interface in java and have
//String,StringBuilder,StringBuffer as child classes =these classes are implementing this interface

  //SRP -single responsibility principle= specific class is responsible for specific work only	
	}

}
