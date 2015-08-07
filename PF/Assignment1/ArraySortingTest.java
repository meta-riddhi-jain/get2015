import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ArraySortingTest {

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

	@Test
	public void test() {
		ArraySorting sa = new ArraySorting();
		int input[]={23,23,23,21,21};
		assertEquals("Pass",2,sa.find_order_array(input));
	}
	
	@Test
	public void test1() {
		ArraySorting sa = new ArraySorting();
		int input[]={21,23,23,21,21};
		assertEquals("Pass",2,sa.find_order_array(input));
	}
}
