package Walmart;

import java.util.LinkedList;

import Salesforce.LinkedListNode;

public class getIntersectedNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode a=new LinkedListNode(1);
		a.next =new LinkedListNode(2);
		a.next.next =new LinkedListNode(3);

		LinkedListNode b=new LinkedListNode(5);
		b.next =new LinkedListNode(7);
		b.next.next =new LinkedListNode(2);
		b.next.next.next =new LinkedListNode(3);
		
		LinkedListNode ans=getIntersectionNode(a,b);
		System.out.println(ans);

	}
	
	public static LinkedListNode getIntersectionNode(LinkedListNode headA, LinkedListNode headB) {
	    //boundary check
	    if(headA == null || headB == null) return null;
	    
	    LinkedListNode a = headA;
	    LinkedListNode b = headB;
	    
	    //if a & b have different len, then we will stop the loop after second iteration
	    while( a != b){
	    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
	        a = a == null? headB : a.next;
	        b = b == null? headA : b.next;    
	    }
	    
	    return a;
	}

}
