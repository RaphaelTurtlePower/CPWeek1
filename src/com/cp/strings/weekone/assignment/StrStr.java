package com.cp.strings.weekone.assignment;

public class StrStr {
	public int strStr(final String haystack, final String needle) {
	    if(haystack==null || needle==null) {
	        return -1;
	    }
	    
	    if(needle.length() < 1) {
	        return 0;
	    }
	    for(int i=0; i<haystack.length(); i++) {
	        for(int j=0; j<needle.length(); j++) {
	            if(i+j >= haystack.length()) {
	                //case where i+j is > haystack, means needle won't be here...
	                return -1;
	            }
	            if(j==needle.length()-1 && haystack.charAt(i+j) == needle.charAt(j)) {
	                //case where we reach the end of needle? means we found it
	                return i;
	            } 
	            if(haystack.charAt(i+j) != needle.charAt(j)) {
	                break;  
	            }
	        }
	    }
	    
	    return -1;
	}
}
