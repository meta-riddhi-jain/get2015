import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RemoveDuplicateTest {

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
		System.out.print("Remove Duplicate Elements in array test");
		RemoveDuplicate object1=new RemoveDuplicate();
		int input[]={2,5,4,6,3,8,5,2,3,3,6,3,2,0};
		int output[]={2,5,4,6,3,8,0};
		assertArrayEquals("Pass",output,object1.removeDuplicate(input));
	}

}
