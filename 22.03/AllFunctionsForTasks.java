import java.util.Random;

public class AllFunctionsForTasks{
	public static Elem createRandomLinkedList(int n) {
		Random random = new Random();
		Elem head = null;
		
		for (int i = 0; i < n; i++) {
			Elem elemFirst = new Elem(random.nextInt(16), head);
			head = elemFirst;
		}
		
		return head;
	}
	
	public Elem createLinkedList(int n) {
		Elem head = null;
		
		for (int i = 0; i < n; i++) {
			Elem elemFirst = new Elem(i, head);
			head = elemFirst;
		}
		
		return head;
	}
	
	public static void printLinkedList(Elem list) {
		Elem p = list;
		while (p != null) {
			System.out.println(p.value);
			p = p.next;
		}
	}
	
	public static int maxOfLinkedList(Elem list) {
		int max = list.value;
		
		Elem p = list.next;
		
		while (p != null) {
			if (p.value > max) {
				max = p.value;
			}
			p = p.next;
		}
		
		return max;
	}
	
	public static boolean isInList(int x, Elem list) {
		Elem p = list;
		
		while (p != null) {
			if (p.value == x) {
				return true;
			}
			p = p.next;
		}
		
		return false;
	}
	
	public static Elem deleteElements(int x, Elem list) {
		Elem p = list;
		Elem perem = null;
		
		while (p != null) {
			if (p.value == x) {
				if (perem != null) {
					perem.next = null;
				}
				break;
			}
			perem = p;
			p = p.next;
		}
		
		
		return list;
	}
	
	public static Elem addNewElementAfter(int x, int y, Elem list) {
		Elem p = list;
		
		
		while (p != null) {
			if (p.value == x) {
				Elem newElem = new Elem(y, p.next);
				p.next = newElem;
				break;
			}
			p = p.next;
		}
		
		return list;
	}
	
	public static Elem addNewElementAfterForAll(int x, int y, Elem list) {
		Elem p = list;
		
		
		while (p != null) {
			if (p.value == x) {
				Elem newElem = new Elem(y, p.next);
				p.next = newElem;
			}
			p = p.next;
		}
		
		return list;
	}
	
	// public static Elem addNewElementBefore(int x, int y, Elem list) {
		// Elem p = list;
		
		// while (p != null) {
			
		// }
		
		// return list;
	// }
	
	// public static Elem addNewElementBeforeForAll(int x, int y, Elem list) {
		// return list;
	// }
	
	// public static void main(String[] args) {
		// Elem elem = createRandomLinkedList(5);
		// Elem elem2 = createLinkedList(5);
		// Elem elem3 = createLinkedList(5);
		// Elem head = null;
		// Elem elemFirst = new Elem(2, head);
		// head = elemFirst;
		// elemFirst = new Elem(2, head);
		// head = elemFirst;
		// elemFirst = new Elem(3, head);
		// head = elemFirst;
		// elemFirst = new Elem(2, head);
		// head = elemFirst;
		
		// printLinkedList(elem);
		
		// System.out.println(maxOfLinkedList(elem));
		
		// System.out.println(isInList(2, elem));
		
		// printLinkedList(elem2);
		// elem2 = deleteElements(2, elem2);
		// printLinkedList(elem2);
		
		// elem3 = addNewElementAfter(3,6,elem3);
		
		// printLinkedList(elem3);
		
		// head = addNewElementAfterForAll(2, 5, head);
		// printLinkedList(head);
	
}