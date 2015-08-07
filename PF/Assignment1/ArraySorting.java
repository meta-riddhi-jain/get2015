import java.util.Scanner;

public class ArraySorting
{
	public static void main(String[] args) 
	{
	         int size,index1,status;
	         Scanner sc= new Scanner(System.in);	
	         System.out.println("Enter the size of array :");
	         size = Integer.parseInt(sc.nextLine());
	         System.out.println("Enter the array :");
	         int inputArray[]=new int[size];
	         for(index1=0;index1<size;index1++)
	         {
	        	 inputArray[index1]=Integer.parseInt(sc.next());
	         }
	   
	         ArraySorting object=new ArraySorting();
	         status=object.find_order_array(inputArray);
	         switch(status)
	         
	         {
	         case 0: System.out.println("Array is not sorted in any order");
     		 		 break;
	         case 1: System.out.println("Array is in ascending order");
	         	     break;
	         case 2: System.out.println("Array is in descending order");
	         		 break;
	         
	         }	
	   
	}
	//Applying loop to sort the array according to the order
	public int find_order_array(int array[])
		    {
				int status=0,index1;
				for(index1=1;index1<array.length;index1++)
				{
					if(array[index1-1]>array[index1])
					{
						if(status==1)
						{
							status=0;
							break;
						}
						status=2;
					}
					else if(array[index1-1]<array[index1])
					{
						if(status==2)
						{
							status=0;
							break;
						}
						status=1;
					}
				}
				return status;
		    }
}

