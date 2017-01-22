package com.cp.weektwo.challenges.challenge2;

public class AddTwoNumbers {
	
	public LinkedListNode<Integer> addTwoNumbers(LinkedListNode<Integer> left, LinkedListNode<Integer> right) {
		LinkedListNode<Integer> headPtr = new LinkedListNodeImpl<Integer>();
		LinkedListNode<Integer> current = headPtr;
		int carry = 0;
		while(left != null && right != null) {
			int sum = left.getValue() + right.getValue() + carry;
			int remainder = sum % 10;
			carry = sum / 10;
			current.setNext(new LinkedListNodeImpl<Integer>(remainder));
			current = current.getNext();
			left = left.getNext();
			right = right.getNext();
		}
		
		while(left != null) {
			int sum = left.getValue() + carry;
			int remainder = sum % 10;
			carry = sum / 10;
			current.setNext(new LinkedListNodeImpl<Integer>(remainder));
			current = current.getNext();
			left = left.getNext();
			
		}
		
		while(right != null) {
			int sum = right.getValue() + carry;
			int remainder = sum % 10;
			carry = sum / 10;
			current.setNext(new LinkedListNodeImpl<Integer>(remainder));
			current = current.getNext();
			right = right.getNext();
		
		}
		
		if(carry > 0) {
			current.setNext(new LinkedListNodeImpl<Integer>(carry));
		}
		return headPtr.getNext();
	}
 }
