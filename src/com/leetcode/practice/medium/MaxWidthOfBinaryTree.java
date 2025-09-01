package com.leetcode.practice.medium;

import java.util.ArrayDeque;
import java.util.Deque;

import com.leetcode.utility.TreeNode;

class Pair {

	TreeNode node;
	int index;

	public Pair(TreeNode node, int index) {
		this.node = node;
		this.index = index;
	}

}

public class MaxWidthOfBinaryTree {

	public int widthOfBinaryTree(TreeNode root) {

		int maxWidth = 0;
		if (root == null) {
			return 0;
		}
		Deque<Pair> queue = new ArrayDeque<>();
		queue.add(new Pair(root, 0));
		while (!queue.isEmpty()) {
			int size = queue.size();
			int first = 0;
			int last = 0;
			int minIdx = queue.peekFirst().index;
			for (int i = 0; i < size; i++) {
				Pair curr = queue.pollFirst();
				int currIdx = curr.index - minIdx;
				
				if(i ==0) {
					first = currIdx;
				}
				if(i == size -1) {
					last = currIdx;
				}
				
				if(curr.node.left != null) {
					queue.add(new Pair(curr.node.left,2*currIdx+1));
				}
				
				if(curr.node.right != null) {
					queue.add(new Pair(curr.node.right,2*currIdx+2));
				}
			}
			
			maxWidth = Math.max(maxWidth, last -  first +1);
		}

		return maxWidth;

	}

}
