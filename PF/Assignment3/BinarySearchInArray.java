import java.util.*;

public class BinarySearchInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the size of array");
			int size=sc.nextInt();
			if(size==0)
			{
				throw new ArrayIndexOutOfBoundsException();
			}
			int array[]=new int[size];
			int index;
			System.out.println("Enter the value of array");
			for(index=0;index<size;index++)
			{
				array[index]=sc.nextInt();
			}
			index=0;                   //Initializing index at the start of an array.
			System.out.println("Enter the number to be searched");
			int num=sc.nextInt();
			BinarySearchInArray object=new BinarySearchInArray();
			int location=object.binarySearch(array,index,size-1,num);
			//System.out.println(location);
			if(location==-1)           //If the value returned by the function is -1 that implies the number is not present in array.
			{
				System.out.println("Number not found");
			}
			else
				System.out.println("Number is found at position :" +(location+1));
		}
		catch(ArrayIndexOutOfBoundsException e)         //Catch the Exception if user enters the size of array 0.
		{
			System.out.println("Enter proper array size value");
		}
		catch(Exception e)                             //Catch the exception raised if user enters value other than integer.
		{
			System.out.println("Enter valid integer value");
		}

	}

	public int binarySearch(int array[],int lowerBound,int upperBound,int num)
	{
		int mid=(lowerBound+upperBound)/2;
		if(lowerBound <= upperBound)
		{
			if(array[mid]==num){     //compare the value of the middle element of array with the number. If it is equal than return its position.
				return mid;
			}
			else if(array[mid] < num)    //If number is greater than middle element than the array is divide into two equal half array and upper half array is again serched for number 
			{  
				return binarySearch(array,mid+1,upperBound,num);
			}
			else                         //If number is smaller than middle element than the array is divide into two equal half array and lower half array is again serched for number
				return binarySearch(array,lowerBound,mid-1,num);

		}
		else
			return -1;            //-1 is returned if the number is not equal to any of the element of array.


	}

}
