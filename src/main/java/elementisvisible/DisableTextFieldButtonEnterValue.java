package elementisvisible;
//Interview Question
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DisableTextFieldButtonEnterValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//driver.get("seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");//InvalidArgumentException: invalid argument
//without protocol it will through above exception
driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");	
Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.id("pass"));// this field is disabled
		//pwd.sendKeys("test@123");//ElementNotInteractableException: element not intractable
Actions act = new Actions(driver);
act.sendKeys(pwd,"test@123").perform();//Actions class didn't give any error
	
//************IMPORTANT QUESTION*************//
//passing null value through send keys
driver.findElement(By.id("fname")).sendKeys(null);//throw new IllegalArgumentException
/**sends keys method implementation
 * if (keysToSend == null || keysToSend.length == 0) {
      throw new IllegalArgumentException("Keys to send should be a not null CharSequence");
    }
 */
	
	}

}
