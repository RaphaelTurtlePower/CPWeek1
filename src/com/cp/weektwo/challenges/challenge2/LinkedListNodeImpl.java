package com.cp.weektwo.challenges.challenge2;

public class LinkedListNodeImpl<E> implements LinkedListNode<E> {

	E value;
	LinkedListNode<E> next;
	@Override
	public E getValue() {
		return value;
	}
	

	public LinkedListNodeImpl() {
		
	}
	
	public LinkedListNodeImpl(E val) {
		this.value = val;
	}
	

	@Override
	public void setValue(E value) {
		this.value = value;
	}

	@Override
	public LinkedListNode<E> getNext() {
		return next;
	}

	@Override
	public void setNext(LinkedListNode<E> next) {
		this.next = next;
	}

	@Override
	public void setValuesFromArray(E[] listValues) {
		if(listValues == null || listValues.length < 1) {
			return;
		}
		
		setValue(listValues[0]);
		LinkedListNode<E> current = this;
		for(int i=1; i<listValues.length; i++) {
			LinkedListNodeImpl<E> node = new LinkedListNodeImpl<E>();
			node.setValue(listValues[i]);
			current.setNext(node);
			current = node;
		}
	}

}
