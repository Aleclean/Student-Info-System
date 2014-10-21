import java.util.ArrayList;
import java.util.Scanner;



public class StudentList
	{
	
	private String lastName;
	private String firstName;
	private String courseOne;
	private String gradeOne;
	private String courseTwo;
	private String gradeTwo;
	private String courseThree;
	private String gradeThree;
	private double gpa;
	
	Scanner file = new Scanner (new File ("studentlist.txt"));
	

	public StudentList(String l, String f, String co, String go, String ct, String gt, String cth, String gth, double g)
	{
		lastName = l;
		firstName = f;
		courseOne = co;
		gradeOne = go;
		courseTwo = ct;
		gradeTwo = gt;
		courseThree = cth;
		gradeThree = gth;
		gpa = g;
	}
	
	
		
	// loop through data file and add to array list
	// constructor needs all 10 parts
	
	
	ArrayList <Student> StudentList = new ArrayList <Student>();
	}

//	Scanner file = new Scanner (new File ("snacks.txt"));
//	int numberOfLinesOfData = file.nextInt();
	ArrayList <Student> studentList = new ArrayList();
	
//			
//	ArrayList <Product> products = new ArrayList();
//	for(int i = 0; i < numberOfLinesOfData; i ++)
//	import SIS file
//	import java.util.ArrayList;
//	constructor
//		first name String
//		last name String
//		Course one Stirng
//		grade one String
//		Course two String
//		grade two String
//		Course three String
//		grade three Stirng
//		GPA double
//			getters/setters
//	makeStudentList();
//	add Students to an arrayList
//			ArrayList <Student> StudentList = new ArrayList <Student>(); 
	}
