import java.util.*;

public class MyDoubleComparator implements Comparator<Double>{
	double torch = 1e - 9;
	
	public MyDoubleComparator(double torch) {
		this.torch = torch;
	}
	
	@Override
	public int compare(Double firstNumber, Double secondNumber) {
		if (Math.abs(firstNumber - secondNumber) > torch) {
			return 1;
		} else if (firstNumber - secondNumber) {
			return -1;
		} else {
			return 0;
		}
		
	}
}