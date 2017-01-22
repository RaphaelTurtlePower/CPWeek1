package com.cp.weektwo.prework.linkedlists;

public class ListCycle {
	 static class ListNode {
		      public int val;
		      public ListNode next;
		      ListNode(int x) { val = x; next = null; }
	}
	 
	    public ListNode detectCycle(ListNode head) {
	        ListNode turtle = head;
	        ListNode hare = head;
	        boolean hasCycle = false;
	        while(hare != null){
	            turtle = turtle.next;
	            hare = hare.next;
	            if(hare != null){
	                hare = hare.next;
	            }else{
	                return null;    //has null!!!!
	            }
	            if(turtle == hare){ //has cycle
	                hasCycle = true;
	                break;
	            }
	        }
	        if(hasCycle){
	            //2 count the number of nodes in the loop
	            int count = 1;
	            ListNode tmp = hare.next;
	            while(tmp != hare){
	                tmp = tmp.next;
	                count++;
	            }
	            
	            //3 start from the bottom count the kth item
	            while(count > 0){
	                turtle = turtle.next;
	                count--;
	            }
	            //4 find the point where turtle = hare
	            hare = head;
	            while(hare != turtle){
	                hare = hare.next;
	                turtle = turtle.next;
	            }
	          
	        }
	        return hare;
	    }
}
