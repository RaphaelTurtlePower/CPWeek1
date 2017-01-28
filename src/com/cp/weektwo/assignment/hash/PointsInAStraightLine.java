package com.cp.weektwo.assignment.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PointsInAStraightLine {
	 
 	public int maxPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
    	HashMap<Double, Integer> hashMap = new HashMap<>();
	    if (A == null || B == null) {
	        return -1;
	    }
	    if (A.size() == 0) {
	        return 0;
	    }
	    int n = A.size();
	    int x1, y1, x2, y2;
	    int max = 0;
	    double slope = 0;
	    for (int i = 0; i < n; i++) {
	        x1 = A.get(i);
	        y1 = B.get(i);
	        hashMap.clear();
	        for (int j = i; j < n; j++) {
	            x2 = A.get(j);
	            y2 = B.get(j);
	            if(y2==y1) {
	            	slope = Double.MIN_VALUE;
	            } else if (x2==x1) {
	                slope = Double.MAX_VALUE;
	            } else {
    	            slope = (y2-y1) / (x2-x1);
	            }
	            if (hashMap.containsKey(slope)) {
	                int val = hashMap.get(slope) + 1;
	            	hashMap.put(slope, val);
	            } else {
	            	hashMap.put(slope, 1);
	            }
	        }
	        for (Map.Entry<Double, Integer> entry : hashMap.entrySet()) {
    	        int currentMax = entry.getValue();
    	        max = Math.max(max, currentMax);
	        }
	    }
	    return max + 1;
	}
}
