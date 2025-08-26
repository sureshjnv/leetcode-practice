package com.leetcode.utility;

public class TreeNode {

	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		this.val = x;
		this.left = null;
		this.right = null;
	}

	public static TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		}
		if (data < root.val) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;
	}

	public static TreeNode buildBST(int[] nodes) {
		TreeNode root = null;
		for (int i : nodes) {
			root = insert(root, i);
		}
		return root;
	}

	public static void inOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.val + " ");
		inOrderTraversal(root.right);
	}

	public static boolean search(TreeNode root, int key) {
		if (root == null)
			return false;

		if (root.val == key) {
			return true;
		}
		if (root.val < key) {
			return search(root.right, key);
		} else {
			return search(root.left, key);
		}
	}

	public static void main(String[] args) {

		int[] nodes = new int[] { 3, 2, 1, 5, 6, 4 };
		TreeNode root = buildBST(nodes);
		inOrderTraversal(root);
		System.out.println(search(root, 15));

	}

}
