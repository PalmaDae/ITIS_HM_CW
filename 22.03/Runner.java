public class Runner {
    public static void main(String[] args) {
        AllFunctionsForTasks functions = new AllFunctionsForTasks();

        Elem elem = AllFunctionsForTasks.createRandomLinkedList(5);
        Elem elem2 = functions.createLinkedList(5);
        Elem elem3 = functions.createLinkedList(5);

        elem3 = AllFunctionsForTasks.addNewElementAfter(3,6,elem3);
        AllFunctionsForTasks.printLinkedList(elem3);

        System.out.println("-");

        MyIntLinkedList elem5 = new MyIntLinkedList();

        elem5.add(1);
        elem5.add(2);
        elem5.add(3);
        elem5.add(4);
        elem5.add(5);
        AllFunctionsForTasks.printLinkedList(elem5.head);

        System.out.println("-");

        System.out.println(elem5.get(2));

        System.out.println("-");

        elem5.set(10, 2);
        AllFunctionsForTasks.printLinkedList(elem5.head);

        System.out.println("-");

        elem5.remove(1);
        AllFunctionsForTasks.printLinkedList(elem5.head);

        System.out.println("-");

        MyIntLinkedList elem6 = new MyIntLinkedList();
        elem6.add(1);
        elem6.add(10);
        elem6.add(3);
        elem6.add(4);
        elem6.add(5);
        AllFunctionsForTasks.printLinkedList(elem6.head);

        System.out.println("-");

        System.out.println(elem5.equals(elem6));

        System.out.println("-");

        elem5.addAll(elem6);
        AllFunctionsForTasks.printLinkedList(elem5.head);

        System.out.println("-");

        elem5.clear();
        AllFunctionsForTasks.printLinkedList(elem5.head);
		
		System.out.println("-");
		MyIntLinkedList elem7 = new MyIntLinkedList();
		
		for (int i = 0; i < 13; i++) {
			if (i % 2 == 0) {
				elem7.add(2);
			} else {
				elem7.add(i);
			}
		}
		
		AllFunctionsForTasks.printLinkedList(elem7.head);
		
		System.out.println("-");
		
		for (int i = 0; i < elem7.size(); i++) {
			if (elem7.get(i) % 2 != 0) {
				elem7.remove(i);
			}
		}
		
		AllFunctionsForTasks.printLinkedList(elem7.head);
		
		System.out.println("-");
		
		elem7.delete(2);
		
		AllFunctionsForTasks.printLinkedList(elem7.head);
		
		System.out.println("-");
		
		Elem elem8 = AllFunctionsForTasks.createForTask4LinkedList(15);
		AllFunctionsForTasks.printLinkedList(elem8);
		System.out.println("-");
		
		AllFunctionsForTasks.deleteElements(2, elem8);
		AllFunctionsForTasks.printLinkedList(elem8);
    }
}
