package actionsConcept;
//if application is stable then we can use it
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazonTabSearch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions act = new Actions (driver);
		//we can also create actions and on that can apply perfom();
	Action action=	act.sendKeys(Keys.TAB)
		       .sendKeys(Keys.TAB) 
		            .sendKeys(Keys.TAB)
		                  .sendKeys(Keys.TAB)
		                       .sendKeys(Keys.TAB)
		                            .sendKeys("vegan supplements")
		                                 .sendKeys(Keys.ENTER)
		                                     .build();
		                                       // .perform();
action.perform();
	}

}
