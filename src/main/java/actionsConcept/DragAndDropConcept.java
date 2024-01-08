package actionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver ();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
WebElement sourceEle=driver.findElement(By.cssSelector("div#draggable"));
WebElement targetEle=driver.findElement(By.cssSelector("div#droppable"));	
Actions act = new Actions(driver);

//act.clickAndHold(sourceEle)
//                .moveToElement(targetEle) 
//                      .release()
//                         // .build() without this it also work
//                              .perform();
//	
	

//DIRECT METHOD
act.dragAndDrop(sourceEle, targetEle).build().perform();
	}

}
