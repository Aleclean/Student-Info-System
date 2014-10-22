import java.util.ArrayList;
import java.util.Scanner;

public class Student
	{
	
	private String firstName;
	private String lastName;
	private String courseOne;
	private String gradeOne;
	private String courseTwo;
	private String gradeTwo;
	private String courseThree;
	private String gradeThree;
	private double gpa;
	
	public Student(String f, String l, String co, String go, String ct, String gt, String cth, String gth, double g)
	{
		firstName = f;	
		lastName = l;
		courseOne = co;
		gradeOne = go;
		courseTwo = ct;
		gradeTwo = gt;
		courseThree = cth;
		gradeThree = gth;
		gpa = g;
	}
	
	
	public String getLastName()
		{
		return lastName;
		}
	public void setLastName(String lastName)
		{
		this.lastName = lastName;
		}
	public String getFirstName()
		{
		return firstName;
		}
	public void setFirstName(String firstName)
		{
		this.firstName = firstName;
		}
	public String getCourseOne()
		{
		return courseOne;
		}
	public void setCourseOne(String courseOne)
		{
		this.courseOne = courseOne;
		}
	public String getGradeOne()
		{
		return gradeOne;
		}
	public void setGradeOne(String gradeOne)
		{
		this.gradeOne = gradeOne;
		}
	public String getCourseTwo()
		{
		return courseTwo;
		}
	public void setCourseTwo(String courseTwo)
		{
		this.courseTwo = courseTwo;
		}
	public String getGradeTwo()
		{
		return gradeTwo;
		}
	public void setGradeTwo(String gradeTwo)
		{
		this.gradeTwo = gradeTwo;
		}
	public String getCourseThree()
		{
		return courseThree;
		}
	public void setCourseThree(String courseThree)
		{
		this.courseThree = courseThree;
		}
	public String getGradeThree()
		{
		return gradeThree;
		}
	public void setGradeThree(String gradeThree)
		{
		this.gradeThree = gradeThree;
		}
	public double getGpa()
		{
		return gpa;
		}
	public void setGpa(double gpa)
		{
		this.gpa = gpa;
		}

	}
