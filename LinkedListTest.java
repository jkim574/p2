
public class LinkedListTest {
    public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	// list.add(3);
	// list.add(5);
	// list.add(9);
	// list.add(15);
	// list.add(20);


	LinkedListIterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
	    System.out.println(itr.next());
	}
    }

}
