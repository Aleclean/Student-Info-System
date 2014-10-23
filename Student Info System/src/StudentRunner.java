import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class StudentRunner
	{
	public static void main(String[] args) throws IOException
		{
		Database.fillDataBase();
		promptUser();
		}

	public static void promptUser()
		{
		System.out.println("Welcome! What would you like to do?");
		System.out.println("1). Add or remove a student");
		System.out.println("2). Change grades or schedule");
		System.out.println("3). Sort students");
		Scanner userInput1 = new Scanner(System.in);
		int choice = userInput1.nextInt();

		if (choice == 1)
			{
			System.out.println("1). Add a student");
			System.out.println("2). Remove a student");
			int choice2 = userInput1.nextInt();

			switch (choice2)
				{
				case 1:
					{
//					Database.addStudent();
					break;
					}
				case 2:
					{
//					Database.removeStudent();
					break;
					}
				}
			}

		if (choice == 2)
			{
			System.out.println("1). Change grades");
			System.out.println("2). Change classes");
			int choice2 = userInput1.nextInt();

			switch (choice2)
				{
				case 1:
					{
//					Database.changeGrade();
					break;
					}
				case 2:
					{
//					Database.changeClass();
					break;
					}
				}
			}

		if (choice == 3)
			{
			System.out.println("1). Sort by last name");
			System.out.println("2). Sort by GPA");
			System.out.println("3). Sort by class");
			int choice2 = userInput1.nextInt();

			switch (choice2)
				{
				case 1:
					{
					Collections.sort(Database.studentList, new NameSorter());
					}
				case 2:
					{
					Collections.sort(Database.studentList, new GPASorter());
					}
				case 3:
					{
					Collections.sort(Database.studentList, new CourseSorter());
					}
				}
			}
		}
	}
