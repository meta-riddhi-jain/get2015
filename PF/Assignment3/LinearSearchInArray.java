import java.util.Scanner;


public class LinearSearchInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int y;
		do
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
			int index;
			System.out.println("Enter the value of array");
			for(index=0;index<size;index++)
			{
				array[index]=sc.nextInt();
			}

			index=0;                               //initializing index at the start of an array.
			System.out.println("Enter the number to be searched");
			int searchValue=sc.nextInt();
			LinearSearchInArray object=new LinearSearchInArray();
			int position=object.linearSearch(array,index,searchValue);
			if(position==-1)                        //If the value returned by the function is -1 that implies the number is not present in array.
			{
				System.out.println("Number not found");
			}
			else
				System.out.println("Number is found at position :" +position);

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
		}while(y==1);
	}

	public int linearSearch(int array[],int lowerBound, int searchValue){

		if(array.length==0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}

		if(lowerBound>array.length)
		{
			throw new ArrayIndexOutOfBoundsException();
		}

		if(lowerBound >= array.length){           //If Lower bound index of array increases than the upper bound index than the recursion stops and return to the calling function.
			return -1;                            //return value -1 if no match is found for the given number.
		}
		else{ if(array[lowerBound] == searchValue){
			return lowerBound;                    //If array at any index become equal to the search value, function returns the index of array.
		}
		}
		return linearSearch(array,lowerBound+1,searchValue); //else it iterates by increasing array lower bound by 1.
	}

}
