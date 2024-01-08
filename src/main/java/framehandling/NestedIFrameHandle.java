package framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
//F1
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("First Crush");
//F2
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Current Crush");
//F3
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Destiny Crush");
//frames are always works in forward direction directly we can't jump from F3-F1 orF3-F2-F1
		// we have to follow pattern come out from frame and start over again
		driver.switchTo().defaultContent();//it can be use to come out of all the frame hierarchy 
		Thread.sleep(1500);
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys(" First Crush2");
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys(" Current Crush2");
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys(" Destiny Crush2");

//F3-parent F2 :parent frame concept is added in selenium 4 in 3 it is not there
//parentFrame():Change focus to the parent context. If the current context is the top level browsing context,the context remains unchanged		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys(" :Current Crush3");
//F2-parent F1:=can directly be done by using parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys(" :First Crush3");
		driver.switchTo().parentFrame();
String text =driver.findElement(By.tagName("h3")).getText();
System.out.println(text);
	}

}
