package ThirdProgram;

/**
 * 
 * @author Riddhi
 *
 */
public class Square implements Shape {
	/**
	 * @param side stores the side of square
	 */
	private int side;
	//Constructor of the class
	public Square(int side)
	{
		this.side=side;
	}
	//Returns the message 
	public String draw()
	{
		return "In Square";
	}
	//Calculates the area of square
	public double getArea()
	{
		double area=side*side;
		return area;
	}
}
