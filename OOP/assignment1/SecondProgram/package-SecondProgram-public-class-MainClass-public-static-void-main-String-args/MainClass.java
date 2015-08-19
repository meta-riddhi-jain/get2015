package SecondProgram;

public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method student
		Student object1=new Student(1, "Riddhi", 23);
		String array[]={"Engish","Maths",""};
		object1.setCourses(array);
		String answer=object1.toString();
		System.out.println(answer);
		
		Teacher object=new Teacher(1, "Riddhi", 23);
		String array1[]={"Engish","Maths"};
		object.setSubjects(array);
		String answer1=object1.toString();
		System.out.println(answer);
	}


}
