package org.handsoncoder.dsa.linkedlist;

public class VLinkedList<E> {

	class Node<E> {
		Node<E> next;
		E data;

		Node(E data) {
			this.next = null;
			this.data = data;
		}

	}

	private Node<E> head = null;

	private Node<E> tail = null;

	private int currentSize = 0;

	/**
	 * Boundary conditions 1.structure is empty 2.one element 3.first element 4.last
	 * element 5. middle element
	 */
	public void addFirst(E newData) {
		Node<E> newNode = new Node<E>(newData);
		newNode.next = head;

		if (head == null) {
			head = tail = newNode;
		} else {
			head = newNode;
		}

		currentSize++;
	}

	public int size() {
		System.out.print("Head - " + head.data);
		System.out.println(" | Tail - " + tail.data);
		return currentSize;
	}

	public void addLast(E newData) {
		Node<E> newNode = new Node<E>(newData);

		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

		currentSize++;
	}

	public E removeFirst() {
		if (head == null) {
			return null;
		}

		Node<E> currentHead = head;

		head = currentHead.next;

		currentSize--;

		return currentHead.data;
	}

	public E removeLast() {
		if (head == null) {
			return this.removeFirst();
		}
		Node<E> previous = null;
		Node<E> current = head;
		while (current != tail) { // or current.next!=null
			previous = current;
			current = current.next;
		}
		tail = previous;
		tail.next = null;
		currentSize--;
		return current.data;
	}

	public E peekFirst() {
		if (head == null) {
			return null;
		} else {
			return head.data;
		}
	}

	public E peekLast() {
		if (head == null) {
			return null;
		} else {
			return tail.data;
		}
	}

	@SuppressWarnings("unchecked")
	public boolean contains(E element) {
		if (head == null || element == null) {
			return false;
		}
		if ((((Comparable<E>) element).compareTo(head.data)) == 0) {
			System.out.println(element+" : Its the head element");
			return true;
		}
		if ((((Comparable<E>) element).compareTo(tail.data)) == 0) {
			System.out.println(element+" : Its the tail element");
			return true;
		}
		Node<E> current = head;
		while (current != tail) { // or current.next!=null
			if ((((Comparable<E>) element).compareTo(current.data)) == 0) {
				System.out.println(element+" : Its a middle element");
				return true;
			} else {
				current = current.next;
			}
		}
		System.out.println(element+" : Element not in the linked list");
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public E remove(E element) {
		if (head == null || element == null) {
			return null;
		}
		
		Node<E> current = head;
		Node<E> previous = null;
		while (current != null) { // or current.next!=null
			if ((((Comparable<E>) element).compareTo(current.data)) == 0) {
				if (current == head) {
					head = tail = null;
					return current.data;
				}
				if (current == tail) {
					tail = previous;
					return current.data;
				}
				previous.next= current.next;
				currentSize --;
				return current.data;
			} else {
				previous = current;
				current = current.next;
			}
		}
		System.out.println(element+" : Element not in the linked list");
		return null;
	}
}
