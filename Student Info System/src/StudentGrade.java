
public class StudentGrade
	{
	public void setGpa()
	{
	String letterGrade;
	double gpa;
	double gradePoints;
	double totalGradePoints;
	
		
		
	public static void retrieveGrades()
	{
	for(int i = 0; i < Database.studentList.file.size(); i ++)
		letterGrade = Database.studentList.get(i).getGradeOne;
		letterGrade = Database.studentList.get(i).getGradeTwo;
		letterGrade = Database.studentList.get(i).getGradeTwo;

	}
	public static void setPoints()
		{
		switch(letterGrade)
		{
			case "A+":
				{
				gradePoints = "4.3";
				break;
				}
			case "A":
				{
				gradePoints = "4.0";
				break;
				}
			case "A-":
				{
				gradePoints = "3.7";
				break;
				}
			case "B+":
				{
				gradePoints = "3.3";
				break;
				}
			case "B":
				{
				gradePoints = "3.0";
				break;
				}
			case "B-":
				{
				gradePoints = "2.7";
				break;
				}
			case "C+":
				{
				gradePoints = "2.3";
				break;
				}
			case "C":
				{
				gradePoints = "2.0";
				break;
				}
			case "C-":
				{
				gradePoints = "1.7";
				break;
				}
			case "D+":
				{
				gradePoints = "1.3";
				break;
				}
			case "D":
				{
				gradePoints = "1.0";
				break;
				}
			case "D-":
				{
				gradePoints = "0.7";
				break;
				}
			case "F":
				{
				gradePoints = "0.0";
				break;
				}
		}
		}
	
		
	public static void setGPA()
		{
		Database.studentList.get().setGpa((letterGrade + numberGradeTwo + numberGradeThree)/3);\
		}
	}
	}
