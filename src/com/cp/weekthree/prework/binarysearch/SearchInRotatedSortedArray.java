package com.cp.weekthree.prework.binarysearch;

import java.util.List;

public class SearchInRotatedSortedArray {
	public int search(final List<Integer> a, int b) {
	    if(a==null || a.size() < 1) {
	    	return -1;
	    }
	    
	    int start =0;
	    int end = a.size()-1;
	    while(start <= end) {
	    	int mid = start + (end-start)/2;
	    	
	    	if(a.get(mid) == b) {
	    		return mid;
	    	}
	    	
	    	if(a.get(start) <= a.get(mid)) {
	    		//this side is sorted
	    		if(a.get(start) <= b && b < a.get(mid)) {
	    			end = mid-1;
	    		} else {
	    			start = mid+1;
	    		}
	    	} else {
	    		if(b > a.get(mid) && b <= a.get(end)) {
	    			start = mid+1;
	    		} else {
	    			end = mid-1;
	    		}
	    	}
	    	
	    }
		return -1;
	}

}
