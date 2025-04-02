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
			return 1;
		}else if (secondCnt > firstCnt) {
			return -1;
		} else {
			return 0;
		}
	}
}