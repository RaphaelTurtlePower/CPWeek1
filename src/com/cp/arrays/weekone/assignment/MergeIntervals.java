package com.cp.arrays.weekone.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
	  public static class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
	  }
		 public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		        if(newInterval == null) {
		            return intervals;
		        }
		        if(newInterval != null && (intervals == null || intervals.isEmpty())) {
		            return new ArrayList<Interval>(Arrays.asList(newInterval));
		        } 
		        
		       ArrayList<Interval> results = new ArrayList<>();
		       int i=0;
		       
		       //Everything before newInterval
		       while(i < intervals.size() && intervals.get(i).end < newInterval.start) {
		    	   results.add(intervals.get(i));
		    	   i++;
		       }
		       
		       while(i<intervals.size() && intervals.get(i).start <= newInterval.end) {
		    	   newInterval = new Interval(Math.min(intervals.get(i).start, newInterval.start),
		    			   	Math.max(intervals.get(i).end, newInterval.end)
		    			   );
		    	   i++;
		       }
		       results.add(newInterval);
		       
		       
		       //Everything after newInterval
		       while(i < intervals.size()) {
		    	   results.add(intervals.get(i));
		    	   i++;
		       }
		  
		       return results;
	 }
}
