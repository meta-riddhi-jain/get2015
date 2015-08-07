import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RemoveDuplicateElementsTest {

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

		RemoveDuplicateElements object1=new RemoveDuplicateElements();
		int input[]={2,0,4,6,3,8,5,2,3,3,6,3,5,2};
		int output[]={2,0,4,6,3,8,5};
		assertArrayEquals("Pass",output,object1.removeDuplicateElementsOfArray(input));
	}

	@Test
	public void test1() {

		RemoveDuplicateElements object1=new RemoveDuplicateElements();
		int input[]={2,3,4,5,2,3,6,8,0,9};
		int output[]={2,3,4,5,6,8,0,9};
		assertArrayEquals("Pass",output,object1.removeDuplicateElementsOfArray(input));
	}

	@Test
	public void test2() {
		System.out.print("Remove Duplicate Elements in array test");
		RemoveDuplicateElements object1=new RemoveDuplicateElements();
		int input[]={2,2,4,5,2,3,6,8,0,9};
		int output[]={2,2,4,5,6,8,0,9};
		assertArrayEquals("Pass",output,object1.removeDuplicateElementsOfArray(input));
	}
}
