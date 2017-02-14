package com.cp.weekfour.assignment.recursion;

import java.util.ArrayList;


public class Combinations {
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		combinations(results, new ArrayList<Integer>(), n, k, 1);
		return results;
	}
	
	public void combinations(ArrayList<ArrayList<Integer>> results, ArrayList<Integer> currentList, int n, int k, int start) {
		if(k == 0) {
			results.add(new ArrayList<Integer>(currentList));
			return;
		}
		
		for(int i=start; i<=n; i++) {
			if(currentList.contains(i)) {
				continue;
			}
			currentList.add(i);
			combinations(results, currentList, n, k-1, i);
			currentList.remove(currentList.size()-1);
		}
	}

}
