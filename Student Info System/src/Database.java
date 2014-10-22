import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Database
	{
	Scanner file = new Scanner(new File ("classroster.txt"));	
	
	String firstName = file.next();
	String lastName = file.next();
	String courseOne = file.next();
	String gradeOne = file.next();
	String courseTwo = file.next();
	String gradeTwo = file.next();
	String courseThree = file.next();
	String gradeThree = file.next();
	double gpa = 0;
	
	ArrayList <Student> StudentList = new ArrayList <Student>();
		{
		
		}
	}
