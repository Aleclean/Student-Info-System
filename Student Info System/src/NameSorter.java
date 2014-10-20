import java.util.Comparator;
public class NameSorter
	{
	
	public int compar(Student s1, Student s2)
		{
		return s1.getLastname().compareTo(s2.getLastName());
		}

	}
