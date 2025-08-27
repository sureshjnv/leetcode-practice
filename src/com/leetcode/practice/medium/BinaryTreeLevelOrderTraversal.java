package com.leetcode.practice.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.leetcode.utility.TreeNode;

public class BinaryTreeLevelOrderTraversal {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> result = new ArrayList<>();
		if(root == null) {
			return result;
		}
		levelorder(root,result);
		return result;
		
	}

	private void levelorder(TreeNode root, List<List<Integer>> result) {
		// TODO Auto-generated method stub
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> subList = new ArrayList<>();
			
			for(int i = 0; i < size; i++) {
				TreeNode curr = queue.poll();
				subList.add(curr.val);
				
				if(curr.left != null) {
					queue.add(curr.left);
				}
				if(curr.right != null) {
					queue.add(curr.right);
				}
			}
			result.add(subList);
		}
		
	}

}
