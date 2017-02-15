package com.cp.weekfour.assignment.recursion;

import java.util.ArrayList;

public class NQueens {

	 ArrayList<ArrayList<String>> solveNQueens(int n) {
        ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
        solveNQueens(results, new ArrayList<Integer>(), 0, n );
        return results;
    }
	 
	 public void solveNQueens(ArrayList<ArrayList<String>> results, ArrayList<Integer> current, int row, int n) {
		 if(current.size() == n) {
			 ArrayList<String> solution = new ArrayList<>();
			 for(int i=0; i<n; i++) {
				 StringBuilder sb = new StringBuilder();
				 for(int j=0; j<n; j++) {
					 if(j==current.get(i)) {
						 sb.append('Q');
					 } else {
						 sb.append('.');
					 }
				 }
				 solution.add(sb.toString());
			 }
			 results.add(solution);
		 }
		 
		 for(int i=0; i<n; i++) {
			 if(isValid(current, row, i)) {
				 current.add(i);
				 solveNQueens(results, current, row+1, n);	//we've found current row, so let's find the next one
				 current.remove(current.size()-1);
			 }
		 }
	 }
	 public boolean isValid(ArrayList<Integer> current, int row, int column) {
		 for(int i=0; i<current.size(); i++) {
			 if(current.get(i) == column ||  //same column
					row - column == i-current.get(i) || //- diagonal
					row+column == i+ current.get(i)) { //+ diagonal
				 return false;
			 }
		 }
		 return true;
	 }
}
