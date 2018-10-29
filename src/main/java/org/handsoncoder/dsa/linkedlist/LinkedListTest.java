package org.handsoncoder.dsa.linkedlist;

public class LinkedListTest {
	public static void main(String[] args) {
		VLinkedList<String> vLinkedList = new VLinkedList<String>();
		
		vLinkedList.addFirst("Hands");
		System.out.println(vLinkedList.size());
		
		vLinkedList.addLast("On");
		System.out.println(vLinkedList.size());
		
		vLinkedList.addLast("Coder");
		System.out.println(vLinkedList.size());
		
		vLinkedList.addLast("ToBeDeleted");
		System.out.println(vLinkedList.size());
		
		//vLinkedList.removeFirst();
		vLinkedList.removeLast();
		System.out.println(vLinkedList.size());
		
		System.out.println(vLinkedList.peekFirst());
		
		System.out.println(vLinkedList.peekLast());
		
		System.out.println("ToBeDeleted - " + vLinkedList.contains("ToBeDeleted"));
		System.out.println("Hands - " + vLinkedList.contains("Hands"));
		System.out.println("On - " + vLinkedList.contains("On"));
		System.out.println("Coder - " + vLinkedList.contains("Coder"));
		
		
		System.out.println(vLinkedList.remove("ToBeDeleted"));
		System.out.println(vLinkedList.size());
		
		vLinkedList.addLast("ToBeDeleted");
		System.out.println(vLinkedList.size());
		System.out.println(vLinkedList.remove("Coder"));
		System.out.println(vLinkedList.size());
	}
}
