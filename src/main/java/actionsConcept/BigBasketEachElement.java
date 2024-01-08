package actionsConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketEachElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Fruits & Vegetables"))).perform();
		act.moveToElement(driver.findElement(By.linkText("Cuts & Sprouts"))).perform();
		List<WebElement> CutsandSproutslist = driver.findElements(By.cssSelector("a.kTPRNM"));
		//it is not capturing :Cut & Peeled Veggies
		System.out.println(CutsandSproutslist.size());
		for (WebElement e : CutsandSproutslist) {
			String text = e.getText();
			System.out.println(text);
		}
	act.moveToElement(driver.findElement(By.linkText("Exotic Fruits & Veggies"))).perform();
	
	
	}

}
