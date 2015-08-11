import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class FindLargestDigitInNumberTest {

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
		FindLargestDigitInNumber object=new FindLargestDigitInNumber();
		int actual_output=object.largestDigit(2);
		assertEquals("Pass",2,actual_output);
	}
	//Positive Test Case
	@Test
	public void test1() {
		FindLargestDigitInNumber object=new FindLargestDigitInNumber();
		int actual_output=object.largestDigit(1257369);
		assertEquals("Pass",9,actual_output);
	}
	//Positive Test Case
	@Test
	public void test2() {
		FindLargestDigitInNumber object=new FindLargestDigitInNumber();
		int actual_output=object.largestDigit(444);
		assertEquals("Pass",4,actual_output);
	}
	//Negative Test Case
	@Test
	public void test3() {
		FindLargestDigitInNumber object=new FindLargestDigitInNumber();
		int actual_output=object.largestDigit(-444);
		assertEquals("Pass",4,actual_output);
	}


}
