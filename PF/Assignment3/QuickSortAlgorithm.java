import java.io.IOException;
import java.util.EmptyStackException;
import java.util.Scanner;


public class QuickSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int y;
		do                                //do while loop to perform Quick Sort again.
		{
			y=0;
			try
			{
				System.out.println("Enter the size of array");
				int size=sc.nextInt();
				if(size==0)
				{
					throw new ArrayIndexOutOfBoundsException();
				}
				int array[]=new int[size];
				int index;               //Initializing index to the start of an array.
				System.out.println("Enter the value of array");
				for(index=0;index<size;index++)
				{
					array[index]=sc.nextInt();
				}
				QuickSortAlgorithm object=new QuickSortAlgorithm();
				int output[]=object.quickSort(array, 0, size-1);
				System.out.println("Sorted array is :");
				for(index=0;index<size;index++)
				{
					System.out.print(output[index]+" ");

				}
				System.out.println();
			}
			catch(ArrayIndexOutOfBoundsException e)         //Catch the Exception if user enters the size of array 0.
			{
				System.out.println("Enter proper array size value");
			}
			catch(Exception e)                             //Catch the exception raised if user enters value other than integer.
			{
				System.out.println("Enter valid integer value");
			}
			System.out.println("Press one to continue,Else Zero to exit");
			y=sc.nextInt();
		}while(y==1);              //If you want to continue than press 1, else 0.

	}

	public int[] quickSort(int array[],int startIndex, int endIndex)
	{

		if(array.length==0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		int index = partition(array, startIndex, endIndex); 

		//Recursively call quick sort function with left part of the partitioned array 
		if (startIndex < index - 1) 
		{ 
			quickSort(array, startIndex, index - 1); 
		} 

		// Recursively call quick sort function with right part of the partitioned array 
		if (endIndex > index) 
		{ 
			quickSort(array, index, endIndex); 
		} 
		return array;
	}

	//Function to return the position of the number which is placed correctly
	private int partition(int array[],int left, int right)
	{
		int pivot=array[left];

		while(left <= right)
		{
			//Compares with each value of array till the number is at correct position with the value in left
			while(array[left]< pivot)
			{
				left++;
			}
			//Compares with each value of array till the number is at correct position with the value in right
			while(array[right] > pivot)
			{
				right--;
			}

			//If number is not at correct position then it is swapped with the number stored in array at that index
			if(left <= right)
			{
				int temporary = array[left];
				array[left] = array[right];
				array[right] = temporary;
				left++;
				right--;
			}
		}
		return left;  //Return the index of the number placed at correct position
	}
}
