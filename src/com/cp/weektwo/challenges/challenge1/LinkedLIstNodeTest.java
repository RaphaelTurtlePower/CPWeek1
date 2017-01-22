package com.cp.weektwo.challenges.challenge1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class LinkedLIstNodeTest {

    @Test
    public void test() {
        LinkedListNode<Integer> head = null;
        Integer[] listValues = new Integer[] {1, 2, 3};

        head = new LinkedListNodeImpl<>(); // replace with your implementation
        head.setValuesFromArray(listValues);

        assertEquals(listValues[0], head.getValue());
        assertNotNull(head.getNext());
        assertEquals(listValues[1], head.getNext().getValue());
        assertNotNull(head.getNext().getNext());
        assertEquals(listValues[2], head.getNext().getNext().getValue());
        assertNull(head.getNext().getNext().getNext());
    }
}
