package com.cp.weektwo.assignment.linkedlists;

public class ReorderList {
	 public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int val) {
		          this.val = val;
		          this.next = null;
		      }
		  }
	 
	   public ListNode reorderList(ListNode head) {  
	        // write your code here
	        if(head == null || head.next == null) {
	            return head;
	        }
	        
	        ListNode prev = null;
	        ListNode turtle = head;
	        ListNode hare = head;
	        //find middle point
	        while(hare!=null && hare.next != null) {
	        	prev = turtle;
	            turtle = turtle.next;
	            hare = hare.next.next;
	          
	        }
	        if(prev != null) {
	            //reverse the second part
	            prev.next = null;
	            prev = null;
	        }
	        while(turtle != null) {
	        	ListNode next = turtle.next;
	        	turtle.next = prev;
	        	prev = turtle;
	        	turtle = next;
	        }
	        
	       ListNode dummy = new ListNode(0);
	       ListNode current = head;
	       int count = 0;
	        while(current != null && prev != null) {
	        	if(count%2==1) {
	        		dummy.next = prev;
	        		prev = prev.next;
	        		dummy = dummy.next;
	        	} else {
	        		dummy.next = current;
	        		current = current.next;
	        		dummy = dummy.next;
	        	}
	        	count++;
	        }
	        
	        if(current == null) {
	        	dummy.next = prev;
	        }
	        if(prev == null) {
	        	dummy.next = current;
	        }
	        return head;
	    }
	   
	   public static void main(String[] args) {
		   ListNode head = new ListNode(1);
		   ListNode tail = new ListNode(1);
		   head.next = tail;
		   
		   ReorderList rl = new ReorderList();
		   ListNode ar = rl.reorderList(head);
	   }
}
