package Walmart;

import Salesforce.LinkedListNode;

public class MergeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* method 1 . we can use an external linked list to save the whole list. so it takes extra space tc,sc-O(n1+n2)
 * method2-using same list */
		
		LinkedListNode b=new LinkedListNode(2);
		b.next =new LinkedListNode(3);
		b.next.next =new LinkedListNode(5);
		b.next.next.next =new LinkedListNode(7);
		
		LinkedListNode a=new LinkedListNode(5);
		a.next =new LinkedListNode(8);
		a.next.next =new LinkedListNode(9);
		LinkedListNode ans=mergeTwoLists2(a, b);
		System.out.println(ans);
	}
	
	public static LinkedListNode mergeList(LinkedListNode a,LinkedListNode b)
	{
		if(a==null) return b;
		if(b==null) return a;
		
		if(a.val>b.val)
		{
			LinkedListNode temp=b;
			b=a;
			a=temp;
		}
		
		LinkedListNode res=a;
		while(a.next!=null && b.next!=null)
		{
			LinkedListNode temp=null;
			
			while(a.next!=null && a.val<=b.val)
			{
				temp=a;
				a=a.next;
			}
			
			temp.next=b;
			
			LinkedListNode tmp=a;
			a=b;
			b=tmp;
		}
		
		return res;
	}
	
	public static LinkedListNode mergeTwoLists2(LinkedListNode l1, LinkedListNode l2) {
		LinkedListNode head = new LinkedListNode(0);
		LinkedListNode handler = head;
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                handler.next = l1;
                l1 = l1.next;
            } else {
                handler.next = l2;
                l2 = l2.next;
            }
            handler = handler.next;
        }
        
        if (l1 != null) {
            handler.next = l1;
        } else if (l2 != null) {
            handler.next = l2;
        }
        
        return head.next;
    }
	
	public LinkedListNode mergeTwoListsRecursive(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        LinkedListNode handler;
        if(l1.val < l2.val) {
            handler = l1;
            handler.next = mergeTwoListsRecursive(l1.next, l2);
        } else {
            handler = l2;
            handler.next = mergeTwoListsRecursive(l1, l2.next);
        }
        return handler;
 
	}
}
