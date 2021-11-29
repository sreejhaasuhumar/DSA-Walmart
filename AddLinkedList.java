package Walmart;

import Salesforce.LinkedListNode;

public class AddLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2) {
	    LinkedListNode dummyHead = new LinkedListNode(0);
	    LinkedListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new LinkedListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new LinkedListNode(carry);
	    }
	    return dummyHead.next;
	}

}
