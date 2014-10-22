import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Database 
	{
	
	static ArrayList <Student> studentList = new ArrayList <Student>();
	
	public static void fillDataBase()  throws IOException 
		{
	Scanner file = new Scanner(new File ("studentlist (2).txt"));	
	
	String firstName = file.next();
	String lastName = file.next();
	String courseOne = file.next();
	String gradeOne = file.next();
	String courseTwo = file.next();
	String gradeTwo = file.next();
	String courseThree = file.next();
	String gradeThree = file.next();
	double gpa = 0;
	
		
		while(file.hasNext());
			{
			studentList.add(new Student(firstName, lastName, courseOne, gradeOne, courseTwo, gradeTwo, courseThree, gradeThree, 0.0));
			}
		}
		
	}
	
	
		
	
