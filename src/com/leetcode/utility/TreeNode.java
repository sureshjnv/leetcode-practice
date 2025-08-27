package com.leetcode.utility;

import java.util.Stack;

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

	public static void inOrderIterativeTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;

		while (true) {
			if (curr != null) {
				stack.push(curr);
				curr = curr.left;
			} else {
				if (stack.isEmpty()) {
					break;
				}
				curr = stack.pop();
				System.out.print(curr.val + " -> ");
				curr = curr.right;
			}
		}
	}

	public static void preOrderIterativeTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		if (root == null)
			return;
		stack.push(root);

		while (!stack.isEmpty()) {

			TreeNode curr = stack.pop();
			System.out.print(curr.val + " -> ");
			if (curr.right != null) {
				stack.push(curr.right);
			}
			if (curr.left != null) {
				stack.push(curr.left);
			}
		}
	}

	public static void postOrderIterativeTraversalTwoStack(TreeNode root) {

		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		if (root == null)
			return;
		stack1.push(root);

		while (!stack1.isEmpty()) {

			TreeNode curr = stack1.pop();
			stack2.push(curr);
			if (curr.left != null) {
				stack1.push(curr.left);
			}
			if (curr.right != null) {
				stack1.push(curr.right);
			}

		}

		while (!stack2.isEmpty()) {
			System.out.println(stack2.pop().val + " -> ");
		}
	}

	public static void postOrderIterativeTraversalOneStack(TreeNode root) {

		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;
		TreeNode lastVisited = null;
		
		while(curr != null || !stack.isEmpty()) {
			if(curr != null) {
				stack.add(curr);
				curr = curr.left;
			}
			else {
				TreeNode peekNode = stack.peek();
				if(peekNode.right != null && lastVisited != peekNode.right) {
					curr = peekNode.right;
				}
				else {
					System.out.print(peekNode.val+"->");
					lastVisited = stack.pop();
				}
			}
		}
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
		inOrderIterativeTraversal(root);
		preOrderIterativeTraversal(root);
		postOrderIterativeTraversalTwoStack(root);
		postOrderIterativeTraversalOneStack(root);
		System.out.println(search(root, 15));

	}

}
