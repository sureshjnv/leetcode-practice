package com.leetcode.practice.medium;

import com.leetcode.utility.ListNode;

public class ReverseLinkedListII {
	
	public ListNode reverseList(ListNode head, int left, int right) {
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode curr = head;
		ListNode preLeft = dummy;
		
		for(int i = 0; i < left - 1; i++) {
			curr = curr.next;
			preLeft = preLeft.next;
		}
		
		ListNode subListHead = curr;
		ListNode prev = null;
		
		for(int  i = 0; i <= right-left; i++) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		preLeft.next = prev;
		subListHead.next = curr;
		return dummy.next;
		
		
	
	}

}
