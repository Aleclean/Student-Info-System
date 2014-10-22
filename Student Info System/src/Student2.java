
public class Student2
	{
	public void addStudent()
		{
		studentList.add(new Student(lastName, firstName, courseOne, gradeOne, courseTwo, gradeTwo, courseThree, gradeThree, gpa));
		}
	public void removeStudent()
		{
		studentList.remove(lastName, firstName, courseOne, "null", courseTwo, "null", courseThree, "null", gpa);
		}
	//add and delete students from the ArrayList	
	}