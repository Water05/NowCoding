package cn.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Bird> bSet = new TreeSet();
		bSet.add(new Bird(3));
		bSet.add(new Bird(5));
		bSet.add(new Bird(2));
		Iterator<Bird> iter = bSet.iterator();
		while(iter.hasNext()) {
			Bird bird = iter.next();
			System.out.println(bird);
		}
	}

}
class Bird implements Comparable<Bird> {
	int size;
	public Bird(int s) {
		size = s;
	}
	public String toString() {
		return this.size + "";
	}
	@Override
	public int compareTo( Bird o) {
		return size - o.size;
	}
}
