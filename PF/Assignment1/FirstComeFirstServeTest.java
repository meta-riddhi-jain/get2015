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
		for(int i=0;i<3;i++)
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
	int isArrayEquals2(int expected[][], int output[][])
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
	//Positive Test
	@Test
	public void test() {
		int expected[][]={{1,0,1,8},{5,3,8,10},{7,3,10,19}};
		int arrival_time[]={1,5,7};
		int job_size[]={7,2,9};
		FirstComeFirstServe object=new FirstComeFirstServe();
		int output[][]=object.FCFS(arrival_time, job_size);
		assertEquals("Pass", 1, isArrayEquals(expected, output));

	}
	//Negative Test
	@Test
	public void test1() {
		int expected[][]={{1,0,1,8},{5,3,8,10},{7,3,10,19},{25,0,0,27}};
		int arrival_time[]={1,5,7,25};
		int job_size[]={7,2,9,2};
		FirstComeFirstServe object=new FirstComeFirstServe();
		int output[][]=object.FCFS(arrival_time, job_size);
		assertEquals("Pass", 1, isArrayEquals2(expected, output));

	}


}
