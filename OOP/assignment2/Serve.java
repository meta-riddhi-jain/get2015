import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.io.*;


public class Serve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> question=new ArrayList<String>();
		question=Questions.readQuestions();
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		int count=0,y=0,numOfParticipants=0;
		List<String> participantAnswers=new ArrayList<String>();
		String value="";
		String result="";
		HashMap<Integer,String> output=new HashMap<Integer,String>();
		Answer object=new Answer();
		int answer;
		try
		{
			do
			{
				System.out.println("Enter your choice:");
				System.out.println("1. Do serve");
				System.out.println("2. Total Percentage Distribution");
				System.out.println("3. Final Output");
				System.out.println("4. Exit");
				answer=Integer.parseInt(sc.readLine());
				if(answer==1)
				{			
					//If the user wants to do the serve and answer the questions
					numOfParticipants++;
					for(String s:question)
					{
						do
						{
						System.out.println(s);
						value=sc.readLine();
						result=object.checkOption(value,s);
						}while(result.equals(""));
						participantAnswers.add(result);
					}

					output =object.storeAnswer(count,participantAnswers.get(0),participantAnswers.get(1),participantAnswers.get(2),output);
					count+=3;
					participantAnswers.clear();
				}
				else if(answer==2)
				{
					//If the user wants the percentage for an option opted by the participants
					object.totalPercentage(output, numOfParticipants,count);
				}
				else if(answer==3)
				{
					//If the user wants to see all the answers for all participants
					object.display(output, question,numOfParticipants);
				}
				else if(answer==4)
				{
					//If the user wants to exit from the program
					System.out.println("Thanks for visitng. Have a nice day, Bye");
					System.exit(0);
				}
				else
				{
					//If a user enters a value other than available options
					System.out.println("Enter a value from the available options");
				}
				System.out.println("Press 0 to continue Or 1 to exit");
				y=Integer.parseInt(sc.readLine());
			}while(y==0);


		}
		catch(Exception e)
		{
			System.out.println("Enter a valid integer value");
		}
	}

}
