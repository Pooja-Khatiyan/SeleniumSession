package actionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// chrome browser
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");// page
		WebElement slider = driver.findElement(By.id("slider"));
		int length = slider.getSize().getWidth();
		System.out.println(length);
		Actions act = new Actions(driver);
		act.clickAndHold(slider).moveByOffset((length / 2) - 500, 0).release(slider).build().perform();
//xOffset horizontal offset. A negative value means moving the mouse left.
//yOffset vertical offset. A negative value means moving the mouse up.

	}

}
