package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//here we are checking directly feature on the application/can say black box testing.
public class OpenCartTest {
WebDriver driver;

@BeforeTest//browser will be launch once only it is BeforeTest not BeforeMethod
public void setUp() {
	driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://naveenautomationlabs.com/opencart/");
}
//priority is int type so it can be negative also, case of negative priority order is for ex :-3 : 0 : -1,based on number scale
//if we define same priority it will run the TC a/c to alphabetic order 
@Test(priority = -2)//priority = 10 : we can write this way also but it look ugly so we always follow an order.
public void isOpenCartLogoIsVisibleTest() {//1st preference : alphabetic order
boolean flag=driver.findElement(By.xpath("//img[contains(@alt,'naveen')]")).isDisplayed();
//img[@title='naveenopencart']
Assert.assertEquals(flag, true);
}

@Test(priority = -3)//priority = 15
public void openCartTitleTest() {//if we want to run individual test just select it's name right click &run
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	Assert.assertEquals(actualTitle, "Your Store");
	//Assert.assertEquals(actualTitle, "Your Store11");//to check the updated report
}

@Test(priority = -1)
public void openCartURLTest() {
	String actualUrl = driver.getCurrentUrl();
	System.out.println(actualUrl);
	Assert.assertTrue(actualUrl.contains("opencart"));;
}
@Test
public void aTest() {
	System.out.println("A Test");
}
@Test
public void bTest () {//1st it will run non priority base TC in alphabetic order then priority based a/c to defined priority.               
	System.out.println("B Test");
}

@AfterTest
public void tearDown() {
	driver.quit();
}
//if instead of BeforeTest we write before method browser will be launched as many times as we have TC.
//i.e beforetest is better becz it will  launch the browser once and run all the TC
//**************************SEQUENCE FOLLOW**********************************//
//1> in case of all : -ve priority : no priority(alphabetic order) : +ve priority
//2>in case of 2 : no priority (alphabetic order) : +ve priority
//3> in case of 2 : -ve priority : no priority (alphabetic order)
//4>in case of no priority : follow alphabetic order.
//check report : index.html : emailable-report.html
//***testng-failed.xml : contains all the fail test cases directly from there we can run all the fail TC
}
