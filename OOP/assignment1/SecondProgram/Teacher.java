package SecondProgram;

/**
 * 
 */

/**
 * @author Riddhi
 *
 */
public class Teacher extends Person {

	/**
	 * @param teacherId contains teacher id
	 * @param subjects string array stores the name of subjects for teacher
	 */
	
	private int teacherId;
	private String[] subjects;
	
	public Teacher(int uid,String name,int teacherId)
	{
		super(uid,name);
		this.teacherId=teacherId;
	}
	//used to get the value of id for a teacher
	public int getteacherId()
	{
		return teacherId;
	}
	//used to set the value of id for a teacher
	public void setteacherId(int teacherId)
	{
		this.teacherId=teacherId;
	}
	//used to get the value of subjects for a teacher
	public String[] getSubjects()
	{
		return subjects;
	}
	//used to set the value of subject for a teacher
	public void setSubjects(String[] subjects)
	{
		this.subjects=subjects;
	}
	//used to return the value in the form of string
	public String toString()
	{

		String totalSubjects="";
		for(int index=0;index<subjects.length;index++)
		{
			totalSubjects=totalSubjects.concat(" "+subjects[index]);
		}
		return super.toString()+"\nTeacherId :"+teacherId+"\nCourses :"+totalSubjects;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher object1=new Teacher(1, "Rajat", 23);
		String array[]={"Engish","Maths"};
		object1.setSubjects(array);
		String answer=object1.toString();
		System.out.println(answer);
	}

}
