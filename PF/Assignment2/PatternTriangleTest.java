import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PatternTriangleTest {

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
		PrintTriangle object=new PrintTriangle();
		int n=5,row=1;
		String output=object.space(row, n);
		String result="";
		boolean i=result.equals(output);
		assertTrue(i);
	}
	
	@Test
	public void test1()
	{
		int t=0;
		PrintTriangle object=new PrintTriangle();
		int n=5,row=1;
		String output=object.number(row, n);
		String result="12345";
		boolean i=result.equals(output);
		if(i==true)
		{
			t=1;
		}
		assertEquals("Pass", 1,t);
	}

	@Test
	public void test2() {
		int t=0;
		PrintTriangle object=new PrintTriangle();
		int n=5;
		String output[]=object.wholePyramid(n);
		String result="12345";
		boolean i=result.equals(output[1]);
		if(i==true)
		{
			t=1;
		}
		assertEquals("Pass", 1,t);
	}

}
