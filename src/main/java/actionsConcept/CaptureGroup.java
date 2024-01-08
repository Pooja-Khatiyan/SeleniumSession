package actionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureGroup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Khatiyan");
Thread.sleep(1500);
driver.findElement(By.xpath("(//a[@class='list-group-item'])[3]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[contains(@id,'input-email')]")).sendKeys("poojakhatiyan021@gmail.coma");
Thread.sleep(500);
driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
//to fetch last element : (//a[@class='list-group-item'])[last()]
	}

	
	}


