import java.lang.reflect.*;

public class Task2 {
	public static void main(String[] args) {
		Class cv = Student.class;
		
		Method[] methods = cv.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
			// System.out.println(method.getReturnType());
			// System.out.println(Arrays.toString(method.getParametrTypes()));
		}
	}
}