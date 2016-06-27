package cn.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class CollectionTest {
	public static void f1() {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4)) ;
		Integer[] moreInts = {2,3,4,5};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 1,2,3,9);
		Collections.addAll(collection, moreInts);
		List<Integer> list = Arrays.asList(15,14,16);
		list.set(1,2);
		list.add(2);
	}
	public static void f2() {
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush()) ;
		//Type mismatch: cannot convert from List<Powder> to List<Snow>
		//List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy()); 
		
		
	}
	public static void main(String[] args) {
		f4();
	}
	public static void f3() {
		Collection<String> c = new ArrayList<String>();
		c.add("a");
		Object[] str =  c.toArray(new String[2]);
		System.out.println(str[0]);
		//The method add(String) in the type Collection<String> is not applicable for the arguments
		//c.add(2);
		List<String> a = new ArrayList<String>();
		a.add("D");
		String b = a.get(0);
		System.out.println(b);
	}
	public static void f4() {

		List<String> a = new ArrayList<String>();
		a.add("D");
		a.add("D");
		a.add("D");
		a.add("D");
		a.add("D");
		String b = a.get(0);
		Iterator<String> it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		} 
		System.out.println(a);
	}
	public static void f5() {
		LinkedHashMap<Integer,String>	linkedMap = new LinkedHashMap<Integer,String>(16,0.75f,true);
	}

}
class Snow { }
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow{}