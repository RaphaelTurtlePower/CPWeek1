package com.cp.weekone.prework.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class FirstMissingInteger {
    public int firstMissingPositive(ArrayList<Integer> a) {
		if(a == null || a.isEmpty()) {
			return 1;
		}
		HashSet<Integer> set = new HashSet<Integer>(a);
		for(int i= 0; i<=a.size(); i++) {
			if(!set.contains(i+1)) {
				return i+1;
			}
		}
		return a.size();
	}
    
   
}
