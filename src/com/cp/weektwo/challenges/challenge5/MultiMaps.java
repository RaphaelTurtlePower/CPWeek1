package com.cp.weektwo.challenges.challenge5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MultiMaps {
	public Map<String,Integer> hashTableWordCount(String word) {
		HashMap<String, Integer> mp = new HashMap<>();
		if(word == null || word.length() < 1) {
			return mp;
		}
		
		word = word.toLowerCase();
		String[] words = word.split("[^a-z]+");
		for(int i=0; i<words.length; i++) {
			if(mp.containsKey(words[i])) {
				int val = mp.get(words[i]) + 1;
				mp.put(words[i], val);
			} else {
				mp.put(words[i], 1);
			}
		}
		return mp;
	}
	
	public HashMap<Integer, HashSet<String>> createMultiMap(HashMap<String, Integer> mp) {
		HashMap<Integer, HashSet<String>> result = new HashMap<>();
		if(mp == null || mp.size() < 1 ) {
			return result;
		}
		for(Map.Entry<String, Integer> entry : mp.entrySet()) {
			if(result.containsKey(entry.getValue())) {
				result.get(entry.getValue()).add(entry.getKey());
			} else {
				HashSet<String> newValues = new HashSet<>();
				newValues.add(entry.getKey());
				result.put(entry.getValue(), newValues);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		MultiMaps wc = new MultiMaps();
		HashMap<String,Integer> mp = (HashMap<String, Integer>) wc.hashTableWordCount("To be or not to be, that is the question.");
		HashMap<Integer, HashSet<String>> newSet = wc.createMultiMap(mp);
	}
}
