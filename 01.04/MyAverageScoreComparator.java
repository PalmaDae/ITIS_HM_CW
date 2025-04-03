import java.util.*;

public class MyAverageScoreComparator implements Comparator<Student	> {
	@Override
	public int compare(Student firstStudent, Student secondStudent) {
		return (firstStudent.getAvarageScore() - secondStudent.getAvarageScore());
	}
}