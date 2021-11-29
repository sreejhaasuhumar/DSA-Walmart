package Walmart;

import Salesforce.LinkedListNode;

public class RemoveNthNodeFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode b=new LinkedListNode(5);
		b.next =new LinkedListNode(7);
		b.next.next =new LinkedListNode(2);
		b.next.next.next =new LinkedListNode(3);
		int n=2;
		LinkedListNode ans=removeNthFromEnd(b, n);
	}
	
	public static LinkedListNode removeNthFromEnd(LinkedListNode head, int n) {
		LinkedListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}
