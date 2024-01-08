package dropdown;

import java.util.List;

import org.openqa.selenium.Alert;
//CRM APPLICATION
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentSelectBased {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");// important point
		Thread.sleep(3000);
		// driver.findElement(By.linkText("CONTACTS")).click();//same as below
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).click().perform();
		driver.findElement(By.xpath("//tbody//td/a[text()='Anusha N']//parent::td//preceding-sibling::td/input"))
				.click();//table is very dynamic

//for companies:		
		// act.moveToElement(driver.findElement(By.linkText("COMPANIES"))).click().perform();
		// driver.findElement(By.xpath("(//tbody/tr//child::td/input[@type='checkbox'])[7]")).click();
		// tbody/tr//a[text()='Accenture']//parent::td//preceding-sibling::td
//doubt		//Select select = new Select(driver.findElement(By.xpath("//select/option")));
		Select select = new Select(driver.findElement(By.xpath("//tbody//td//child::select[@name='do_action']")));
		List<WebElement> optionList = select.getOptions();
		System.out.println(optionList.size());
		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("Delete Checked")) {
				e.click();
				break;
			}
		}
		driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[2]/td[2]/input")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
}