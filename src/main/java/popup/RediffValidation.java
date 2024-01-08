package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffValidation {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(1000);
		alert.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys("pooja@gmail.com");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(1000);
		alert.dismiss();
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
//GENERIC METHOD
	}
//	public static void doAlertGetText(Alert alert) {
//		String text= alert.getText();
//		System.out.println(text);
//		alert.accept();
	//}

}
