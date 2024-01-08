package testngpackage;
//it is white box testing where we checking is sum function is written properly or not
import org.testng.Assert;
import org.testng.annotations.Test;

//unit testing framework for different languages:
//Java : TestNG/Junit
//Python : pyTest/unitTest
//.Net : Nunit
//NODE JS : Mocha/Jasmine
public class HomeTest {
	
	//feature : method : API : WS : white box testing
	
	private int sum(int a, int b) {//this is the feature & below are 4 TC
	return   a+b;
	}
//this is consume by user on Web Application: functional testing
	public void calSum(int a, int b) {
		sum(a,b);//now code coverage is 100%
	}
//unit test + assertion : done by developer team
@Test
public void test1() {
	Assert.assertEquals(sum(10,20),30);
}
@Test
public void test2() {
	Assert.assertEquals(sum(10,0),20);
}
@Test
public void test3() {
	Assert.assertEquals(sum(-10,20),10);
}
@Test
public void test4() {
	Assert.assertEquals(sum(-10,-20),-30);
}
/**
 * STATIC ANALYSIS /TESTING when we talking about below concept
 * there are two type of coverage
 * 1> Test coverage :for particular feature how many TC you have written ; 100% as all possible scenario is added
 * 2> Code coverage for sum : we are not using this feature i.e code coverage is 0%
 *//*************Tools*************
 * SonarQube,Jacoco,Cobertura -- these tool automatically calculate your unit test coverage & code coverage
 * 
 * 
 */
	
}
