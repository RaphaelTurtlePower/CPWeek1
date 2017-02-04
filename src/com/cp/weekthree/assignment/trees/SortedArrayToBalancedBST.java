package com.cp.weekthree.assignment.trees;

import java.util.List;

public class SortedArrayToBalancedBST {
	  class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	  
		public TreeNode sortedArrayToBST(final List<Integer> a) {
		    return bstHelper(a, 0, a.size()-1);
		}
		
		public TreeNode bstHelper(final List<Integer> arr, int start, int end) {
		    if(start > end || arr == null || arr.size() < 1) {
		        return null;
		    }
		    
		    int mid = start + (end-start)/2;
		    TreeNode root = new TreeNode(arr.get(mid));
		    root.left = bstHelper(arr, start,mid-1);
		    root.right = bstHelper(arr, mid+1, end);
		    
		    return root;
		    
		}
}
