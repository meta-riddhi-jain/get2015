import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Pattern1Test {

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
		int t=0;
		Pattern1 object=new Pattern1();
		int n=5,row=1;
		String output=object.space(row, n);
		String result="     ";
		boolean i=result.equals(output);
		System.out.println(i);
		if(i==true)
		{
			t=1;
		}
		assertEquals("Pass", 1,t);
	}
	
	@Test
	public void test1()
	{
		int t=0;
		Pattern1 object=new Pattern1();
		int n=5,row=1;
		String output=object.number(row, n);
		String result="1";
		boolean i=result.equals(output);
		System.out.println(i);
		if(i==true)
		{
			t=1;
		}
		assertEquals("Pass", 1,t);
	}
	@Test
	public void test2() {
		int t=0;
		Pattern1 object=new Pattern1();
		int n=5;
		String output[]=object.wholePyramid(n);
		String result="     1";
		boolean i=result.equals(output[0]);
		System.out.println(i);
		System.out.println(output[0]);
		if(i==true)
		{
			t=1;
		}
		assertEquals("Pass", 1,t);
	}
}
