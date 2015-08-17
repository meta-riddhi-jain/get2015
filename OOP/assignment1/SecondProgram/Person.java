package SecondProgram;


/**
 * @author Riddhi
 *
 */

public class Person {

	/**
	 * @param args
	 */

	private int uid;
	private String name;
	
	public Person(int uid,String name)
	{
		this.uid=uid;
		this.name=name;
	}
	//Used to get the value of person id.
	public int getUid()
	{
		return uid;
	}
	//Used to set the value of person id.
	public void setUid(int uid)
	{
		this.uid=uid;
	}
	//Used to get the value of person name.
	public String getName()
	{
		return name;
	}
	//Used to set the value of person name.
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return "Name :"+name+"\nUid :"+uid;
	}
}

