package cn.collection;

import java.util.LinkedList;

public class StackT<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	public void push(T v) {
		storage.addFirst(v);
	} 
	public void peek() {
		storage.getFirst();
	}
	public void pop() {
		storage.removeFirst();
	}
	public boolean empty() {
		return storage.isEmpty();
	}
	public String toString() {
		return storage.toString();
	}

}
