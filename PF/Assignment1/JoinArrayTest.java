import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JoinArrayTest {

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
		JoinArray object=new JoinArray();
		int input1[]={2,4,6,8,10};
		int input2[]={1,3,5,7,9};
		int c[]=new int[10];
		int output[]={1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals("Pass", output, object.join(input1, 5, input2, 5, c));
	}

}
