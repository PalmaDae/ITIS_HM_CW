import java.util.*;
import java.io.*;

public class MyRunner {
	public static void main(String[] args) {
		try {
			ArrayList<Order> list = OrderAnalysis.listOfOrders();
			
			System.out.println("First Task");
			OrderAnalysis.task1(list);
			
			System.out.println('\n');
			
			System.out.println("Second Task");
			OrderAnalysis.task2(list);
			
			System.out.println('\n');
			
			System.out.println("Third Task");
			OrderAnalysis.task3(list);
		} catch(IOException e) {
			System.out.println("");
		}
	}
}