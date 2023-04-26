package day14Basic;

public class LinkedListMain {

	/*
	 * Ability to create Linked List by appending 30 and 70 to 56 - Node with data
	 * 56 is First Created - Next Append 30 to 56 - Finally Append 70 to 30 -
	 * LinkedList Sequence: 56->30->70
	 */

	public static void main(String[] args) {
		LinkedList<Integer> linkedList1 = new LinkedList<>(); // head = null, tail = null
		LinkedList<Integer> linkedList2 = new LinkedList<>(); // head = null, tail = null
		LinkedList<Integer> linkedList3 = new LinkedList<>(); 
		System.out.println("Add linked List");
		linkedList1.add(30);
		linkedList1.add(56);
		linkedList1.add(70);
		linkedList1.display();
		System.out.println("*************************************");

		System.out.println("Appending linked List");
		linkedList2.append(30);
		linkedList2.append(70);
		linkedList2.append(56);
		linkedList2.display();

		System.out.println("*******************************");
		System.out.println("Insert linked List");
		linkedList1.insert(56, 30);
		linkedList1.display();

		System.out.println("*******************************");
		System.out.println("First delete linked List");
		Integer poppedElement = linkedList2.pop();
		System.out.println("First Popped Element => " + poppedElement);
		linkedList2.display();

		System.out.println("*******************************");
		System.out.println("Last delete linked List");
		Integer popLastElement = linkedList1.popLast();
		System.out.println("Last Popped Element => " + popLastElement);
		linkedList1.display();
		System.out.println("*******************************");
		
		System.out.println("Search linked List");
		System.out.println(linkedList2.search(30));
		
		System.out.println("*******************************");
		
		System.out.println("After insert linked List");
		boolean isInserted = linkedList2.insertAfter(40,30);
		System.out.println(isInserted);
		linkedList2.display();
		System.out.println("*******************************");

		
		
	}
}
