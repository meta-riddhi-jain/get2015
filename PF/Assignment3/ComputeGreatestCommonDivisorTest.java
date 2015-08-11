import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ComputeGreatestCommonDivisorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	//Positive Test Case
	@Test
	public void test1() {
		ComputeGreatestCommonDivisor object=new ComputeGreatestCommonDivisor();
		int actual_output=object.gcd(2,1);
		assertEquals("Pass",1,actual_output);
	}
	//Positive Test Case
	@Test
	public void test() {
		ComputeGreatestCommonDivisor object=new ComputeGreatestCommonDivisor();
		int actual_output=object.gcd(12,18);
		assertEquals("Pass",6,actual_output);
	}

	//Positive Test Case
	@Test
	public void test2() {
		ComputeGreatestCommonDivisor object=new ComputeGreatestCommonDivisor();
		int actual_output=object.gcd(100,3);
		assertEquals("Pass",1,actual_output);
	}
	//Negative Test Case
	@Test
	public void test3() {
		ComputeGreatestCommonDivisor object=new ComputeGreatestCommonDivisor();
		int actual_output=object.gcd(12,4);
		assertNotEquals("Pass",2,actual_output);
	}

	//Negative Test Case
	@Test
	public void test5() {
		ComputeGreatestCommonDivisor object=new ComputeGreatestCommonDivisor();
		int actual_output=object.gcd(97,3);
		assertNotEquals("Pass",3,actual_output);
	}

}
