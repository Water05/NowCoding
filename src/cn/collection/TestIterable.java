package cn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestIterable {

}
class ScanAppleStore implements Iterable<String> {
	ArrayList<String> appleStore = new ArrayList<String>();
	public ScanAppleStore() {
		Collections.addAll(appleStore, "sweet","sour","bitter");
		System.out.println(appleStore);
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<String>(){
			private int i = 0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				if(i < appleStore.size()) {
					return true;
				}
				return false;
			}
			@Override
			public String next() {
				// TODO Auto-generated method stub
				return appleStore.get(i++);
			}
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				appleStore.remove(i);
				
			}
		};
	}
	
} 
