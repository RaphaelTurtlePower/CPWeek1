package com.cp.weekfour.prework.recursion;

import java.util.ArrayList;

public class GrayCode {
	public ArrayList<Integer> grayCode(int a) {
	    ArrayList<Integer> solution = new ArrayList<Integer>();
	    if(a<0) { return solution; }
	    if(a==0) { 
	        solution.add(0);
	        return solution; 
	    }
	    
	    ArrayList<Integer> p = grayCode(a-1);
	    solution.addAll(p);
	    int pow = 1 << (a-1);
	    for(int i=p.size() - 1; i>=0; i--) {
	        solution.add(p.get(i) | pow);
	    }
	    return solution;
	}
}
