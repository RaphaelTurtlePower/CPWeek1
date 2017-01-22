package com.cp.weekone.challenges;

public class ChallengeIVIsPalindrome {
	 /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
     public boolean isPalindrome(String s) {
	        // Write your code here
	        if(s == null || s.length() < 1) {
	            return true;
	        }
	        s = s.toLowerCase();
	        int start = 0;
	        int end = s.length() - 1;
	        while( end >= 0 && start < end) {
	            while(start < s.length()-1 && !Character.isLetterOrDigit(s.charAt(start))) {
	            	start++;
	            }
	            while(end > 0 && !Character.isLetterOrDigit(s.charAt(end))) {
	            	end--;
	            }
	            if(Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end)) && s.charAt(start) != s.charAt(end)) {
	            	return false;
	            } 
	            start++;
	            end--;
	        }
	        return true;
	        
	    }
}
