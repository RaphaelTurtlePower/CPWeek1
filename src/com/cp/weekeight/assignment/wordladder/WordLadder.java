package com.cp.weekeight.assignment.wordladder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
	public int ladderLength(String start, String end, ArrayList<String> dictV) {
	 if(start == null || end == null || dictV == null || dictV.size() < 1) {
  	   return 0;
     }
     dictV.add(end);
     
     Set<String> dict = new HashSet<>(dictV);
     Queue<String> words = new LinkedList<String>();
     Queue<Integer> wordCount = new LinkedList<>();
     Set<String> alreadyVisited = new HashSet<>();
     
     words.add(start);
     wordCount.add(0);
     
     while(!words.isEmpty()) {
  	   String word = words.poll();
  	   int wc = wordCount.poll();
  	   alreadyVisited.add(word);
  	   
  	   if(word.equals(end)) {
  		   return wc+1;
  	   }
  	   for(int i=0; i<word.length(); i++) {
  		   char[] charWord = word.toCharArray();
  		   for(char c='a'; c<'z'; c++) {
  			   charWord[i] = c;
  			   if(dict.contains(String.valueOf(charWord)) && !alreadyVisited.contains(String.valueOf(charWord))) {
  				   words.add(String.valueOf(charWord));
  				   wordCount.add(wc+1);
  			   }
  		   }
  	  }
  	   
     }
	   
     return 0;
	}
}
