
import java.util.Scanner;


public class PrintDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of center of pyramid");
		int center=sc.nextInt();
		PrintDiamond object=new PrintDiamond();
		String output[]=object.wholePyramid(center);
		for(int index=0;index<2*center-1;index++)
		{
			System.out.println(output[index]);
		}

	}

	//Function to print the number of spaces
	public String space(int row,int center)
	{
		String numSpace=new String();
		for(int index=row;index<=n;index++)
		{
			numSpace=numSpace.concat(" ");
		}
		return numSpace;
	}
	
	//Function to print the numbers
	public String number(int row,int center)
	{
		String value=new String();
		for(int index=1;index<=row;index++)
		{
			value=value+index;
		}
		for(int index=row-1;index>=1;index--)
		{
			value=value+index;
		}
		return value;

	}
	
	//Function to print whole pyramid
	public String[] wholePyramid(int center)
	{
		Scanner sc=new Scanner(System.in);

		PrintDiamond object1=new PrintDiamond();
		String result[]=new String[2*center-1];
		int index2=0;
		for(int index=1;index<=center;index++)
		{
			result[index2]=(object1.space(index, center)+object1.number(index, center));
			index2++;	
		}
		for(int index=center-1;index>=1;index--)
		{
			result[index2]=(object1.space(index, center)+object1.number(index, center));
			index2++;
		}
		return result;
	}


}
