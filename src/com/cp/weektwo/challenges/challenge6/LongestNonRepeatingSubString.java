package com.cp.weektwo.challenges.challenge6;

import java.util.HashSet;

public class LongestNonRepeatingSubString {
	public int longestNonRepeatingSubstring(String A) {
		HashSet<Character> mySet = new HashSet<>();
		int start = 0;
		int end = 0;
		int maxLength = Integer.MIN_VALUE;
				
		while(start < A.length() && end < A.length()) {
			while(end < A.length() && !mySet.contains(A.charAt(end))) {
				mySet.add(A.charAt(end));
				end++;
			}
			
			maxLength = Math.max(maxLength, mySet.size());
			while(start < A.length() && end < A.length() && mySet.contains(A.charAt(end))) {
				start++;
				mySet.remove(A.charAt(start));
			}
			
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
		LongestNonRepeatingSubString s = new LongestNonRepeatingSubString();
		System.out.println(s.longestNonRepeatingSubstring("abcabcbb"));
		System.out.println(s.longestNonRepeatingSubstring("aaaaaa"));

	}
}
