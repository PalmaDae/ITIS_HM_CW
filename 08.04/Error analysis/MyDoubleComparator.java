import java.util.*;

public class MyDoubleComparator implements Comparator<Double>{
	public static double torch = 1e-9;
	
	public MyDoubleComparator(double torch) {
		this.torch = torch;
	}
	
	@Override
	public int compare(Double firstNumber, Double secondNumber) {
		if ((firstNumber - secondNumber) > torch) {
			return 1;
		} else if ((firstNumber - secondNumber) < torch) {
			return -1;
		} else {
			return 0;
		}
		
	}
}