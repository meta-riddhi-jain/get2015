package SecondProgram;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StudentTest {

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
	Student object=new Student(1,"Riddhi",23);
	object.setUid(2);
	int actual=object.getUid();
	assertEquals(2, actual);
	}
	//Positive Test
	@Test
	public void test1() {
		Student object=new Student(2,"N",32);
		String input[]={"English","Hindi"};
		String expected[]={"English","Hindi"};
		object.setCourses(input);
		String actual[]=object.getCourses();
		boolean flag=actual[0].equals(expected[0]);
		boolean flag1=actual[1].equals(expected[1]);
		assertTrue(flag);
		assertTrue(flag1);
	}

}
