import java.util.*;

public class MyIntegerComparator implements Comparator<Integer>{
	
	@Override
	public int compare(Integer firstNumber, Integer secondNumber) {
		int firstCnt = 0;
		int secondCnt = 0;
		int absFirstNumber = Math.abs(firstNumber);
		int absSecondNumber = Math.abs(secondNumber);
		
		
		while (absFirstNumber > 0) {
			absFirstNumber /= 10;
			firstCnt++;
		}
		
		while (absSecondNumber > 0) {
			absSecondNumber /= 10;
			secondCnt++;
		}
		
		if (firstCnt > secondCnt) {
			return firstNumber;
		}else if (secondCnt > firstCnt) {
			return secondNumber;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Integer first = 123;
		Integer second = 32133;
		
		System.out.println(compare(first, second));
	}
}