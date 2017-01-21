package com.cp.strings.prework.weekone;

public class IsPalindrome {

	public int isPalindrome(String a) {
        if(a == null || a.length() < 1) {
            return 1;
        }
        a = a.toLowerCase();
        int start = 0;
        int end = a.length() - 1;
        while( end >= 0 && start < end) {
            while(start < a.length()-1 && !Character.isLetterOrDigit(a.charAt(start))) {
            	start++;
            }
            while(end > 0 && !Character.isLetterOrDigit(a.charAt(end))) {
            	end--;
            }
            if(Character.isLetterOrDigit(a.charAt(start)) && Character.isLetterOrDigit(a.charAt(end)) && a.charAt(start) != a.charAt(end)) {
            	return 0;
            } 
            start++;
            end--;
        }
        return 1;
    }
}
