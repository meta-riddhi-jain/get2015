import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;

public class BinaryToOctaTest1 {

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
	    System.out.print("Binary to octal conversion Test");
		BinaryToOctal bo=new BinaryToOctal();
		int output=bo.convertBinaryToOctal(110101);
		assertEquals("Right Answer",65,output);
	}

}
