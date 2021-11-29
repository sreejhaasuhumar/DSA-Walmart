package Walmart;

import Salesforce.LinkedListNode;

public class FlattenLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 LinkedListNode mergeTwoLists(LinkedListNode a, LinkedListNode b) {
	        
	        LinkedListNode temp = new LinkedListNode(0);
	        LinkedListNode res = temp; 
	        
	        while(a != null && b != null) {
	            if(a.val < b.val) {
	                temp.bottom = a; 
	                temp = temp.bottom; 
	                a = a.bottom; 
	            }
	            else {
	                temp.bottom = b;
	                temp = temp.bottom; 
	                b = b.bottom; 
	            }
	        }
	        
	        if(a != null) temp.bottom = a; 
	        else temp.bottom = b;
	        return res.bottom; 
	    
	    }
	    LinkedListNode flatten(LinkedListNode root)
	    {
	       
	            if (root == null || root.next == null) 
	                return root; 
	      
	            // recur for list on right 
	            root.next = flatten(root.next); 
	      
	            // now merge 
	            root = mergeTwoLists(root, root.next); 
	      
	            // return the root 
	            // it will be in turn merged with its left 
	            return root; 
	    }
}
