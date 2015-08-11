import java.util.*;

public class FindLargestDigitInNumber {
	//Globally declaring the variable largest number instead of passing it in function
	int largestNumber=0;

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int y;
		do
		{
			y=0;
		int number;
		try
		{
			do
			{
			System.out.println("Enter the number");
			number=sc.nextInt();
			//Exiting system if the value entered by user is negative
			if(number<0)
			{
				System.out.println("Negative Number not allowed");
			}
			}while(number<0);
			FindLargestDigitInNumber object=new FindLargestDigitInNumber();
			int final_output=object.largestDigit(number);
			System.out.println("Largest digit in the number is"+final_output);
		}
		catch(Exception e)    //Catch the exception raised if user enters value other than integer.
		{
			System.out.println("Enter a valid integer input");
		}
		System.out.println("Press one to continue,Else Zero to exit");
		y=sc.nextInt();
		}while(y==1);
	}

	public int largestDigit(int number)
	{
		int max=number%10;          
		number=number/10;
		if(number!=0)
		{
			//Recursively calling the function with changed parameters, each time dividing the original number by 10 and reducing it by one digit.
			largestNumber=largestDigit(number);
		}
		if(max>largestNumber) 
		{
			largestNumber=max;    //if the value of maximum is greater than the largest, then value of the largest number is updated
		}

		return largestNumber;   //Largest digit of the number is returned
	}
}
