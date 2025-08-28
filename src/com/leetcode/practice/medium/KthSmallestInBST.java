package com.leetcode.practice.medium;

import java.util.Stack;

import com.leetcode.utility.TreeNode;

public class KthSmallestInBST {
	
	public int kthSmallest(TreeNode root, int k) {
		
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;
		
		while(curr != null || !stack.isEmpty()) {
			while(curr != null) {
				stack.push(curr);
				curr  = curr.left;		
			}
			
			curr = stack.pop();
			k--;
			if(k==0) {
				return curr.val;
			}
			
			curr = curr.right;
		}
		return -1;
	}

}
