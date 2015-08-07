import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class FirstComeFirstServeTest {

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
	int isArrayEquals(int expected[][], int output[][])
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(expected[i][j]!=output[i][j])
				{
					return 0;
				}
			}
		}
		
			return 1;
	}
	@Test
	public void test() {
		int expected[][]={{1,0,1,12},{5,8,13,19},{9,11,20,21},{25,0,25,29}};
		int arrival_time[]={1,5,9,25};
		int job_size[]={12,7,2,5};
		FirstComeFirstServe object=new FirstComeFirstServe();
		int output[][]=object.FCFS(arrival_time, job_size);
		assertEquals("Pass", 1, isArrayEquals(expected, output));
		
	}

}
