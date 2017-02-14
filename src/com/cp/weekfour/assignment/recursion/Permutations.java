package com.cp.weekfour.assignment.recursion;

import java.util.ArrayList;

public class Permutations {
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        permutations(results, new ArrayList<Integer>(), a);
        return results;
	}
	
	public void permutations(ArrayList<ArrayList<Integer>> results, ArrayList<Integer> tempList, ArrayList<Integer> input) {
	    if(tempList.size() == input.size()) {
	        results.add(new ArrayList<>(tempList));
	    }
	    
	    for(int i=0; i<input.size(); i++) {
	        if(tempList.contains(input.get(i))) {
	            continue;
	        }
	        
	        tempList.add(input.get(i));
	        permutations(results, tempList, input);
	        tempList.remove(tempList.size()-1);
	    }
	    
	}
}
