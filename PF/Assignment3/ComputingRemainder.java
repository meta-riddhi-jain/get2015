import java.util.Scanner;


public class ComputingRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Try Block to detect Exceptions
		int y,divisor,dividend;
		do
		{
			y=0;
			try
			{
				do
				{
					System.out.println("Enter the divisor");
					divisor=sc.nextInt();

					//Exiting system if the value entered by the user is negative
					if(divisor<0 )
					{
						System.out.println("Enter a positive number");
					}
				}while(divisor<0);

				do
				{
					System.out.println("Enter the divident");
					dividend=sc.nextInt();

					//Exiting system if the value entered by the user is negative
					if(dividend<0 )
					{
						System.out.println("Enter a positive number");
					}
				}while(dividend<0);


				ComputingRemainder object=new ComputingRemainder();
				int result=object.remainder(divisor,dividend);
				if (result==-1)
				{
					System.out.println("Divide by zero not posiible");
				}
				else
					System.out.println("On dividing "+divisor+" by "+dividend+" remainder is : "+result);


			}
			catch(ArithmeticException e)
			{
				System.out.println("Divide by zero error");
			}
			catch(Exception e)
			{
				System.out.println("Error :"+e+"\nEnter a valid input");
			}
			System.out.println("Press one to continue,Else Zero to exit");
			y=sc.nextInt();
		}while(y==1);



	}

	public int remainder(int divisor,int dividend)
	{
		int rem=0;
		if(dividend==0)
		{
			return -1;         //If Dividend is equal to zero than no need to subtract the dividend from divisor, directly divide the two.
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
