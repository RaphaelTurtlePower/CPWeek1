package com.cp.arrays.prework.weekone;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInArray {
	public int repeatedNumber(final List<Integer> a) {
		if(a == null || a.isEmpty()) {
			return 0;
		}
		Set<Integer> existing = new HashSet<>();
		for(int i=0; i<a.size(); i++) {
			if(existing.contains(a.get(i))) {
				return a.get(i);
			} else {
				existing.add(a.get(i));
			}
		}
		return 0;
	}
}
