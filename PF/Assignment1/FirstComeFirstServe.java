import java.util.Scanner;


public class FirstComeFirstServe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of jobs");
		int num=sc.nextInt();
		int arrival_time[]=new int[num];
		int job_size[]=new int[num];
		System.out.println("Enter arrival Time for 4 jobs");
		for(int index=0;index<num;index++)
		{
			arrival_time[index]=sc.nextInt();

		}
		System.out.println("Enter job Size for 4 jobs");
		for(int index=0;index<num;index++)
		{
			job_size[index]=sc.nextInt();
		}
		FirstComeFirstServe object=new FirstComeFirstServe();
		int result[][]=object.FCFS(arrival_time, job_size);
		for(int index=0;index<num;index++)
		{
			for(int index2=0;index2<4;index2++)
			{
				System.out.print(result[index][index2]+" "); 
			}

			System.out.println();
		}
	}

	public int[][] FCFS(int arrival_time[],int job_size[])
	{
		int job_start[]=new int[job_size.length];
		int job_wait[]=new int[job_size.length];
		int job_finished[]=new int[job_size.length];
		int count=0;
		
		//Applying First Come First Serve CPU Scheduling Algorithm
		for(int index=0;index<arrival_time.length;index++)
		{
			if(count<=arrival_time[index])
			{
				job_wait[index]=0;
				job_start[index]=arrival_time[index];
				job_finished[index]=job_start[index]+job_size[index];
			}
			else
			{
				job_wait[index]=count-arrival_time[index];
				job_start[index]=arrival_time[index]+job_wait[index];
				job_finished[index]=job_start[index]+job_size[index];
			}
			if(index==0)
				count=count+job_size[index]+arrival_time[index];
			else
				count=count+job_size[index];
		}
		
		//Fixed size 4 for entering values of all 4 array.
		int output[][]=new int[job_size.length][4];
		
		//Final output
		for(int index=0;index<arrival_time.length;index++)
		{

			output[index][0]=arrival_time[index];
			output[index][1]=job_wait[index];
			output[index][2]=job_start[index];
			output[index][3]=job_finished[index];

		}
		return output;
	}
}
