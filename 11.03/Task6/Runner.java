public class Runner {
	public static void main(String[] args) {
		TimeDelta t1 = new TimeDelta(23, 56, 1);
		TimeDelta t2 = new TimeDelta(23, 14, 5);
		TimeDelta t3 = t1.mult(5);
		TimeDelta t4 = t1.add(t3);
		TimeDelta t5 = t1.sub(t2);
		TimeDelta t6 = t5.sub(t1);
		
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t6);
	}
}