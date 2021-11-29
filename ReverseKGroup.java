package Walmart;

import Salesforce.LinkedListNode;

public class ReverseKGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode b=new LinkedListNode(5);
		b.next =new LinkedListNode(7);
		b.next.next =new LinkedListNode(2);
		b.next.next.next =new LinkedListNode(3);
		b.next.next.next.next =new LinkedListNode(5);
		b.next.next.next.next.next =new LinkedListNode(6);
		b.next.next.next.next.next.next =new LinkedListNode(8);
		b.next.next.next.next.next.next.next =new LinkedListNode(9);


		LinkedListNode ans=reverseKGroup(b,4);
		System.out.println(ans);

	}

	public static LinkedListNode reverseKGroup(LinkedListNode head, int k) {
		LinkedListNode curr = head;
	    int count = 0;
	    while (curr != null && count != k) { // find the k+1 node
	        curr = curr.next;
	        count++;
	    }
	    if (count == k) { // if k+1 node is found
	        curr = reverseKGroup(curr, k); // reverse list with k+1 node as head
	        // head - head-pointer to direct part, 
	        // curr - head-pointer to reversed part;
	        while (count-- > 0) { // reverse current k-group: 
	        	LinkedListNode tmp = head.next; // tmp - next head in direct part
	            head.next = curr; // preappending "direct" head to the reversed list 
	            curr = head; // move head of reversed part to a new node
	            head = tmp; // move "direct" head to the next node in direct part
	        }
	        head = curr;
	    }
	    return head;
	}
}
