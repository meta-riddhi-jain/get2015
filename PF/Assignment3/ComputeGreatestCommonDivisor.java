import java.util.Scanner;


public class ComputeGreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the value for 1st number");
			int num1=sc.nextInt();
			//Exiting system if the value entered by the user is negative or zero
			if(num1<=0 )
			{
				System.out.println("Number equal to zero or smaller than zero not allowed");
				System.exit(0);
			}
			System.out.println("Enter the value for 2nd number");
			int num2=sc.nextInt();
			//Exiting system if the value entered by the user is negative or zero
			if(num2<=0 || num1<=0 )
			{
				System.out.println("Number equal to zero or smaller than zero not allowed");
				System.exit(0);
			}
			ComputeGreatestCommonDivisor object=new ComputeGreatestCommonDivisor();
			int result=object.gcd(num1,num2);
			System.out.println("Greatest common divisor of two numbers is :"+result);
		}
		catch(ArithmeticException e)
		{
			//Catch an exception if at any point an integer value is divided by zero.
			System.out.println("Divide by zero error");
		}
		catch(Exception e)
		{
			//Catch an exception if the input value is alphabet or any other than integer.
			System.out.println("Enter a valid integer input");
		}

	}

	public int gcd(int number1,int number2)
	{
		int result=1;
		if(number1==number2)           //If both the numbers are equal than the gcd is the number itself.   
		{
			return number2;
		}
		else
		{
			//Subtracting the value of smaller number from larger number to recursively call the function with changed parameters to find gcd.
			if(number1<number2)
				result=gcd(number1,number2-number1);
			else
				result=gcd(number2,number1-number2);     
			return result;
		}
	}

}
