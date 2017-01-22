package com.cp.weektwo.prework.hash;

import java.util.HashSet;
import java.util.List;

public class ValidSudoku {
	public int isValidSudoku(final List<String> a) {
		if(a == null || a.size() < 1) {
	    	return 0;
	    }
	    int i=0;
	    int j=0;
	    HashSet<Character> mySet = new HashSet<>();
	    //check all the columns
	    for(i=0; i<9; i++) {
	        mySet.clear();	
	    	for(j=0; j<9; j++) {
	    		if(a.get(i).charAt(j) == '.') {
		    		continue;
		    	}
	    		if(mySet.contains(a.get(i).charAt(j))) {
	    			return 0;
	    		} else {
	    			mySet.add(a.get(i).charAt(j));
	    		}
	    	}
	    }
	    
	    for(i=0; i<9; i++) {
	        mySet.clear();	
	    	for(j=0; j<9; j++) {
	    		if(a.get(j).charAt(i) == '.') {
		    		continue;
		    	}
	    		if(mySet.contains(a.get(j).charAt(i))) {
	    			return 0;
	    		} else {
	    			mySet.add(a.get(j).charAt(i));
	    		}
	    	}
	    }
         //check all the rows
	     for(i=0; i<9; i+=3) {
	    	for(j=0; j<9; j+=3) {
	    	    mySet.clear();
	    		for(int p =0; p<3; p++) {
	    			
	    			for(int q= 0; q<3; q++) {
	    				if(a.get(i+p).charAt(j+q) == '.') {
	    					continue;
	    				}
	    				if(mySet.contains(a.get(i+p).charAt(j+q))) {
	    		    		return 0;
	    		    	} else {
	    		    		mySet.add(a.get(i+p).charAt(j+q));
	    		    	}
	   
	    			}
	    		}
	    		
	    		
	    	}
	    }     
       return 1;
   }
}
