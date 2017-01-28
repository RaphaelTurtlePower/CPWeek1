package com.cp.weektwo.assignment.hash;

import java.util.HashSet;

public class LengthOfLongestSubstring {
	  public int lengthOfLongestSubstring(String s) {
	       if(s == null || s.length()<1) {
	    	   return 0;
	       }
	       
	       if(s.length() == 1) {
	           return 1;
	       }
	       
	       HashSet<Character> visited = new HashSet<>();
	       int start = 0;
	       int tail = 0;
	       int max = 1;
	       
	       while(tail < s.length() && start < s.length()) {
	    	   if(!visited.contains(s.charAt(tail))) {
	    		   visited.add(s.charAt(tail));
	    		   tail++;
	    	   } else {
	    		   //found a duplicate!
	    		   max = Math.max(max, tail - start);
	    		   while(start < tail && s.charAt(start) != s.charAt(tail)) {
	    			   visited.remove(s.charAt(start));
	    			   start++;
	    		   }
	    		   if(s.charAt(start) == s.charAt(tail)) {
	    			   visited.remove(s.charAt(start));
	    			   start++;
	    			   
	    		   }
	    	   }
	       }
	       max = Math.max(max, tail-start);
	       return max;
	       
	    }
}
