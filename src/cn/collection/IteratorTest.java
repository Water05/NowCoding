package cn.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {
	public static void main(String[] args) {
		List<String> a1 = new  ArrayList();
		a1.add("2");
		ListIterator i1 = a1.listIterator();
		//Iterator i1 = a1.iterator();
		while(i1.hasNext()) {
			Object obj = i1.next();
			if(obj.equals("2")) {
				i1.remove();
				i1.add("33");
				break;
			}
	
		}
		System.out.println(a1);
	}
}

