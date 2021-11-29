package Walmart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import Salesforce.LinkedListNode;

public class MergeKLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListNode b=new LinkedListNode(2);
		b.next =new LinkedListNode(3);
		b.next.next =new LinkedListNode(5);
		b.next.next.next =new LinkedListNode(7);
		
		LinkedListNode a=new LinkedListNode(5);
		a.next =new LinkedListNode(8);
		a.next.next =new LinkedListNode(9);
		
		LinkedListNode c=new LinkedListNode(1);
		c.next =new LinkedListNode(2);
		c.next.next =new LinkedListNode(3);
		
		List<LinkedListNode> list=new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);

		LinkedListNode ans=mergeKLists(list);
		System.out.println(ans);

	}
	
	public static LinkedListNode mergeKLists(List<LinkedListNode> lists) {
        if (lists==null||lists.size()==0) return null;
        
        PriorityQueue<LinkedListNode> queue= new PriorityQueue<LinkedListNode>(lists.size(),new Comparator<LinkedListNode>(){
        	@Override public int compare(LinkedListNode l1, LinkedListNode l2) { 
                return l1.val - l2.val; 
            }
        });
        
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode tail=dummy;
        
        for (LinkedListNode node:lists)
            if (node!=null)
                queue.add(node);
            
        while (!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;
            
            if (tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
    }

}
