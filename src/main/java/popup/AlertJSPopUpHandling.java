package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * ALERT:java script pop up /modal dialog pop ups
		 * 1:ALERT 
		 * 2:PROMPT 
		 * 3:CONFIRM
		 * handle by alert API
		 */

		WebDriver driver = new ChromeDriver();//open browser
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");//open page
	//**************AlertJSPopUP************************************//	
//*****if we comment out below line means no alert is available then it will through exception
		//****NoAlertPresentException: no such alert
		
		
driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();//now page is freeze by alert
//Alert is a interface having 4 methods ; Alert is implemented by RemoteAlert
Alert alert = driver.switchTo().alert();
String text=alert.getText();
System.out.println(text);
Thread.sleep(2000);
alert.accept();//accept the alert,after accepting the alert the driver is automatically on the page 
//no need to use any switch to
//alert.dismiss();//to cancel the alert


//***********************ConfirmPopUp******************************//
driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
Thread.sleep(2000);
Alert confirm =driver.switchTo().alert();
String texts=confirm.getText();
System.out.println(texts);
confirm.dismiss();


//**********************PromptPopUp***************************************//
driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
Thread.sleep(2000);
Alert prompt =driver.switchTo().alert();
String Texts=prompt.getText();
System.out.println(Texts);
prompt.sendKeys("Hello Automation");
Thread.sleep(1000);
prompt.accept();






	}

}
