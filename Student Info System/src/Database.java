import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Database
	{
	static ArrayList<Student> studentList = new ArrayList<Student>();
	
	public static void fillDataBase() throws IOException
		{
		Scanner file = new Scanner(new File("studentlist (2).txt"));
		
		while(file.hasNext())
			{
			String firstName = file.next();
			String lastName = file.next();
			String courseOne = file.next();
			String gradeOne = file.next();
			String courseTwo = file.next();
			String gradeTwo = file.next();
			String courseThree = file.next();
			String gradeThree = file.next();
			double gpa = 0;
			studentList.add(new Student(firstName, lastName, courseOne, gradeOne, courseTwo, gradeTwo, courseThree, gradeThree, 0.0));
			}
		}
	public static void studentInfo()
		{
		Scanner file = new Scanner(System.in);
		
		String firstName = file.next();
		String lastName = file.next();
		String courseOne = file.next();
		String gradeOne = file.next();
		String courseTwo = file.next();
		String gradeTwo = file.next();
		String courseThree = file.next(); 
		String gradeThree = file.next();
		double gpa = file.nextDouble();
		}
		
	public static void addStudent()
		{
		System.out.println("Enter the students first name");
		Scanner userInput1 = new Scanner(System.in);
		String firstName = userInput1.nextLine();
		System.out.println("Enter the students last name");
		String lastName = userInput1.nextLine();
		System.out.println("Enter the students first course");
		String courseOne = userInput1.nextLine();
		System.out.println("Enter the students letter grade in their first course");
		String gradeOne = userInput1.nextLine();
		System.out.println("Enter the students second course");
		String courseTwo = userInput1.nextLine();
		System.out.println("Enter the students letter grade in their second course");
		String gradeTwo = userInput1.nextLine();
		System.out.println("Enter the students third course");
		String courseThree = userInput1.nextLine();
		System.out.println("Enter the students letter grade in their third course");
		String gradeThree = userInput1.nextLine();
		double gpa = 0;
		studentList.add(new Student(firstName, lastName, courseOne, gradeOne, courseTwo, gradeTwo, courseThree, gradeThree, gpa));
		}
	
	public static void removeStudent()
		{
		int counter = 1;
		System.out.println("Which student would you like to remove?");
		for(int i = 0; i < studentList.size(); i++)
			{
			System.out.println(counter + "). " + studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName());
			counter++;
			}
		Scanner userInput1 = new Scanner(System.in);
		int removeChoice = userInput1.nextInt(); 
		studentList.remove(removeChoice - 1);
		counter = 1;
		System.out.println("The new roster is: ");
		for(int i = 0; i < studentList.size(); i++)
			{
			System.out.println(counter + "). " + studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName());
			counter++;
			}
		}
	
	public static void changeGrade()
		{
		int counter = 1;
		System.out.println("Which student's grade would you like to change?");
		for(int i = 0; i < studentList.size(); i++)
			{
			System.out.println(counter + "). " + studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName());
			counter++;
			}
		Scanner userInput1 = new Scanner(System.in);
		int classChoice = userInput1.nextInt() - 1;
		
		System.out.println("Which grade would you like to change?");
		System.out.println("1). " + studentList.get(classChoice).getCourseOne() + " " + studentList.get(classChoice).getGradeOne());
		System.out.println("2). " + studentList.get(classChoice).getCourseTwo() + " " + studentList.get(classChoice).getGradeTwo());
		System.out.println("3). " + studentList.get(classChoice).getCourseThree() + " " + studentList.get(classChoice).getGradeThree());
		int gradeChoice = userInput1.nextInt();
		
		if(gradeChoice == 1)
			{
			System.out.println("Input a letter grade to change " + studentList.get(classChoice).getCourseOne() + " grade of " + studentList.get(classChoice).getGradeOne() + " to");
			Scanner userInput2 = new Scanner(System.in);
			String changeGrade = userInput2.nextLine();
			studentList.get(classChoice).setGradeOne(changeGrade);
			}
		
		if(gradeChoice == 2)
			{
			System.out.println("Input a letter grade to change " + studentList.get(classChoice).getCourseTwo() + " grade of " + studentList.get(classChoice).getGradeTwo() + " to");
			Scanner userInput2 = new Scanner(System.in);
			String changeGrade = userInput2.nextLine();
			studentList.get(classChoice).setGradeTwo(changeGrade);
			}
		
		if(gradeChoice == 3)
			{
			System.out.println("Input a letter grade to change " + studentList.get(classChoice).getCourseThree() + " grade of " + studentList.get(classChoice).getGradeThree() + " to");
			Scanner userInput2 = new Scanner(System.in);
			String changeGrade = userInput2.nextLine();
			studentList.get(classChoice).setGradeThree(changeGrade);
			}
		System.out.println("The student's new grades are: ");
		System.out.println("1). " + studentList.get(classChoice).getCourseOne() + " " + studentList.get(classChoice).getGradeOne());
		System.out.println("2). " + studentList.get(classChoice).getCourseTwo() + " " + studentList.get(classChoice).getGradeTwo());
		System.out.println("3). " + studentList.get(classChoice).getCourseThree() + " " + studentList.get(classChoice).getGradeThree());
		}
	
	public static void changeClass()
		{
		int counter = 1;
		System.out.println("Which student's class would you like to change?");
		for(int i = 0; i < studentList.size(); i++)
			{
			System.out.println(counter + "). " + studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName());
			counter++;
			}
		Scanner userInput1 = new Scanner(System.in);
		int classChoice = userInput1.nextInt() - 1;
		
		System.out.println("Which class would you like to change?");
		System.out.println("1). " + studentList.get(classChoice).getCourseOne() + " " + studentList.get(classChoice).getGradeOne());
		System.out.println("2). " + studentList.get(classChoice).getCourseTwo() + " " + studentList.get(classChoice).getGradeTwo());
		System.out.println("3). " + studentList.get(classChoice).getCourseThree() + " " + studentList.get(classChoice).getGradeThree());
		int gradeChoice = userInput1.nextInt();
		
		if(gradeChoice == 1)
			{
			System.out.println("Change class to: ");
			System.out.println("2). " + studentList.get(classChoice).getCourseTwo());
			System.out.println("3). " + studentList.get(classChoice).getCourseThree());
			Scanner userInput2 = new Scanner(System.in);
			int changeClass = userInput2.nextInt();
			
			if(changeClass == 2)
				{
				String orig = studentList.get(classChoice).getCourseOne();
				String orig2 = studentList.get(classChoice).getGradeOne();
				studentList.get(classChoice).setCourseOne(studentList.get(classChoice).getCourseTwo());
				studentList.get(classChoice).setGradeOne(studentList.get(classChoice).getGradeTwo());
				studentList.get(classChoice).setCourseTwo(orig);
				studentList.get(classChoice).setGradeTwo(orig2);
				}
			if(changeClass == 3)
				{
				String orig = studentList.get(classChoice).getCourseOne();
				String orig2 = studentList.get(classChoice).getGradeOne();
				studentList.get(classChoice).setCourseOne(studentList.get(classChoice).getCourseThree());
				studentList.get(classChoice).setGradeOne(studentList.get(classChoice).getGradeThree());
				studentList.get(classChoice).setCourseThree(orig);
				studentList.get(classChoice).setGradeThree(orig2);
				}
			}
		
		if(gradeChoice == 2)
			{
			System.out.println("Change class to: ");
			System.out.println("1). " + studentList.get(classChoice).getCourseOne());
			System.out.println("3). " + studentList.get(classChoice).getCourseThree());
			Scanner userInput2 = new Scanner(System.in);
			int changeClass = userInput2.nextInt();
			
			if(changeClass == 1)
				{
				String orig = studentList.get(classChoice).getCourseTwo();
				String orig2 = studentList.get(classChoice).getGradeTwo();
				studentList.get(classChoice).setCourseTwo(studentList.get(classChoice).getCourseOne());
				studentList.get(classChoice).setGradeTwo(studentList.get(classChoice).getGradeOne());
				studentList.get(classChoice).setCourseOne(orig);
				studentList.get(classChoice).setGradeOne(orig2);
				}
			if(changeClass == 3)
				{
				String orig = studentList.get(classChoice).getCourseTwo();
				String orig2 = studentList.get(classChoice).getGradeTwo();
				studentList.get(classChoice).setCourseTwo(studentList.get(classChoice).getCourseThree());
				studentList.get(classChoice).setGradeTwo(studentList.get(classChoice).getGradeThree());
				studentList.get(classChoice).setCourseThree(orig);
				studentList.get(classChoice).setGradeThree(orig2);
				}
			}
		
		if(gradeChoice == 3)
			{
			System.out.println("Change class to: ");
			System.out.println("1). " + studentList.get(classChoice).getCourseOne());
			System.out.println("2). " + studentList.get(classChoice).getCourseTwo());
			Scanner userInput2 = new Scanner(System.in);
			int changeClass = userInput2.nextInt();
			
			if(changeClass == 1)
				{
				String orig = studentList.get(classChoice).getCourseThree();
				String orig2 = studentList.get(classChoice).getGradeThree();
				studentList.get(classChoice).setCourseThree(studentList.get(classChoice).getCourseOne());
				studentList.get(classChoice).setGradeThree(studentList.get(classChoice).getGradeOne());
				studentList.get(classChoice).setCourseOne(orig);
				studentList.get(classChoice).setGradeOne(orig2);
				}
			if(changeClass == 2)
				{
				String orig = studentList.get(classChoice).getCourseThree();
				String orig2 = studentList.get(classChoice).getGradeThree();
				studentList.get(classChoice).setCourseThree(studentList.get(classChoice).getCourseTwo());
				studentList.get(classChoice).setGradeThree(studentList.get(classChoice).getGradeTwo());
				studentList.get(classChoice).setCourseTwo(orig);
				studentList.get(classChoice).setGradeTwo(orig2);
				}
			}
		System.out.println("The student's new classes are: ");
		System.out.println("1). " + studentList.get(classChoice).getCourseOne() + " " + studentList.get(classChoice).getGradeOne());
		System.out.println("2). " + studentList.get(classChoice).getCourseTwo() + " " + studentList.get(classChoice).getGradeTwo());
		System.out.println("3). " + studentList.get(classChoice).getCourseThree() + " " + studentList.get(classChoice).getGradeThree());		
		}
	}


	

