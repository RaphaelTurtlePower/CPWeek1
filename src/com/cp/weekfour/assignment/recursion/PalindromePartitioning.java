package com.cp.weekfour.assignment.recursion;

import java.util.ArrayList;

public class PalindromePartitioning {
	   public ArrayList<ArrayList<String>> partition(String a) {
	        ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
	        partitionPalindrome(results, new ArrayList<String>(), a, 0);
	        return results;
	    }
	    
	    public void partitionPalindrome(ArrayList<ArrayList<String>> results, ArrayList<String> currentList, String s, int start) {
	    	//base case
	    	if(start == s.length()) {
	    		results.add(new ArrayList<String>(currentList));
	    	}
	    	//recursive
	    	for(int i=start; i<s.length(); i++) {
	    		if(isPalindrome(s, start, i)) {
	    			currentList.add(s.substring(start, i+1));
	    			partitionPalindrome(results, currentList, s, i+1);
	    			currentList.remove(currentList.size() - 1);
	    		}
	    		
	    	}
	    }
	    
	    public boolean isPalindrome(String s, int start, int end) {
	    	while(start <= end) {
	    		if(s.charAt(start) != s.charAt(end)) {
	    			return false;
	    		} 
	    		start++;
	    		end--;
	    	}
	    	return true;
	    }
}
