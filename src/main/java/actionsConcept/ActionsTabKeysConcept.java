package actionsConcept;
//Very Trendy Interview Question
//THIS IS CALLED ACCESSIBILITY TESTING
//for partially blind or disabled public it is done as they know how many time tab have to click and then press to confirm 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabKeysConcept  {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
WebElement firstName = driver.findElement(By.id("input-firstname"));
Actions act = new Actions(driver);
//with Keys there are multiple keyboard options are available         
//Keys is kind of enum all the constant values are defined here maintained by selenium internally
act.sendKeys(firstName, "pooja")
           .sendKeys(Keys.TAB )
              .pause(500)
                .sendKeys("Khatiyan")
                     .sendKeys(Keys.TAB )
                         .pause(500)
                             .sendKeys("pooja@gmail.com")
                                 .sendKeys(Keys.TAB )
                                     .pause(500)
                                         .sendKeys("7668034397")
                                              .sendKeys(Keys.TAB )
                                                    .pause(500)
                                                         .sendKeys("admin@123")
                                                              .sendKeys(Keys.TAB )
                                                                   .pause(500)
                                                                       .sendKeys("admin@123")
                                                                           .sendKeys(Keys.TAB )
                                                                                .build()
                                                                                    .perform();
  
	          
	}

}
