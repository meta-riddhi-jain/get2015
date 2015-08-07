import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LongestIncreasingSequenceTest {

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
	//Positive Test
	@Test
	public void test() {
		LongestIncreasingSequenceOfNumber object=new LongestIncreasingSequenceOfNumber();
		int output[]={1,2,4,5,6,7,8,9};
		int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		assertArrayEquals(output, object.longestIncreasingSeqeunce(input));
	}
	//Negative Test
	@Test
	public void test1() {
		LongestIncreasingSequenceOfNumber object=new LongestIncreasingSequenceOfNumber();
		int output[]={1,2,4,7,8,9};
		int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,7,8,1,2,4,5,6,7,8,9};
		assertArrayEquals(output, object.longestIncreasingSeqeunce(input));
	}
}
