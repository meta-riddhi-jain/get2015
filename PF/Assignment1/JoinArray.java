import java.util.Scanner;


public class JoinArray {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of array a");
		int a[]=new int[5];
		int b[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter elements of array b");
		for(int i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		int asize=a.length;
		int bsize=b.length;
		JoinArray object=new JoinArray();
		int c[]=new int[10];
		JoinArray object1=new JoinArray();
		int result[]=object1.join(a, asize, b, bsize, c);
		for(int i=0;i<10;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	int[] join(int a[],int asize,int b[],int bsize,int c[])
	{
		int k=0,m=0,l=0;
		while(k<asize && l<bsize)
		{
			if(a[k]<b[l])
			{
				c[m]=a[k];
				k++;
				m++;
			}
			else
			{
				c[m]=b[l];
				l++;
				m++;
			}
		}
			while(l<bsize)
			{
				c[m]=b[l];
				m++;
				l++;
			}
			while(k<asize)
			{
				c[m]=a[k];
				k++;
				m++;
	
			}
return c;
	}
	

}
