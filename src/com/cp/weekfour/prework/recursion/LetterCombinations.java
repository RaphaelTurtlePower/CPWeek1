package com.cp.weekfour.prework.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LetterCombinations {

    public ArrayList<String> letterCombinations(String digits) {
    	ArrayList<String> results = new ArrayList<String>();
    	if(digits == null || digits.length() < 1) {
    		return results;
    	}	
    	HashMap<Character, ArrayList<String>> key = generateMap();
    	results = key.get(digits.charAt(0));
    	for(int i=1; i<digits.length(); i++) {
    		ArrayList<String> currentCharacters = key.get(digits.charAt(i));
    		ArrayList<String> newResults = new ArrayList<String>();
    	
    		for(String prevResults : results) {
    			for(String currentCharacter:currentCharacters) {
    				newResults.add(prevResults + currentCharacter);
    			}
    		}
    		
    		results = newResults;
    	}
    	
    	return results;
    }
    
    public HashMap<Character, ArrayList<String>> generateMap() {
    	HashMap<Character, ArrayList<String>> mp = new HashMap<>();
    	mp.put('0', new ArrayList<String>(Arrays.asList("0")));
      	mp.put('1', new ArrayList<String>(Arrays.asList("1")));
    	mp.put('2', new ArrayList<String>(Arrays.asList("a","b","c")));
    	mp.put('3', new ArrayList<String>(Arrays.asList("d","e","f")));
    	mp.put('4', new ArrayList<String>(Arrays.asList("g","h","i")));
    	mp.put('5', new ArrayList<String>(Arrays.asList("j","k","l")));
    	mp.put('6', new ArrayList<String>(Arrays.asList("m","n","o")));
    	mp.put('7', new ArrayList<String>(Arrays.asList("p","q","r","s")));
    	mp.put('8', new ArrayList<String>(Arrays.asList("t","u","v")));
     	mp.put('9', new ArrayList<String>(Arrays.asList("w","x","y","z"))); 	
     	return mp;
    }
}
