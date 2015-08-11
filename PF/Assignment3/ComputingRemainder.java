import java.util.Scanner;


public class ComputingRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Try Block to detect Exceptions
		try
		{
			System.out.println("Enter the divisor");
			int divisor=sc.nextInt();

			//Exiting system if the value entered by the user is negative
			if(divisor<0 )
			{
				System.out.println("Enter a positive number");
				System.exit(0);
			}
			System.out.println("Enter the divident");
			int dividend=sc.nextInt();

			//Exiting system if the value entered by the user is negative
			if(dividend<0 )
			{
				System.out.println("Enter a positive number");
				System.exit(0);
			}
			else
			{
				ComputingRemainder object=new ComputingRemainder();
				int result=object.remainder(divisor,dividend);
				System.out.println("On dividing "+divisor+" by "+dividend+" remainder is : "+result);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero error");
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e+"\nEnter a valid input");
		}



	}

	public int remainder(int divisor,int dividend)
	{
		int rem=0;
		if(dividend==0)
		{
			rem=divisor%dividend;         //If Dividend is equal to zero than no need to subtract the dividend from divisor, directly divide the two.
		}
		else if(divisor>=dividend && dividend!=0)
		{
			divisor=divisor-dividend;
			//Every time while recursively calling the function the value of dividend is subtracted from divisor until the value of divisor is smaller divident
			rem=remainder(divisor,dividend);
		}
		else
		{
			return divisor;  //returns divisor if at first divisor is smaller than dividend.
		}
		return rem;   //returns the remainder on dividing the two.
	}
}
