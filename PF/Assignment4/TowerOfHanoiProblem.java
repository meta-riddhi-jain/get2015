import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*Class solves tower of Hanoi problem using recursion.
 * @riddhi jain
 * */
public class TowerOfHanoiProblem 
{	
	public static void main(String[] args) 
	{
		int numOfDisc;
		TowerOfHanoiProblem object=new TowerOfHanoiProblem();
		/*Input from user.*/
		numOfDisc=object.getNumberOfDisc();
		List<String> StringOutputArray;
		/*Define peg.*/
		String source="A",destination="B",temp="C";
		StringOutputArray =  object.towerOfHanoi(source,destination,temp,numOfDisc) ;
		System.out.println("Implementation of Tower of Hanoi for "+numOfDisc+" disc");
		/*Print solution of tower of Hanoi.*/
		for(String str : StringOutputArray)
		{
			System.out.println(str);
		}
	}
	
	/*Function takes number of disc as input.*/
	int getNumberOfDisc()
	{
		int number=0;
		Scanner sc = new Scanner(System.in);
		try
		{
			do
			{
			System.out.println("Enter number of disc :");
			number=Integer.parseInt(sc.nextLine());
			if(number<=0)
				System.out.println("Number less than equal to zero not allowed");
			}while(number<=0);
		}		
		catch(Exception e)
		{
			System.out.println("Sorry!! invalid input");
			System.exit(0);
		}
		
		return number;
	}
	
	/*Function has to solve tower of Hanoi Problem for n number of disc.
	 * It contains source,destination,temp,numberOfDisc as parameter.*/
	List<String> towerOfHanoi(String source, String destination, String temp, int numOfDisc)
	{	
		List<String> strArray = new ArrayList<String>();
		/*Base case.*/
		if(numOfDisc==0)
		{
			return strArray;	
		}
		else if(numOfDisc>=1)
		{
			strArray.addAll(towerOfHanoi(source,temp,destination,numOfDisc-1));//Recursion
			strArray.add("Move Disc "+numOfDisc+" from "+source+" to "+destination);
			strArray.addAll(towerOfHanoi(temp,destination,source,numOfDisc-1));//Recursion.
		}
		
		return strArray;	
	}
}
