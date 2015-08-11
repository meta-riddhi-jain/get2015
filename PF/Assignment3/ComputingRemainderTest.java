import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ComputingRemainderTest {

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
	public void test() {
		ComputingRemainder object=new ComputingRemainder();
		int divisor=2;
		int divident=1;
		int remainder=object.remainder(divisor, divident);
		assertEquals("Pass",0,remainder);
	}

	//Positive Test Case
	@Test
	public void test1() {
		ComputingRemainder object=new ComputingRemainder();
		int divisor=100;
		int divident=3;
		int remainder=object.remainder(divisor, divident);
		assertEquals("Pass",1,remainder);
	}



	//Negative Test Case
	@Test
	public void test5() {
		ComputingRemainder object=new ComputingRemainder();
		int divisor=27;
		int divident=5;
		int remainder=object.remainder(divisor, divident);
		assertNotEquals("Pass",1,remainder);
	}



}
