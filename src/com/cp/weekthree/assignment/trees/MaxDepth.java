package com.cp.weekthree.assignment.trees;

import com.cp.weekthree.assignment.trees.InvertTree.TreeNode;

public class MaxDepth {
	public int maxDepth(TreeNode a) {
	    if(a==null) {
	        return 0;
	    }
	    return Math.max(maxDepth(a.left), maxDepth(a.right)) + 1;
	}
}
