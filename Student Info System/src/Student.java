
public class Student
	{
		String lastName 
	
	}
public void addStudent()
	{
	StudentList.add(new Student(lastName, firstName, courseOne, gradeOne, courseTwo, gradeTwo, courseThree, gradeThree, gpa));
	}
public void removeStudent()
	{
	StudentList.remove(lastName, firstName, courseOne, "null", courseTwo, "null", courseThree, "null", gpa);
	}
//add and delete students from the ArrayList