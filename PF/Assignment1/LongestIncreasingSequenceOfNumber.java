
import java.util.Scanner;


public class LongestIncreasingSequenceOfNumber {

	public static void main(String[] args) 
	{
		int input[]=new int[25];	
		int index;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements in array");
		for(index=0;index<25;index++)
			input[index]=Integer.parseInt(sc.next());
		LongestIncreasingSequenceOfNumber object=new LongestIncreasingSequenceOfNumber();
		int output[]=object.longestIncreasingSeqeunce(input);
		System.out.println("Longest Sub Sequence is");
		for(index=0;output[index]!=0;index++)
			System.out.print(output[index]+" ");
	}

	public int[] longestIncreasingSeqeunce(int arr[])
	{
		//1 2 3 2 3 4 5 3 4 2 2 3 4 5 6 7 8 1 2 4 5 6 7 8 9

		int max=0,count=0,pos=0,p=0;
		for(pos=0;pos<=arr.length-1;pos++)
		{
			if((pos==arr.length-1)||((arr[pos]>arr[pos+1])))
			{
				count=count+1; 
				if(count>max)
				{
					max=count;
					p=pos+1-max;
				}
				count=0;
			}
			else if((arr[pos]<arr[pos+1]))
			{
				count=count+1;
			}
		}
		int index;
		int arr1[]=new int[max];
		for(index=0,pos=p;pos<=p+max-1;pos++,index++)
		{
			arr1[index]=arr[pos];
		}
		return arr1;
	}

}
