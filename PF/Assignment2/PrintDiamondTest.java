import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PrintDiamondTest {

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
		PrintDiamond object=new PrintDiamond();
		int center=5,row=1;
		String output=object.space(row, center);
		String result="     ";
		boolean flag=result.equals(output);
		assertTrue("Pass", flag);
	}
	//Positive Test
	@Test
	public void test1()
	{
		PrintDiamond object=new PrintDiamond();
		int n=5,row=1;
		String output=object.number(row, n);
		String result="1";
		boolean flag=result.equals(output);
		assertTrue(flag);
	}
	//Positive Test
	@Test
	public void test2() {

		PrintDiamond object=new PrintDiamond();
		int center=5;
		String output[]=object.wholePyramid(center);
		String result="     1";
		boolean flag=result.equals(output[0]);
		assertTrue(flag);
	}
	//Negative Test
	@Test
	public void test3() {

		PrintDiamond object=new PrintDiamond();
		int center=5;
		String output[]=object.wholePyramid(center);
		String result="    1";
		boolean i=result.equals(output[0]);
		assertTrue(i);
	}
	//Negative Test
	@Test
	public void test4() {
		PrintDiamond object=new PrintDiamond();
		int center=5,row=2;
		String output=object.space(row, center);
		String result="   ";
		boolean flag=result.equals(output);
		assertTrue("Pass", flag);
	}
	//Negative Test
	@Test
	public void test5()
	{
		PrintDiamond object=new PrintDiamond();
		int n=5,row=1;
		String output=object.number(row, n);
		String result="12";
		boolean flag=result.equals(output);
		assertTrue(flag);
	}
}
