package com.cp.hash.weektwo.prework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
	       ArrayList<ArrayList<Integer>> results = new ArrayList<>(); 
		   if(a == null || a.size() < 1) {
	        	return results;
	       }
	   	   HashMap<String, ArrayList<Integer>> myMap = new HashMap<>();
		   for(int i=0; i < a.size(); i++) {
			   String test = a.get(i);
			   char[] testChars = test.toCharArray();
			   Arrays.sort(testChars);
			   String key = String.valueOf(testChars);
			   if(myMap.containsKey(key)) {
			      myMap.get(key).add(i+1);
			   } else {
				   ArrayList<Integer> list = new ArrayList<>();
				   list.add(i+1);
				   myMap.put(key, list);
			   }
		   }
		   
		   results.addAll(myMap.values());
		   return results;
	}
}
