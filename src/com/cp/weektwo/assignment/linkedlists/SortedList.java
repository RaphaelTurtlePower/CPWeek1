package com.cp.weektwo.assignment.linkedlists;

public class SortedList {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int val) {
		          this.val = val;
		          this.next = null;
		      }
	}
	
	
	 public ListNode sortList(ListNode head) {  
	        if(head == null || head.next==null){
	            return head;
	        }
	        ListNode prev = head;
	        ListNode turtle = head;
	        ListNode hare = head;
	        
	        while(hare!=null && hare.next != null) {
	        	prev = turtle;
	            turtle = turtle.next;
	            hare = hare.next.next;
	          
	        }
	        
	        prev.next = null;   //cut off
	        ListNode left = sortList(head);
	        ListNode right = sortList(turtle);
	        return merge(left, right);
	    }
	    
	    public ListNode merge(ListNode a, ListNode b) {
	        if(a==null) {return b;}
	        if(b==null) {return a;}
	        ListNode dummy = new ListNode(0);
	        ListNode current = dummy;
	        while(a != null && b != null) {
	            if(a.val < b.val) {
	                current.next = a;
	                current = current.next;
	                a = a.next;
	            } else {
	                current.next = b;
	                current = current.next;
	                b = b.next;
	            }
	        }
	        
	        if(b != null) {
	            current.next = b;
	        }
	        
	        if(a != null) {
	            current.next = a;
	        }
	        return dummy.next;
	    }
}
