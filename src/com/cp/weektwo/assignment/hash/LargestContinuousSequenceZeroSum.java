package com.cp.weektwo.assignment.hash;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestContinuousSequenceZeroSum {
	  public ArrayList<Integer> lszero(ArrayList<Integer> a) {
		   if(a==null || a.size() < 1) {
			   return new ArrayList<Integer>();
		   }
		   int maxSize=0;
		   ArrayList<Integer> results = new ArrayList<>();
		   for(int i=0 ; i<a.size(); i++) {
			   int sum = a.get(i);
			   if(sum == 0 && maxSize < 1) {
			       maxSize = 1;
			       ArrayList<Integer> tmp = new ArrayList<Integer>();
			       tmp.add(0);
			       results = tmp;
			   }
			   for(int j=i+1; j<a.size(); j++) {
				sum += a.get(j);
				   if(sum==0 && j-i > maxSize) {
					   maxSize = j-i;
					   results = new ArrayList<Integer>(a.subList(i, j+1));
				   }
			   }
		   }
		   return results;
		   
	   }
	  
	  public static void main(String[] args) {
		//  int[] arr = { 22, -7, 15, -21, -20, -8, 16, -20, 5, 2, -15, -24, 19, 25, 3, 23, 18, 0, 16, 26, 13, 4, -20, -13, -25, -2};
		 int[] arr = {0, -10, 20, 3, 23, 10, -20, 2, 19, -29, 0};
		  LargestContinuousSequenceZeroSum s = new LargestContinuousSequenceZeroSum();
		  ArrayList<Integer> ins = new ArrayList<>();
		  for(int i=0; i<arr.length; i++) {
			  ins.add(arr[i]);
		  }
		  ArrayList<Integer> results = s.lszero(ins);
	  }
}
