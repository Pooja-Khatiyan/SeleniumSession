package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//sequence of running : before annotation -- test -- after
public class TestNgAnnotations {
//THESE ARE PRECONDITIONS	
	@BeforeSuite //1st preference while running : run 1 time
	public void connectWithDB() {
		System.out.println("BS -- connect with DB");
	}
	@BeforeTest //2nd preference while running : run one time
	public void createUser() {
		System.out.println("BT -- create user");
	}
	@BeforeClass //3rd preference while running : run one time
	public void launchBrowser() {
		System.out.println("BC -- Launch Browser");
	}

	@BeforeMethod//it will be running before each & every test method : run multiple time based on number of TC
//it will pick test on the bases of alphabetic order :sequence: 4 run : 7 run  : 10 run
	public void loginToApp() {
		System.out.println("BM -- login to application");
	}
//TO WRITE TEST CASES
 @Test
 public void searchTest() {//11 th
	 System.out.println("search test");
 }
	
@Test
public void addToCartTest() {//5th preference while running : a/c to alphabetic sequence
	System.out.println("add to cart test");
}
@Test 
public  void checkOutTest() {//8th
	System.out.println("checkout test");
}
//AFTER CONDITIONS
@AfterMethod//it will run after each and every test : sequence: 6 run : 9 run  : 12 run
public void logout() {
	System.out.println("AM --logout");
}
	
@AfterClass
public void closeBrowser() {//13th
	System.out.println("AC -- close Browser");
}
	
@AfterTest
public void deleteUser() {//14th
	System.out.println("AT --delete User");
}
@AfterSuite
public void disconnectWithDB() {//15th
	System.out.println("AS --Please Disconnect With DB");
}

//Writing sequence could be anything, they run on the bases of above conditions only.




	
	
	
	
	

}
