import java.util.Scanner;


public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		Pattern2 object=new Pattern2();
		String output[]=object.wholePyramid(n);
		for(int i=1;i<=n;i++)
		{
			System.out.println(output[i]);
			
		}
		

	}
	
	String space(int row,int n)
	{
		String numSpace=new String();
		
		for(int i=1;i<row;i++)
			{
			numSpace=numSpace.concat(" ");
			}
		return numSpace;
	}
	
	String number(int row,int n)
	{
		String value=new String();
		for(int i=1;i<=n-row+1;i++)
		{
			value=value+i;
		}
		
		return value;
		}
	
	String[] wholePyramid(int n)
	{
		Scanner sc=new Scanner(System.in);
	
		Pattern2 object1=new Pattern2();
		String result[]=new String[n+1];
		for(int i=1;i<=n;i++)
		{
			result[i]=(object1.space(i, n)+object1.number(i, n));
			
		}
		return result;
	}
	}