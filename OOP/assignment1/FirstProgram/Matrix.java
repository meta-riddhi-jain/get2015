package FirstProgram;
import java.util.Scanner;

/**
 * @author Riddhi Jain
 *
 */
public class Matrix {

	/**
	 * @param noRows contains the number of rows
	 * @param noColumns contains number of column in matrix
	 * @param data is the 2D matrix that stores the value of variable
	 */
	int noRows;
	int noColumns;
	int data[][];

	//Constructor to initialize the vale of parameters used in Matrix
	public Matrix(int noRows,int noColumns)
	{
		this.noRows=noRows;
		this.noColumns=noColumns;
		data=new int[noRows][noColumns];
	}
	//Function used to add elements to the matrix initialized
	public void addElements(int row,int column,int value)
	{
		data[row][column]=value;
	}

	//Function used to display the elements of the matrix
	public void show()
	{
		for(int index=0;index<noRows;index++)
		{
			for(int index2=0;index2<noColumns;index2++)
			{
				System.out.print(data[index][index2]+" ");
			}
			System.out.println();
		}

	}
	//Function to calculate the transpose of the matrix 
	public Matrix transpose()
	{
		int transpose[][]=new int[noRows][noColumns];
		for(int index=0;index<noRows;index++)
		{
			for(int index2=0;index2<noColumns;index2++)
			{
				//changing the row and column value to change the location of the integer value
				transpose[index2][index]=data[index][index2];
			}
		}
		for(int index=0;index<noRows;index++)
		{
			for(int index2=0;index2<noColumns;index2++)
			{
				//storing the transposed datda once again in the original matrix or 2D array initialized
				data[index][index2]=transpose[index][index2];
			}
		}
		return this;
	}


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int value;
		int noRows,noColumns;
		try
		{
			do
			{
				System.out.println("Enter the number of rows");
				noRows=sc.nextInt();
			}while(noRows<=0);
			do
			{
				System.out.println("Enter the number of columns");
				noColumns=sc.nextInt();
			}while(noColumns<=0);
			Matrix object=new Matrix(noRows,noColumns);
			System.out.println("Enter elements in the matrix :");
			for(int index=0;index<noRows;index++)
			{
				for(int index2=0;index2<noColumns;index2++)
				{
					value=sc.nextInt();
					object.addElements(index, index2,value);
				}
			}
			System.out.println("Elements entered in the matrix are :");
			object.show();
			Matrix object2=object.transpose();
			System.out.println("Transpose of a matrix is :");
			object2.show();
		}catch(Exception e)
		{
			System.out.println("Sorry! Enter a valid integer value");
		}
	}
}
