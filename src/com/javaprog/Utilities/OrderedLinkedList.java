/**
 * Compilation javac OrderedList.java
 * Execution java com.bridegelabz.Utilities.OrderedList
 * 
 * Purpose: For Generic LinkedList For Adding and Removing Number From File And Arrange Them In Sorted Order
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-15/11/18
 */
package com.javaprog.Utilities;

import java.util.Comparator;

public class OrderedLinkedList<E extends Comparable<E>> implements Comparator<E> {

	public int value = 0;
	public Node<E> start = null;

	private class Node<V> {
		public V element;
		public Node<V> next;
	}

	public void add(E element) {
		if (start == null) {
			start = new Node<E>();
			start.element = element;
			start.next = null;
			value++;
			// System.out.println("Hello1");
		} else {
			Node<E> ptr = start;
			Node<E> ptr2 = ptr;
			while (ptr != null && compare(ptr.element, element) < 0) {
				ptr2 = ptr;
				ptr = ptr.next;
				// System.out.println("Hello2");
			}

			if (ptr == ptr2) {
				// System.out.println("Hello3");
				Node<E> temp = new Node<E>();
				temp.element = element;
				temp.next = start;
				start = temp;
			} else if (ptr == null) {
				// System.out.println("Hello4");
				ptr2.next = new Node<E>();
				ptr2 = ptr2.next;
				ptr2.element = element;
			} else {
				// System.out.println("Hello5");
				Node<E> temp = new Node<E>();
				temp.element = element;
				ptr2.next = temp;
				temp.next = ptr;
			}
			value++;
		}
	}

	@Override
	public int compare(E o1, E o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

	public void printList() {
		Node<E> ptr = start;
		while (ptr != null) {
			System.out.println(ptr.element);
			ptr = ptr.next;

		}
	}

	public void remove(E item) {
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		while (ptr != null && compare(ptr.element, item) != 0) {
			ptr2 = ptr;
			ptr = ptr.next;
		}
		if (ptr == null) {

			return;
		} else if (ptr == ptr2) {
			start = start.next;
		} else if (ptr.next == null) {
			ptr2.next = null;

		} else {
			ptr2.next = ptr.next;
		}
		this.value--;
	}

	public boolean search(E element) {
		Node<E> ptr = start;
		while (ptr != null) {
			if (compare(ptr.element, element) == 0) {
				return true;
			}
			ptr = ptr.next;
		}
		return false;
	}

	public boolean isEmpty() {
		return value == 0 ? true : false;
	}

	public int size() {
		return value;
	}

	public int index(E item) {
		Node<E> ptr = start;
		int count = 0;
		while (ptr != null && compare(ptr.element, item) != 0) {
			ptr = ptr.next;
			count++;
		}
		if (ptr == null)
			return -1;
		return count;

	}

	public E pop() {
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		while (ptr.next != null) {
			ptr2=ptr;
			ptr = ptr.next;
		}
		ptr2.next=null;
		Node<E> temp=ptr;
		if(ptr==start)
		{
			start=null;
		}
		value--;
		return temp.element;
	}

	public E pop(int pos) {
		int count = 0;
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		while (ptr != null && count < pos) {
			ptr2=ptr;
			ptr = ptr.next;
			count++;
		}
		Node<E> temp=ptr;
		
		if(count==0)
		{
			start=start.next;
			value--;
		}
		else
		{
			ptr2.next=ptr.next;
			value--;
		}
		return temp.element;
	}

}
