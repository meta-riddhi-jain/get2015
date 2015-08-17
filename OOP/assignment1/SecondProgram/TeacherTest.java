package SecondProgram;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TeacherTest {

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
		Teacher object=new Teacher(1,"Riddhi",23);
		object.setteacherId(12);
		int actual=object.getteacherId();
		assertEquals("Match",12,actual);
	}

	@Test
	public void test1() {
		Teacher object=new Teacher(1,"Riddhi",23);
		String input[]={"English","Hindi"};
		String expected[]={"English","Hindi"};
		object.setSubjects(input);
		String actual[]=object.getSubjects();
		boolean flag=actual[0].equals(expected[0]);
		boolean flag1=actual[1].equals(expected[1]);
		assertTrue(flag);
		assertTrue(flag1);
	}
}
