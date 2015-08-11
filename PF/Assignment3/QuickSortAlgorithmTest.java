import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class QuickSortAlgorithmTest {

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
		QuickSortAlgorithm object=new QuickSortAlgorithm();
		int array[]={2,5,8,9,10, 77, 55, 11};
		int expected_output[]={2,5,8,9,10,11,55,77};
		int actual_output[]=object.quickSort(array, 0, array.length-1);
		assertArrayEquals(expected_output, actual_output);
	}

	//Negative Test Case
	@Test
	public void test1() {
		QuickSortAlgorithm object=new QuickSortAlgorithm();
		int array[]={2,5,3,10,4,6};
		int expected_output[]={2,3,6,5,4,10};
		int actual_output[]=object.quickSort(array, 0, array.length-1);
		assertArrayEquals(expected_output, actual_output);
	}

	//Error Test Case
	@Test
	public void test2() {
		QuickSortAlgorithm object=new QuickSortAlgorithm();
		int array[]={};
		int expected_output[]={};
		int actual_output[]=object.quickSort(array, 0, array.length-1);
		assertArrayEquals(expected_output, actual_output);
	}

}
