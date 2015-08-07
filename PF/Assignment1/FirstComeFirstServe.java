import java.util.Scanner;


public class FirstComeFirstServe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int arrival_time[]=new int[4];
       int job_size[]=new int[4];
       System.out.println("Enter arrival Time for 4 jobs");
       for(int i=0;i<4;i++)
       {
    	   arrival_time[i]=sc.nextInt();
    	  
       }
       System.out.println("Enter job Size for 4 jobs");
       for(int i=0;i<4;i++)
       {
    	   job_size[i]=sc.nextInt();
       }
       FirstComeFirstServe object=new FirstComeFirstServe();
       int result[][]=object.FCFS(arrival_time, job_size);
       for(int i=0;i<4;i++)
       {
    	   for(int j=0;j<4;j++)
    	   {
    		   System.out.print(result[i][j]+" "); 
    	   }
    	   
    	   System.out.println();
       }
	}

	int[][] FCFS(int arrival_time[],int job_size[])
	{
		int job_start[]=new int[4];
		int job_wait[]=new int[4];
		int job_finished[]=new int[4];
		int count=0;
		for(int i=0;i<arrival_time.length;i++)
		{
		if(count<arrival_time[i])
		{
			job_wait[i]=0;
			job_start[i]=arrival_time[i];
			job_finished[i]=job_start[i]+job_size[i]-1;
		}
		else
		{
			job_wait[i]=count+1-arrival_time[i];
			job_start[i]=arrival_time[i]+job_wait[i];
			job_finished[i]=job_start[i]+job_size[i]-1;
		}
		
		count=count+job_size[i];
		}
		int output[][]=new int[4][4];
		
		for(int i=0;i<arrival_time.length;i++)
		{
			
			 output[i][0]=arrival_time[i];
			 output[i][1]=job_wait[i];
			 output[i][2]=job_start[i];
			 output[i][3]=job_finished[i];
			
		}
		return output;
	}
}
