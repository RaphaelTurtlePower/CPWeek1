package com.cp.weekthree.prework.trees;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {
	 class TreeNode {
		      int val;
		     TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	
		public ArrayList<Integer> preorderTraversal(TreeNode a) {
			ArrayList<Integer> result = new ArrayList<>();
			if(a==null) {
				return result;
			}
			
			Stack<TreeNode> values = new Stack<>();
			values.push(a);
			while(!values.isEmpty()) {
				TreeNode p = values.pop();
				result.add(p.val);
				if(p.right != null) {
					values.push(p.right);
				}
				if(p.left != null) {
					values.push(p.left);
				}
			}
			
			return result;
			
		}
	
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
		ArrayList<Integer> result = new ArrayList<>();
		if(a==null) {
			return result;
		}
		
		Stack<TreeNode> values = new Stack<>();
	    TreeNode p = a;
	    while(p != null) {
	        values.push(p);
	        p = p.left;
	    }
	
	
		while(!values.isEmpty()) {
			p = values.pop();
			result.add(p.val);
			
			if(p.right != null) {
		        p = p.right;
		        while(p != null) {
		            values.push(p);
		            p = p.left;
		        }
			}
		}
		
		return result;
	}
}
