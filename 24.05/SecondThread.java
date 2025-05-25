public class SecondThread extends Thread{
	public int[] myIntArray;
	public int from;
	public int before;
	public int max = -1;
	
	public SecondThread(int[] myIntArray, int from, int before) {
		this.myIntArray = myIntArray;
		this.from = from;
		this.before = before;
	}
	
	public void run() {
		max = ..
		for (int i = from; i < before; i++) {
			if (myIntArray[i] >= max) {
				max = myIntArray[i];
			}
		}
	}
	
	public int getMax() {
		return max;
	}
}