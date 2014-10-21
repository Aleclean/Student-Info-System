import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Database
	{
	Scanner file = new Scanner(new File ("classroster.txt"));	
	
	String firstName = file.nextInt();
	String lastName = file.nextInt();
	String courseOne = file.nextInt();
	String gradeOne = file.nextInt();
	String courseTwo = file.nextInt();
	String gradeTwo = file.nextInt();
	String courseThree = file.nextInt();
	String gradeThree = file.nextInt();
	double gpa = 0;
	}
