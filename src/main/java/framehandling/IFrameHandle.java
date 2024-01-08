package framehandling;
import org.openqa.selenium.By;
// to check how many iFrame are there : //iframe
//if after driver suggestions are not coming we can use [control + space]
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class IFrameHandle {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();//browser
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		Thread.sleep(2000);
driver.findElement(By.cssSelector("#imageTemplateContainer")).click();
Thread.sleep(3000);
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
//***************This Code is not working**********************//
//Actions act = new Actions(driver);
//WebElement firstEle=driver.findElement(By.id("RESULT_TextField-1"));
//
//act.sendKeys(firstEle, "automation")
//        .sendKeys(Keys.TAB)
//            .pause(500)
//               .sendKeys("Mumbai")
//                  .sendKeys(Keys.TAB)
//                     .pause(500)
//                        .sendKeys("10/12/2024")
//                             .sendKeys(Keys.TAB)
//                                .pause(500)
//                                    .sendKeys("Automation is great")
//                                         .build()
//                                            .perform();
//**********************************************************************//
driver.findElement(By.id("RESULT_TextField-1")).sendKeys("automation");
driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Mumbai");
driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("I Like Automation");
Actions act = new Actions(driver);
//here i am getting :MoveTargetOutOfBoundsException: move target out of bounds
//what is this exception
//act.sendKeys(driver.findElement(By.id("RESULT_TextField-8")), "Pooja")
//      .sendKeys(Keys.TAB)
//        .pause(1000)
//          .sendKeys("Khatiyan")
//            .sendKeys(Keys.TAB)
//              .pause(1000)
//                .sendKeys("H.No:-82")
//                   .sendKeys(Keys.TAB)
//                     .pause(1000)
//                        .sendKeys("Phase-7,Vasndhara Residency")
//                           .sendKeys(Keys.TAB)
//                             .pause(1000)
//                               .sendKeys("Muzaffarnagar")
//                                 .sendKeys(Keys.TAB)
//                                   .pause(1000)
//                                     .sendKeys("UP")
//                                       .build()
//                                         .perform();


//here iframe is ended on the last web element of the frame i.e Email Address,we have to come out of the iframe to 
//perform any further action.
driver.switchTo().defaultContent();//to come out of the frame
//defaultContent():Selects either the first frame on the page, or the main document when a page contains iframes. 
Thread.sleep(2000);
String text=driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
	System.out.println(text);
	
	
	
	}
	//for using generic method we have to maintain locator for all the element
	public static WebElement getElement (By locator) {
	return driver.findElement(locator);
	}

}
