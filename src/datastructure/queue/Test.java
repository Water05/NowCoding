package datastructure.queue;

import java.io.PrintStream;

public class Test {
	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue();
		for (int i = 0; i < 20; ++i)
			queue.push(Integer.valueOf(i));

		System.out.println(queue);
		for (int i = 0; i < 15; ++i){
		queue.deQueue();
		}
	/*	Object obj1 = queue.deQueue();
		Object obj2 = queue.deQueue();
		System.out.println("count:" + queue.size() + "  obj1:" + obj1 + "  obj2:" + obj2);*/
		
	//	System.out.println("peek:" + queue.peek());
	}
}