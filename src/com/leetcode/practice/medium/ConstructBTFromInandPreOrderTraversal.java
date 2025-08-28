package com.leetcode.practice.medium;

import java.util.HashMap;
import java.util.Map;

import com.leetcode.utility.TreeNode;

public class ConstructBTFromInandPreOrderTraversal {
	
	int preIdx = 0;
	Map<Integer,Integer> inorderMap = new HashMap<>();
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		
		for(int i = 0 ; i < inorder.length;i++) {
			inorderMap.put(inorder[i], i);
		}
		
		return helper(preorder,0,inorder.length-1);
		
	}

	private TreeNode helper(int[] preorder, int left, int right) {
		// TODO Auto-generated method stub
		if(left > right)
			return null;
		TreeNode root = new TreeNode(preorder[preIdx]);
		int inIdx = inorderMap.get(preorder[preIdx]);
		preIdx++;
		root.left = helper(preorder,left,inIdx-1);
		root.right = helper(preorder,inIdx+1,right);
		return root;
	}

}
