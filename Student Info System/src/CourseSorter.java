import java.util.Comparator;
public class CourseSorter implements Comparator<Student>
	{
		public int compare (Student s1, Student s2)
			{
			return s1.getCourseOne().compareTo(s2.getCourseOne());
			}
	}
