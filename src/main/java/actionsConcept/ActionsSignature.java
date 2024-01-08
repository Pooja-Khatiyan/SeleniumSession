package actionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsSignature {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://signature-generator.com/draw-signature/#google_vignette");
	Thread.sleep(2000);
		WebElement canvas=	driver.findElement(By.id("signature-pad"));
		Actions act = new Actions(driver);
	act.click(canvas)
		   .moveToElement(canvas, 30,10 )
		      .clickAndHold(canvas)
		        .moveToElement(canvas, 0, -90)
		           .moveByOffset(50, 30)
		             .moveByOffset(-50, 0)
		               .release(canvas)
		                  .build()
		                    .perform();

		        

	}

}
