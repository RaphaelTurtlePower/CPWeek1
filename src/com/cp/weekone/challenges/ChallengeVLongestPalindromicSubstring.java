package com.cp.weekone.challenges;

public class ChallengeVLongestPalindromicSubstring {
	 /**
     * @param s input string
     * @return the longest palindromic substring
     */
   public String longestPalindrome(String A) {
		String longestPalindrome="";
	    for(int i=0; i<A.length(); i++) {
	    	String odd = longestPalindromeAtPosition(A, i, i);
	    	String even = longestPalindromeAtPosition(A, i, i+1);
	    	if(odd.length() > longestPalindrome.length()) {
	    		longestPalindrome = odd;
	    	}
	    	if(even.length() > longestPalindrome.length()) {
	    		longestPalindrome = even;
	    	}
	    }
	    
	    return longestPalindrome;
	}
	
	public String longestPalindromeAtPosition(String A, int left, int right) {
		while(left >= 0 && right < A.length() && A.charAt(left) == A.charAt(right)) {
			left--;
			right++;
		}
		return A.substring(left+1, right);
	}
}
