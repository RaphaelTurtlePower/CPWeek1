package com.cp.weektwo.challenges.challenge2;

import org.junit.Assert;
import org.junit.Test;

import com.cp.weektwo.challenges.challenge2.LinkedListNode;
import com.cp.weektwo.challenges.challenge2.LinkedListNodeImpl;

public class AddTwoNumbersTest {
	 @Test
	    public void test() {
	        LinkedListNode<Integer> head = null;
	        Integer[] listValues = new Integer[] {1, 2, 3};
	        Integer[] values = new Integer[] {7,8,9};
	        head = new LinkedListNodeImpl<>(); // replace with your implementation
	        head.setValuesFromArray(listValues);

	        LinkedListNode<Integer> head2 = new LinkedListNodeImpl<>();
	        head2.setValuesFromArray(values);
	        AddTwoNumbers atn = new AddTwoNumbers();
	        LinkedListNode<Integer> results = atn.addTwoNumbers(head, head2);
	        Assert.assertNotNull(results);
	        
	        
	    }
}
