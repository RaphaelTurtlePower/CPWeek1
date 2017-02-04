package com.cp.weekthree.assignment.trees;


public class IsBalanced {
	  static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	public int isBalanced(TreeNode a) {
	    if(a== null) {
	        return 1;
	    }
	    if( Math.abs(getMaxDepth(a.left)-getMaxDepth(a.right)) <= 1) {
	        return 1;
	    } else {
	        return 0;
	    }
	}
	
	public int getMaxDepth(TreeNode a) {
	    if(a==null) {
	        return 1;
	    } else {
	        return Math.max(getMaxDepth(a.left), getMaxDepth(a.right)) + 1;
	    }
	}
	
	public static void main(String[] args) {
		IsBalanced t = new IsBalanced();
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		a.left = b;
		a.right = c;
		TreeNode d = new TreeNode(4);
		c.left = d;
		TreeNode e = new TreeNode(5);
			d.right = e;
		System.out.println(t.isBalanced(a));
	}
}
