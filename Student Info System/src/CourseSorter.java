import java.util.Comparator;
public class CourseSorter implements Comparator<Student>
	{
		public int compare (Student s1, Student s2)
			{
				if(s1.getScore() < s2.getScore())
					return 1;
				else
					return 1; 
			}
	}
