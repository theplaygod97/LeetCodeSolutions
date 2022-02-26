package com.hundred.leetcode;

import com.hundred.dto.ListNode;

public class AddListNodes {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.getVal() : 0;
			int y = (q != null) ? q.getVal() : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.setNext(new ListNode(sum % 10));
			curr = curr.getNext();
			if (p != null)
				p = p.getNext();
			if (q != null)
				q = q.getNext();
		}
		if (carry > 0) {
			curr.setNext(new ListNode(carry));
		}
		return dummyHead.getNext();
	}

	public static void main(String[] args) {
		ListNode rL1 = new ListNode(1, new ListNode(2));		

		ListNode rL2 = new ListNode(3, new ListNode(8));

		ListNode result = addTwoNumbers(rL1, rL2);

		while (result != null) {

			System.out.print(result.getVal() + " ");

			result = result.getNext();
		}
	}

}
