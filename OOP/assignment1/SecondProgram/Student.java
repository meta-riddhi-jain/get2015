package SecondProgram;


/**
 * 
 */

/**
 * @author Riddhi
 *
 */
public class Student extends Person{

	/**
	 * @param StudentId used to store value of student id.
	 * @param courses contains the string of all the courses of student
	 */
	private int StudentId;
	private String[] courses;
	
	public Student(int uid,String name,int StudentId)
	{
		super(uid,name);
		this.StudentId=StudentId;
	}
	//Used to get the value of student id.
	public int getStudentId()
	{
		return StudentId;
	}
	//Used to set the value of student id.
	public void setStudentId(int StudentId)
	{
		this.StudentId=StudentId;
	}
	//Used to get the value of student courses.
	public String[] getCourses()
	{
		return courses;
	}
	//Used to set the value of student courses.
	public void setCourses(String[] courses)
	{
		this.courses=courses;
	}
	//used to print the value of string
	public String toString()
	{
		String totalCourses="";
		for(int index=0;index<courses.length;index++)
		{
			totalCourses=totalCourses.concat(" "+courses[index]);
		}
		return super.toString()+"\nStudentId :"+StudentId+"\nCourses :"+totalCourses;
	}
	
	


}
