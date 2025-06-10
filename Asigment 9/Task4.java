import java.util.*;
import java.lang.reflect.*;

public class Task4 {
	
	@SuppressWarnings({"unchecked", "deprecation"})
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			Class cv = Class.forName(scanner.next());
			Class cv2 = Class.forName(scanner.next());
			
			String methodName = scanner.next();
			
			Method m = cv.getMethod(methodName, cv2);
			
			Object o1 = cv.newInstance();
			Object o2 = cv.newInstance();
			
			System.out.println(m.invoke(o1, o2));
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
