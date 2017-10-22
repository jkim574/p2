
public class LinkedListTest {
    public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(3);
	list.add(5);
	list.add(9);
	list.add(15);
	list.add(20);
	list.add(0, -10);
	list.add(6, 100);
	//	System.out.println(list.contains(3));
	//	System.out.println(list.contains(6));
	//	System.out.println(list.size());


	LinkedListIterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
	    System.out.print(itr.next() + " ");
	}
	System.out.println();
	list.remove(3);
	itr = list.iterator();
        while (itr.hasNext()) {
	    System.out.print(itr.next() + " ");
	}
	System.out.println();
    }

}
