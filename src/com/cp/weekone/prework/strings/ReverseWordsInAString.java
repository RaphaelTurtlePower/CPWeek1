package com.cp.weekone.prework.strings;

public class ReverseWordsInAString {
	public String reverseWords(String a) {
	    if(a == null || a.length() < 1) {
	        return a;       
	    }
	    
	    String[] words = a.trim().split(" +");
	    int start = 0;
	    int end = words.length - 1;
	    
	    while(start < end) {
	        String tmp = words[start];
	        words[start] = words[end];
	        words[end] = tmp;
	        start++;
	        end--;
	    }
	    
	    StringBuilder sb = new StringBuilder();
        sb.append(words[0]);
        for(int i=1; i<words.length; i++) {
            sb.append(" ");
            sb.append(words[i]);
        }
        
        return sb.toString();
	}
}
