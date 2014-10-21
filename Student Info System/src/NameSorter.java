import java.util.Comparator;

public class NameSorter implements Comparator <StudentList>
	{
	
	public int compare(Student s1, Student s2)
		{
		return s1.getLastname().compareTo(s2.getLastName());
		}

	}
