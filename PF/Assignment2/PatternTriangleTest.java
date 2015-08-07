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
	//Positive Test
	@Test
	public void test() {
		PrintTriangle object=new PrintTriangle();
		int n=5,row=1;
		String output=object.space(row, n);
		String result="";
		boolean i=result.equals(output);
		assertTrue(i);
	}
	//Positive Test
	@Test
	public void test1()
	{

		PrintTriangle object=new PrintTriangle();
		int n=5,row=1;
		String output=object.number(row, n);
		String result="12345";
		boolean i=result.equals(output);
		assertTrue(i);
	}
	//Positive Test
	@Test
	public void test2() {

		PrintTriangle object=new PrintTriangle();
		int n=5;
		String output[]=object.wholeTriangle(n);
		String result="12345";
		boolean i=result.equals(output[1]);
		assertTrue(i);
	}
	//Negative Test
	@Test
	public void test3() {
		PrintTriangle object=new PrintTriangle();
		int n=5,row=1;
		String output=object.space(row, n);
		String result=" ";
		boolean i=result.equals(output);
		assertTrue(i);
	}
	//Negative Test
	@Test
	public void test4()
	{
		PrintTriangle object=new PrintTriangle();
		int n=5,row=1;
		String output=object.number(row, n);
		String result=" 2345";
		boolean i=result.equals(output);
		assertTrue(i);
	}
	//Negative Test
	@Test
	public void test5() {

		PrintTriangle object=new PrintTriangle();
		int n=5;
		String output[]=object.wholeTriangle(n);
		String result="1234";
		boolean i=result.equals(output[1]);
		assertTrue(i);
	}
}
