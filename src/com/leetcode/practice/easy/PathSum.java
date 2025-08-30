package com.leetcode.practice.easy;

import com.leetcode.utility.TreeNode;

public class PathSum {
	
	public boolean hasPathSum(TreeNode root, int targetSum) {
		if(root == null) {
			return false;
		}
		
		if(root.left == null && root.right == null) {
			return targetSum == root.val;
		}
		
		boolean left = hasPathSum(root.left,targetSum-root.val);
		boolean right = hasPathSum(root.right,targetSum - root.val);
		
		return left || right ;
	}

}
