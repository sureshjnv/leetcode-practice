package com.leetcode.practice.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.leetcode.utility.TreeNode;

public class BinaryTreeRightSideView {
	
    public List<Integer> rightSideView(TreeNode root) {
    	
    	List<Integer> result = new ArrayList<>();
    	if(root == null) {
    		return result;
    	}
    	Queue<TreeNode> q = new LinkedList<>();
    	q.add(root);
    	while(!q.isEmpty()) {
    		int size = q.size();
    		int lastElement = -1;
    		for(int i = 0 ; i < size;i++) {
    			TreeNode curr = q.poll();
    			lastElement = curr.val;
    			if(curr.left!=null)
    				q.offer(curr.left);
    			if(curr.right != null)
    				q.offer(curr.right);
    		}
    		result.add(lastElement);
    	}
    	return result;
    }


}
