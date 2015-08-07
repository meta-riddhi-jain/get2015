
import java.util.*;


public class BinaryToOctal {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=Integer.parseInt(sc.nextLine());
		BinaryToOctal object1=new BinaryToOctal();
		int output=object1.convertBinaryToOctal(num);
		System.out.println("Octal Value is "+output);
		

	}
	
	int convertBinaryToOctal(int num)
	{
		
		int decimal=0,i=0,octal=0;
		while(num!=0)
		{
			decimal+=(num%10)*(int)Math.pow(2, i);
            i++;
            num/=10;
		}
		i=1;
		while(decimal!=0)
		{
			octal+=(decimal%8)*i;
			decimal/=10;
			i*=10;
		}
	return octal;
	}

}
