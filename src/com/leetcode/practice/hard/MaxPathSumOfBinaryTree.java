package com.leetcode.practice.hard;

import com.leetcode.utility.TreeNode;

public class MaxPathSumOfBinaryTree {
	
	public int maxPathSum(TreeNode root) {
		
		int[] maxSum = new int[1];
		maxSum[0] = root.val;
		maxPath(root,maxSum);
		return maxSum[0];
		
	}

	private int maxPath(TreeNode root, int[] maxSum) {
		if(root == null) {
			return 0;
		}
		
		int left = Math.max(0, maxPath(root.left,maxSum));
		int right = Math.max(0, maxPath(root.right,maxSum));
		
		maxSum[0] = Math.max(maxSum[0], root.val+left+right);
		
		return root.val+Math.max(left, right);
		
	}

}
