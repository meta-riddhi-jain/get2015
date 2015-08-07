import java.util.Scanner;


public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of number");
		int num=sc.nextInt();
		PrintTriangle object=new PrintTriangle();
		String output[]=object.wholeTriangle(num);
		for(int i=1;i<=num;i++)
		{
			System.out.println(output[i]);
			
		}
		

	}
	//function to print spaces in the pattern
	public String space(int row,int num)
	{
		String numSpace=new String();
		
		for(int i=1;i<row;i++)
			{
			numSpace=numSpace.concat(" ");
			}
		return numSpace;
	}
	
	//function to print the value in the pattern
	public String number(int row,int num)
	{
		String value=new String();
		for(int i=1;i<=num-row+1;i++)
		{
			value=value+i;
		}
		
		return value;
		}
	
	//function to print whole triangle
	 public String[] wholeTriangle(int num)
	{
		Scanner sc=new Scanner(System.in);
		String result[]=new String[num+1];
		for(int i=1;i<=num;i++)
		{
			result[i]=(space(i, num)+number(i, num));
			
		}
		return result;
	}
	}