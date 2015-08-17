package ThirdProgram;
import java.util.Scanner;
/**
 * Super class that contains main function
 * @author Riddhi
 *
 */

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius,side;
		try
		{
			Scanner sc=new Scanner(System.in);
			do
			{
				//Takes input from the user
				System.out.println("Enter the radius of circle");
				radius=sc.nextInt();
				if(radius<=0)
					//Prints this message and iterates until a positive value is entered
					System.out.println("Enter a positive value for radius");
			}while(radius<=-1);
			Shape circleShape=new Circle(radius);
			MainShape object=new MainShape();
			//Object of class is made with input parameter
			object.printShape(circleShape);
			do
			{
				//Takes input from the user
				System.out.println("Enter the side of square");
				side=sc.nextInt();
				if(side<=0)
					//Prints this message and iterates until a positive value is entered
					System.out.println("Enter a positive value for side of square");
			}while(side<=-1);
			//Object of class is made with input parameter
			Shape squareShape=new Square(side);
			object.printShape(squareShape);
			//Catch an exception if the value entered is invalid
		}catch(Exception e)
		{
			System.out.println("Enter a valid input");
		}
	}
	//used to call the function of the class whose object is passed
	void printShape(Shape shapeObject)
	{
		System.out.println(shapeObject.draw());
		System.out.println(shapeObject.getArea());
	}
}
