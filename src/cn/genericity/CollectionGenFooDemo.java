package cn.genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionGenFooDemo {
	public static void main(String[] args) {
		CollectionGenFoo<ArrayList> listFoo = null;
		listFoo = new CollectionGenFoo<ArrayList>(new ArrayList());
		//Type mismatch: cannot convert from CollectionGenFoo<ArrayList> to 
		//CollectionGenFoo<Collection>
		//CollectionGenFoo<Collection> collFoo = null;
		//collFoo = new CollectionGenFoo<ArrayList>(new ArrayList<>());
		CollectionGenFooDemo example = new CollectionGenFooDemo();
		example.f("aa");
		example.f(2);
		example.f(example);
	}
	public <T> void f(T x){
		System.out.println(x.getClass().getName());
	} 
  
}
class CollectionGenFoo<T extends Collection> {
	private T t;
	public CollectionGenFoo(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
	public void setT() {
		this.t = t;
		
	}

	public static <T> void f2(T t) {
		System.out.println(t.getClass().getName());
	}
	public  void f3() {
		System.out.println(t.getClass().getName());
	}
} 
class StaticTest {
	private static String str;
	public static void f2() {
		System.out.println(str.getClass().getName());
	}
}










