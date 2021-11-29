package Walmart;

import Salesforce.LinkedListNode;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode a=new LinkedListNode(5);
		a.next =new LinkedListNode(8);
		a.next.next =new LinkedListNode(9);
		a.next.next.next =new LinkedListNode(10);
		boolean ans=isCycle(a);
		System.out.println(ans);
	}
	
	public static boolean isCycle(LinkedListNode head) {
		LinkedListNode fast=head;
		LinkedListNode slow=head;

		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			
			if(slow==fast)
			{
				return true;
			}
		}
		
		return false;
		
	}

}
