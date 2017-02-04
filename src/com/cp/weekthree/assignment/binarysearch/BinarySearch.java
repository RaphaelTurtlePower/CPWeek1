package com.cp.weekthree.assignment.binarysearch;

import java.util.ArrayList;

public class BinarySearch {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    if(a==null || a.size() < 1) {
	        return 0;
	    }
	    int start = 0;
	    int end = a.size()-1;
	    while(start <= end) {
	        int mid = start + (end - start) / 2;
	        if(a.get(mid) == b) {
	            return mid;
	        } else if (a.get(mid) > b) {
	            end = mid-1;
	        } else {
	            start = mid+1;
	        }
	    }
	    return start;
	}
}
