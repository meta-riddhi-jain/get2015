import java.util.Scanner;


public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of array");
		int input[]=new int[5];
		for(int i=0;i<5;i++)
		{
			input[i]=sc.nextInt();
		}
		SortedArray object=new SortedArray();
		int output=object.arraySortedOrNot(input);
		if(output==2)
		{
			System.out.println(" Desending sorted array");	
		}
		else if(output==1)
		{
			System.out.println("Assending sorted array");
		}
		else
			System.out.println("Unsorted array");
	}

	int arraySortedOrNot(int input[])
	{
		int count=0;
		for(int i=1;i<input.length;i++)
		{
			if(input[i-1]<input[i])
			{
				count++;
			}
			
		}
		if(count==0)
		{
			return 2;
		}
		else if(count==(input.length-1))
		{
			return 1;                                                          
		}
		else
			return 0;
	}
}
