import java.util.Scanner;


public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of number");
		int num=sc.nextInt();
		PrintTriangle object=new PrintTriangle();
		String output[]=object.wholePyramid(num);
		for(int i=1;i<=num;i++)
		{
			System.out.println(output[i]);
			
		}
		

	}
	
	public String space(int row,int num)
	{
		String numSpace=new String();
		
		for(int i=1;i<row;i++)
			{
			numSpace=numSpace.concat(" ");
			}
		return numSpace;
	}
	
	public String number(int row,int num)
	{
		String value=new String();
		for(int i=1;i<=num-row+1;i++)
		{
			value=value+i;
		}
		
		return value;
		}
	
	 public String[] wholePyramid(int num)
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