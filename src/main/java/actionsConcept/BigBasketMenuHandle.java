package actionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		By parentShopByMenu = By.xpath("(//span[text()='Shop by'])[2]");
		By beveragesSecondMenu = By.linkText("Beverages");
		By teaThirdMenu = By.linkText("Tea");
		By greenTeaFourthMenu = By.linkText("Green Tea");

		Actions act = new Actions(driver);
		driver.findElement(parentShopByMenu).click();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(beveragesSecondMenu)).build().perform();
		Thread.sleep(1500);
		act.moveToElement(driver.findElement(teaThirdMenu)).build().perform();
		Thread.sleep(1500);
		driver.findElement(greenTeaFourthMenu).click();

	}
}