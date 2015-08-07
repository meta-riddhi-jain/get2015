import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input[]=new int[14];
		System.out.println("Enter the elements of array");
		for(int i=0;i<14;i++)
		{
			input[i]=sc.nextInt();
		}
		RemoveDuplicate object1=new RemoveDuplicate();
		int output[]=object1.removeDuplicate(input);
		for(int i=0;i<output.length;i++)
		{
			System.out.print(output[i]+" ");
		}

	}

	int[] removeDuplicate(int input[])
	{
		
	  int count=0;
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i]==input[j] && input[i]!='\0')
				{
				input[j]='\0';
				count++;
				}
			}
		}
		
		int j=0;
		int newArr[]=new int[input.length-count];
			for(int i=0;i<input.length;i++)
			{
				
			if(input[i]!='\0')
			{
				newArr[j]=input[i];
				j++;
			}
			
			}
			
			return newArr;
	}
	}
