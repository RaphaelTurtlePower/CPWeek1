package com.cp.weektwo.challenges.challenge4;

import java.util.HashMap;
import java.util.Map;

public class HashTableWordCount {
	
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
	
	public static void main(String[] args) {
		HashTableWordCount wc = new HashTableWordCount();
		HashMap<String,Integer> mp = (HashMap<String, Integer>) wc.hashTableWordCount("To be or not to be, that is the question.");
	}
}
