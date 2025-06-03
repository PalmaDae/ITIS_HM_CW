import java.lang.annotation.*;

public class Task3 {
	public static void main(String[] args) {
		Class cv = Student.class;
		Annotation[] annotations = cv.getAnnotations();
		
		for (Annotation annotation : annotations) {
			if (annotation instanceof Author) {
				System.out.println("yes");
			}
		}
	}
}