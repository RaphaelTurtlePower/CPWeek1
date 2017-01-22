package com.cp.linkedlists.weektwo.prework;

public class RemoveNthFromLinkedList {
	 static class ListNode {
		      public int val;
		      public ListNode next;
		      ListNode(int x) { val = x; next = null; }
	 }
	public ListNode removeNthFromEnd(ListNode a, int b) {
	    if(a == null) {
	        return a;
	    }
	    
	    ListNode headPtr = new ListNode(0);
	    headPtr.next = a;
	    
	    ListNode prev = headPtr;
	    ListNode cur = headPtr.next;
	    ListNode nth = headPtr.next;
	    
	    int counter = 0;
	    while(cur != null) {
	        if(counter >= b) {
	            prev = nth;
	            nth = nth.next;
	        }
	        counter++;
	        cur = cur.next;
	    }
	    
	    prev.next = nth.next;
	    return headPtr.next;
	}
}
