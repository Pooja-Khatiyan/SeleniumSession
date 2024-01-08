package framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * frame is kind of web element and inside it also we can have multiple web
 * element frames are developed to provide the security of page there are 2
 * types of frames: 1>frame html tag:deprecated --old--not recommended by W3C
 * 2>iFrame html tag:NEW --recommended by W3C
 * to check how many frames are there : //frame
 */

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// browser
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");// page
		Thread.sleep(2000);
//indexing of frames start from 0,1,2...;using index is not good choice is more frames
//added or some are remove
		// driver.switchTo().frame(2);
		// driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath(" //frame[@src='top.html']")));
		String text = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		System.out.println(text);
driver.findElement(By.xpath("//input[@name='client_lookup']/following-sibling::input")).click();
	}

}
