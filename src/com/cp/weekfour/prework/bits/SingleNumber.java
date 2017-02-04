package com.cp.weekfour.prework.bits;

import java.util.List;

public class SingleNumber {
	// DO NOT MODIFY THE LIST
		public int singleNumber(final List<Integer> a) {
		    int val = 0;
		    for(int i=0; i<a.size(); i++) {
		        val = val^a.get(i);
		    }
		    return val;
		}
}
