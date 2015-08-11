import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinearSearchInArrayTest {

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
		LinearSearchInArray object=new LinearSearchInArray();
		int array[]={2,5,8,9,10,77,55};
		int actual_output=object.linearSearch(array, 0, 88);
		assertEquals("Pass",-1,actual_output);
	}

	//Positive Test Case
	@Test
	public void test1() {
		LinearSearchInArray object=new LinearSearchInArray();
		int array[]={2,5,8,9,10,55,77};
		int actual_output=object.linearSearch(array, 0, 77);
		assertEquals("Pass",6,actual_output);
	}


	//Negative Test Case
	@Test
	public void test3() {
		LinearSearchInArray object=new LinearSearchInArray();
		int array[]={2,4,1,5,66};
		int actual_output=object.linearSearch(array, 0, 77);
		assertNotEquals("Pass",2,actual_output);
	}
}
