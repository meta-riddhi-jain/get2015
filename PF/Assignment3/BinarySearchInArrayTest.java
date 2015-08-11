import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchInArrayTest {

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
		BinarySearchInArray object=new BinarySearchInArray();
		int array[]={1,2,3,4,5};
		int actual_output=object.binarySearch(array,0,5,2);
		assertEquals("Pass",1,actual_output);
	}

	//Positive Test Case
	@Test
	public void test1() {
		BinarySearchInArray object=new BinarySearchInArray();
		int array[]={2,5,8,9,10,77,55,11};
		int actual_output=object.binarySearch(array,0,array.length-1,77);
		assertEquals("Pass",5,actual_output);
	}

	//Negative Test Case
	@Test
	public void test2() {
		BinarySearchInArray object=new BinarySearchInArray();
		int array[]={2,5,8,9,10,77,55};
		int actual_output=object.binarySearch(array,0,array.length-1,88);
		assertEquals("Pass",8,actual_output);
	}

	//Negative Test Case
	@Test
	public void test3() {
		BinarySearchInArray object=new BinarySearchInArray();
		int array[]={};
		int actual_output=object.binarySearch(array,0,array.length-1,88);
		assertEquals("Pass",-1,actual_output);
	}




}
