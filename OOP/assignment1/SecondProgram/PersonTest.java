package SecondProgram;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PersonTest {

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
		Person object=new Person(2,"N");
		object.setUid(3);
		int actual=object.getUid();
		assertEquals("Match",3,actual);
	}
	//Positive Test
	@Test
	public void test1() {
		Person object=new Person(2,"N");
		object.setName("Riddhi");
		String actual=object.getName();
		boolean flag=actual.equals("Riddhi");
		assertTrue(flag);
	}
	//Negative Test
	@Test
	public void test2() {
		Person object=new Person(2,"N");
		object.setName("Riddhi");
		String actual=object.getName();
		boolean flag=actual.equals("N");
		assertFalse(flag);
	}

}
