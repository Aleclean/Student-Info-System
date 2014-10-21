import java.util.Scanner;

public class StudentRunner
	{
	public static void main(String[] args)
		{
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
					addStudent();
					break;
					}
				case 2:
					{
					removeStudent();
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
					changeGrade();
					break;
					}
				case 2:
					{
					changeClass();
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
					addStudent();
					}
				case 2:
					{
					removeStudent();
					}
				case 3:
					{
					
					}
				}
			}
		}
	}
