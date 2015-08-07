import java.util.*;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int input[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int index=0;index<size;index++)
		{
			input[index]=sc.nextInt();
		}
		RemoveDuplicateElements object1=new RemoveDuplicateElements();
		int output[]=object1.removeDuplicateElementsOfArray(input);
		for(int index=0;index<output.length;index++)
		{
			System.out.print(output[index]+" ");
		}

	}

	public int[] removeDuplicateElementsOfArray(int input[])
	{
		//Replacing duplicate elements in array by ' '.
		int count=0;
		for(int index=0;index<input.length;index++)
		{
			for(int index2=index+1;index2<input.length;index2++)
			{
				if(input[index]==input[index2] && input[index]!=' ')
				{
					input[index2]=' ';
					count++;
				}
			}
		}
		
		//Updated Array
		int index2=0;
		int newArr[]=new int[input.length-count];
		for(int index=0;index<input.length;index++)
		{

			if(input[index]!=' ')
			{
				newArr[index2]=input[index];
				index2++;
			}

		}

		return newArr;
	}
}
