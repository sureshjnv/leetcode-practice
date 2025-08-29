package com.leetcode.practice.easy;

import java.util.LinkedList;
import java.util.Queue;

import com.leetcode.utility.TreeNode;

public class MaxDepthAndMinDepthOfBinaryTree {
	
	public int minDepth(TreeNode root) {
		
		Queue<TreeNode> queue = new LinkedList<>();
		if(root == null) {
			return 0;
		}
		queue.add(root);
		int level = 0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size;i++) {
				TreeNode curr = queue.poll();
				if(curr.left != null)
					queue.add(curr.left);
				if(curr.right != null)
					queue.add(curr.right);
				if(curr.left == null && curr.right == null) {
					return level+1;
				}
			}
			level++;
		}
		return level;
		
	}
	
	public int minDepthRec(TreeNode root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null)
			return 1+minDepthRec(root.right);
		if(root.right == null) {
			return 1+minDepthRec(root.left);
		}
		return 1+ Math.min(minDepthRec(root.left), minDepthRec(root.right));
	}
	
	public int maxDepth(TreeNode root) {
		
		Queue<TreeNode> queue = new LinkedList<>();
		if(root == null) {
			return 0;
		}
		queue.add(root);
		int level = 0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size;i++) {
				TreeNode curr = queue.poll();
				if(curr.left != null)
					queue.add(curr.left);
				if(curr.right != null)
					queue.add(curr.right);
			}
			level++;
		}
		return level;
		
	}
	
	public int maxDepthRec(TreeNode root) {
		
		if(root == null)
			return 0;
		int left = maxDepthRec(root.left);
		int right = maxDepthRec(root.right);
		
		return 1+Math.max(left, right);
		
	}

}
