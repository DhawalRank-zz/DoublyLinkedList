/*
 * Created By: Dhawal Rank
 * Date: January 23, 2017
 */
public class MainDoublyLinkedList {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.append(10);
		ll.append(14);
		ll.append(9);
		ll.append(15);
		ll.append(1);
		ll.insertAt(1, 20);
		System.out.println("Linked List:"+ll.toString());
		ll.insertAt(7, 54);
		System.out.println("Linked List:"+ll.toString());
		ll.insertAt(4, 17);
		System.out.println("Linked List:"+ll.toString());
		LinkedList sortedList = new LinkedList();
		sortedList = ll.getSortedList();
		System.out.println("Sorted Linked List:"+sortedList.toString());
		System.out.println(sortedList.deleteAt(1));
		System.out.println("New Linked List:"+sortedList.toString());
		System.out.println(sortedList.deleteAt(7));
		System.out.println("New Linked List:"+sortedList.toString());
		System.out.println(sortedList.deleteAt(3));
		System.out.println("New Linked List:"+sortedList.toString());
		Integer a[] = new Integer[sortedList.getSize()];
		a = sortedList.toArray();
		System.out.println(a[4]);
		
	}

}