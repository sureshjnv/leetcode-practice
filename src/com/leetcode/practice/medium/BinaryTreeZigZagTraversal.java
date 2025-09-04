package com.leetcode.practice.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.leetcode.utility.TreeNode;

public class BinaryTreeZigZagTraversal {
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
		List<List<Integer>> result = new ArrayList<>();
		if(root == null) {
			return result;
		}
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		boolean leftToRight = true;
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> level = new ArrayList<>();
			for(int i = 0; i < size;i++) {
				TreeNode curr = q.poll();
				if(leftToRight) {
					level.add(curr.val);
				}
				else {
					level.add(0,curr.val);
				}
				
				if(curr.left != null) {
					q.offer(curr.left);
				}
				if(curr.right != null) {
					q.offer(curr.right);
				}
			}
			result.add(level);
			leftToRight = !leftToRight;	
			
		}
		
		return result;
		
	}

}
