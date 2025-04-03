import java.util.*;

public class MyIntegerComparator implements Comparator<Integer>{
	public int count(int number) {
		int cnt = 0;
		int absNumber = Math.abs(number);
		while (absNumber > 0) {
			absNumber /= 10;
			cnt++;
		}
		
		return cnt;
	}
	
	@Override
	public int compare(Integer firstNumber, Integer secondNumber) {
		int firstCnt = count(firstNumber);
		int secondCnt = count(secondNumber);
		
		if (firstCnt > secondCnt) {
			return 1;
		}else if (secondCnt > firstCnt) {
			return -1;
		} else {
			return 0;
		}
	}
}