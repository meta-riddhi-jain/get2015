import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PermutationOfStringsTest {

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
		PermutationOfStrings object=new PermutationOfStrings();
		String actual_output[]=object.generatePermutations("abc");
		String expected_output[]={"abc","acb","bac","bca","cab","cba"};
		boolean flag=true;
		for(int index=0;index<actual_output.length;index++)
		{
			if(actual_output[index].equals(expected_output[index])==false)
			{
				flag=false;
			}
		}
		assertTrue(flag);
	}

	@Test
	public void test1() {
		PermutationOfStrings object=new PermutationOfStrings();
		String actual_output[]=object.generatePermutations("abc");
		String expected_output[]={"abc","acb","bac","bca","abc","cba"};
		boolean flag=true;
		for(int index=0;index<actual_output.length;index++)
		{
			if(actual_output[index].equals(expected_output[index])==false)
			{
				flag=false;
			}
		}
		assertFalse(flag);
	}

}
