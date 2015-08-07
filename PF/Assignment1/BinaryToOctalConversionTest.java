import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;

public class BinaryToOctalConversionTest {

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

		BinaryToOctalConversion bo=new BinaryToOctalConversion();
		int output=bo.convertBinaryToOctal(110101);
		assertEquals("Right Answer",65,output);
	}
	//Negative Test
	@Test
	public void test1() {

		BinaryToOctalConversion bo=new BinaryToOctalConversion();
		int output=bo.convertBinaryToOctal(110111);
		assertEquals("Right Answer",65,output);
	}

}
