package com.cp.weekthree.prework.trees;

public class IdenticalBinaryTrees {
	  class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public int isSameTree(TreeNode a, TreeNode b) {
		if(a==null && b != null || a != null && b==null) {
			return 0;
		}
		
		if(a==null && b == null) {
			return 1;
		}
		
		if(a.val != b.val) {
			return 0;
		}
		
		if(isSameTree(a.left, b.left) == 1 && isSameTree(a.right, b.right) == 1) {
			return 1;
		} else {
			return 0;
		}
	}
}
