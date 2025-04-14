import java.util.Comparator;
import java.util.ArrayList;

public class CoincidentComparator implements Comparator<String> {
	public String tempToTemp(String name) {
		String temp = "";
		
		for (int j = 0; name.charAt(j) != '%' ; j++) {
			temp += name.charAt(j);
		}
		
		return temp;
	}
	
	@Override
	public int compare(String firstName, String secondName) {
		String temp = tempToTemp(firstName);
		String temp2 = tempToTemp(secondName);
		
		return (Integer.parseInt(temp2) - Integer.parseInt(temp));
	}
}