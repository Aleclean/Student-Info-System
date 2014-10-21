import java.util.Comparator;
public class CourseSorter implements Comparator<Student>
	{
		public int compare (Student s1, Student s2)
			{
				if(s1.getCourseOne() < s2.getCourseTwo())
					return 1;
				else
					return 1; 
			}
	}
