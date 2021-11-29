package Walmart;

import Salesforce.LinkedListNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode b=new LinkedListNode(5);
		b.next =new LinkedListNode(7);
		b.next.next =new LinkedListNode(2);
		b.next.next.next =new LinkedListNode(3);
		LinkedListNode ans=reverseList(b);
	}
	
	public static LinkedListNode reverseList(LinkedListNode head) {
		   
		LinkedListNode prev = null;
	    while (head != null) {
	    	LinkedListNode n = head.next;
	        head.next = prev;
	        prev = head;
	        head = n;
	    }
	    return prev;
	}

}
