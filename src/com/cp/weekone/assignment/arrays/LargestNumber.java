package com.cp.weekone.assignment.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
	public String largestNumber(final List<Integer> a) {
	    if(a == null || a.size() < 1) {
	        return "0";
	    }
	    
	    //sort 98 vs 89 lex
	    Collections.sort(a, new Comparator<Integer>() {
	    	@Override
			public int compare(Integer o1, Integer o2) {
				String a = String.valueOf(o1);
				String b = String.valueOf(o2);
				return (b+a).compareTo(a+b);
			}
	    });
	    
	    //create String
	    StringBuilder sb = new StringBuilder();
	    for(int i=0; i<a.size(); i++) {
	    	sb.append(a.get(i));
	    }
	    
	    //remove leading zeros
	    while(sb.length() > 1 && sb.charAt(0) == '0') {
	    	sb.deleteCharAt(0);
	    }
	    return sb.toString();
	}
}
