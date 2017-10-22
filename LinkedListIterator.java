/////////////////////////////////////////////////////////////////////////////
// Semester:         CS367 Fall 2017
// PROJECT:          P2
// FILE:             LinkedList.java
//
// TEAM:    Individual
// Author1: Joong Ho Kim, jkim574@wisc.edu, 9070062915, Lec001
// TA's Name: Yash Trivedi
// Credits: none
//////////////////////////// 80 columns wide //////////////////////////////////

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The iterator implementation for LinkedList.  The constructor for this
 * class requires that a reference to a Listnode with the first data
 * item is passed in.
 *
 * If the Listnode reference used to create the LinkedListIterator is null,
 * that implies there is no data in the LinkedList and this iterator
 * should handle that case correctly.
 *
 * COMPLETE THIS CLASS AND HAND IN THIS FILE
 */
public class LinkedListIterator<T> implements Iterator<T> {

	// TODO determine what data members are needed for this iterator type
    private Listnode<T> head; // starting node
    private Listnode<T> curr; // current node of iterator

	/**
	 * Constructs a LinkedListIterator when given the first node
	 * with data for a chain of nodes.
	 *
	 * Tip: do not construct with a "blank" header node.
	 *
	 * @param a reference to a List node with data.
	 */
	public LinkedListIterator(Listnode<T> head) {
		// TODO finish the constructor
	    this.head = head;
	    this.curr = head;
	}

	/**
	 * Returns the next element in the iteration and then advances the
	 * iteration reference.
	 *
	 * @return the next data item in the iteration that has not yet been returned
	 * @throws NoSuchElementException if the iteration has no more elements
	 */
	@Override
	public T next() {
		// TODO implement this method
	    if (!hasNext()) {
		throw new NoSuchElementException();
	    }

	    curr = curr.getNext();
	    T data = curr.getData();
	    return data;
	}

	/**
	 * Returns true if their are no more data items to iterate through
	 * for this list.
	 *
	 * @return true if their are any remaining data items to iterator through
	 */
	@Override
	public boolean hasNext() {
		// TODO implement this method
	    if (curr != null) {
		if (curr.getNext() != null) {
		    return true;
		}
	    }
	    return false;
	}

    /**
     * The remove operation is not supported by this iterator
     * @throws UnsupportedOperationException if the remove operation is not
     * supported by this iterator
     */
    @Override
	public void remove() {
	  throw new UnsupportedOperationException();
	}
}
