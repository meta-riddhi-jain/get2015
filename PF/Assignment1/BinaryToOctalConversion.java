
import java.util.*;


public class BinaryToOctalConversion {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number in binary");
		num=Integer.parseInt(sc.nextLine());
		BinaryToOctalConversion object=new BinaryToOctalConversion();
		int output=object.convertBinaryToOctal(num);
		System.out.println("Octal Value is "+output);


	}

	public int convertBinaryToOctal(int num)
	{

		int decimal=0,i=0,octal=0;
		
		//Converting binary number to decimal number
		while(num!=0)
		{
			decimal+=(num%10)*(int)Math.pow(2, i);
			i++;
			num/=10;
		}
		System.out.println(decimal);
		i=1;

		//Converting decimal number to octal number
		while(decimal!=0)
		{
			octal+=(decimal%8)*i;
			decimal/=8;
			i*=10;
		}
		return octal;
	}

}
