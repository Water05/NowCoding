package cn1.datastruct;


public class LinkedListTest <T> {

	private Node1 head;
	private Node1 tail;
	int size = 0;
	public LinkedListTest() {
		
	}
	public void add(T elem) {
	}
	public void linkFirst(T elem) {
		Node1 nodehead = head;
		Node1 newNode = new Node1(null,elem,head);
		if(nodehead == null) {
			this.tail = newNode;
		} else {
			nodehead.pre = newNode;
		}
		head = newNode;
		size++;
	}
	public void linkEnd(T elem) {
		Node1 nodeTail = tail;
		Node1 newNode = new Node1(nodeTail,elem,null);
		this.tail = newNode;
		if(nodeTail == null) {
			this.head = newNode;
		} else {
			nodeTail.next = newNode;
		}
		size++;
	}
	public void unlink(Node1 node) {
		Node1 preNode = node.pre;
		Node1 nextNode = node.next;
		if(preNode == null) {
			head = nextNode;
		} else {
			preNode.next = nextNode;
			node.pre = null;
		}
		if(nextNode == null) {
			tail = preNode;
		} else {
			nextNode.pre = preNode;
		    node.next =null;
		}
		node.data = 0;
		size--;	
	}
	public Node1<T> node(int index) {
		
		if(index < (size << 2)){
			Node1<T> rtnNode1 = head;
			for(int i = 0; i < index; i++) 
				rtnNode1 = rtnNode1.next;
				return rtnNode1;
				
			
		} else {
			Node1<T> rtnNode1 = rtnNode1 = tail;
			for(int i = size -1; i > index; i--)
				rtnNode1 = rtnNode1.pre;
				return rtnNode1;	
		}
	}
	public void remove(Object obj) {
		if(obj == null) {
			for(Node1 x = head; x != null; x = x.next) {
				if(x.data == null) {
					unlink(x);
				}
			}
		} else {
			for(Node1 x = head; x != null; x = x.next) {
				if(obj.equals(x.data)) {
					unlink(x);
				}
			}
		}
	}
	
	public int indexOf(Object o) {
		int index = 0;
		if(o == null) {
			for(Node1 x = head; x != null; x = x.next) {
				if(x.data == null) {
					return index;
				}
				index++;
			}
		} else {
			for(Node1 x = head; x != null; x = x.next) {
				if(o.equals(x.data)){
					return index;
				}
			}
		} 
		
		
		return -1;
		
	}
	public void clear() {
		for(Node1 x = head; x != null;){
			Node1 nextNode = x.next;
			x.pre = null;
			x.next = null;
			x.data = null;
			x = nextNode;
		}
		head = null;
		tail = null;
		size = 0;
	}
	class Node1 <T> {
		private Node1 pre;
		private Node1 next;
		private T data;
		public Node1() {
			
		}
		public Node1(Node1 pre, T data,  Node1 next) {
			this.pre = pre;
			this.next = next;
			this.data = data;
		}
		
	}
	
	
	
	
	
	
	
	
}
