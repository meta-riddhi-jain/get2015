import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Riddhi
 *
 */

public class Questions {

	public static String location="C://Users/Riddhi/workspace/OOPAssignment2/src/questions.csv";
	public static List<String> question=new ArrayList<String>();
	public static String line="";
	public static List<String> readQuestions()
	{

		try
		{
			//Reading the questions stored in the csv file
			BufferedReader br=new BufferedReader(new FileReader(location));
			while((line=br.readLine())!=null)
			{
				String[] token=line.split(",");
				//Questions are added in the list of string type
				question.add(token[0]+" "+token[1]);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);

		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		return question;
	}

}
