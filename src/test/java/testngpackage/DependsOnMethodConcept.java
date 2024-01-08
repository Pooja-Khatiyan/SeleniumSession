package testngpackage;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
//testNG internally decide itself , which method will run 1st
//it doesn't take alphabetic order it run on the bases of how dependencies we have create
@Test
//if deliberately make it fail then further depended method also don't work/run
//to execute that this should be pass
public void loginTest() {
	System.out.println("login to app");
	int i =9/0;//if any kind of exception come immediately test will fails
}

@Test(dependsOnMethods = "loginTest")
public void searchHomePageTest() {//this will skipped
	System.out.println("Search Test");
}
@Test(dependsOnMethods = "searchHomePageTest")
public void addToCartTest() {//this will skipped
	System.out.println("add to cart");
}
/**
 * AAA Rule /Pattern : Arrange , Act , Assert
 * whenever we are designing TC with TestNG/Junit it is always good practice to use AAA rule
 * instead of dependency/priority.
 * TC /Test method should  be independent
 * dependency may create deadlock condition in case of ||er execution.
 * instead of dependency we can call a method inside other if needed
 */







}
