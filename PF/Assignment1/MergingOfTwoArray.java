import java.util.Scanner;


public class MergingOfTwoArray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array a");
		int asize=sc.nextInt();

		int a[]=new int[asize];


		System.out.println("Enter elements of array a");
		for(int index=0;index<asize;index++)
		{
			a[index]=sc.nextInt();
		}
		System.out.println("Enter size of array b");
		int bsize=sc.nextInt();
		int b[]=new int[bsize];
		System.out.println("Enter elements of array b");
		for(int index=0;index<bsize;index++)
		{
			b[index]=sc.nextInt();
		}
		MergingOfTwoArray object=new MergingOfTwoArray();
		int result[]=new int[asize+bsize];
		MergingOfTwoArray object1=new MergingOfTwoArray();
		int output[]=object1.join(a, asize, b, bsize, result);
		for(int i=0;i<10;i++)
		{
			System.out.print(output[i]+" ");
		}
	}

	//Applying merge sort on two already sorted array input
	public int[] join(int a[],int asize,int b[],int bsize,int result[])
	{
		int aindex=0,resultindex=0,bindex=0;
		while(aindex<asize && bindex<bsize)
		{
			if(a[aindex]<b[bindex])
			{
				result[resultindex]=a[aindex];
				aindex++;
				resultindex++;
			}
			else
			{
				result[resultindex]=b[bindex];
				bindex++;
				resultindex++;
			}
		}
		while(bindex<bsize)
		{
			result[resultindex]=b[bindex];
			resultindex++;
			bindex++;
		}
		while(aindex<asize)
		{
			result[resultindex]=a[aindex];
			aindex++;
			resultindex++;

		}
		return result;
	}


}
