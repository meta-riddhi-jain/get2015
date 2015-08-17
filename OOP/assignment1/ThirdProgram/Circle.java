package ThirdProgram;

/**
 * 
 */

/**
 * @author Riddhi
 *
 */
public class Circle implements Shape{

	/**
	 * @param radius stores radius of a user
	 */
	private int radius;
	private double pi=3.14;
	//Constructor of the class
	public Circle(int radius)
	{
		this.radius=radius;
	}
	//Returns the message 
	public String draw()
	{
		return "In Circle";
	}
	//Calculates the area of circle
	public double getArea()
	{
		double Area=pi*((int)Math.pow(radius,2));
		return Area;
	}

}
