package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUoloadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
//one attribute we should check it should have type= file ,tag name could be anything,if this attribute is not there then we 
//have to ask our developer to add that else this won't work but in 99.99% case it is there	
//if they don't do it we can add 3rd party Libraries:AutoIT(only for windows)/robot class(only for window)
//or can use sikuli(image based library)

		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\pooja\\OneDrive\\Desktop");
// in selenium it is possible to upload file but one by one in a single go we can't do
	}

}
