package com.cp.weektwo.assignment.linkedlists;

public class DeleteDuplicates {
	 class ListNode {
		      public int val;
		      public ListNode next;
		      ListNode(int x) { val = x; next = null; }
		  }
	
	public ListNode deleteDuplicates(ListNode a) {
	    if(a == null || a.next == null) {
	        return a;
	    }
	    ListNode prev = null;
	    ListNode current = a;
	    
	    while(current != null) {
	        if(prev != null && prev.val == current.val) {
	            prev.next = current.next;
	            current = current.next;
	        } else {
	            prev = current;
	            current = current.next;
	        }
	    }
	    
	    return a;
	}
}
