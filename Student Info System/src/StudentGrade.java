import java.text.DecimalFormat;
public class StudentGrade
	{


	public static String letterGrade;
	public static double totalGradePoints;

	public static void calculateGrade()
		{
		System.out.printf("%.2f", totalGradePoints);
		System.out.println();
		}
	
	public static void retrieveGrades()
		{
		for(int i = 0; i < Database.studentList.size(); i ++)
			{
			String pattern = "##.#";
			DecimalFormat decimalformat = new DecimalFormat(pattern);
			letterGrade = Database.studentList.get(i).getGradeOne();
				setPoints();
			letterGrade = Database.studentList.get(i).getGradeTwo();
				setPoints();
			letterGrade = Database.studentList.get(i).getGradeTwo();
				setPoints();
			Database.studentList.get(i).setGpa(totalGradePoints/3); 
			double totalGradePoints = 0.0;
			}
		}
	
	public static void setPoints()
		{
		switch(letterGrade)
		{
			case "A+":
				{
				totalGradePoints = totalGradePoints + 4.3;
				break;
				}
			case "A":
				{
				totalGradePoints = totalGradePoints + 4.0;
				break;
				}
			case "A-":
				{
				totalGradePoints = totalGradePoints +  3.7;
				break;
				}
			case "B+":
				{
				totalGradePoints = totalGradePoints +  3.3;
				break;
				}
			case "B":
				{
				totalGradePoints = totalGradePoints +  3.0;
				break;
				}
			case "B-":
				{
				totalGradePoints = totalGradePoints +  2.7;
				break;
				}
			case "C+":
				{
				totalGradePoints = totalGradePoints +  2.3;
				break;
				}
			case "C":
				{
				totalGradePoints = totalGradePoints +  2.0;
				break;
				}
			case "C-":
				{
				totalGradePoints = totalGradePoints +  1.7;
				break;
				}
			case "D+":
				{
				totalGradePoints = totalGradePoints +  1.3;
				break;
				}
			case "D":
				{
				totalGradePoints = totalGradePoints +  1.0;
				break;
				}
			case "D-":
				{
				totalGradePoints = totalGradePoints +  0.7;
				break;
				}
			case "F":
				{
				totalGradePoints = totalGradePoints +  0.0;
				break;
				}

		}
		}

}
