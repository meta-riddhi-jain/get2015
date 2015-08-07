
import java.util.Scanner;


public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		Pattern1 object=new Pattern1();
		String output[]=object.wholePyramid(n);
		for(int i=0;i<2*n-1;i++)
		{
			System.out.println(output[i]);
		}

	}
	
	String space(int row,int n)
	{
		String numSpace=new String();
		for(int i=row;i<=n;i++)
		{
			numSpace=numSpace.concat(" ");
		}
		return numSpace;
	}
	String number(int row,int n)
	{
		String value=new String();
		for(int i=1;i<=row;i++)
		{
			value=value+i;
		}
		for(int i=row-1;i>=1;i--)
		{
			value=value+i;
		}
		return value;
		
	}
	String[] wholePyramid(int n)
	{
		Scanner sc=new Scanner(System.in);
		
		Pattern1 object1=new Pattern1();
		String result[]=new String[2*n-1];
		int j=0;
		for(int i=1;i<=n;i++)
		{
			result[j]=(object1.space(i, n)+object1.number(i, n));
		j++;	
		}
		for(int i=n-1;i>=1;i--)
		{
			result[j]=(object1.space(i, n)+object1.number(i, n));
			j++;
		}
	return result;
	}
	

}
