package cn.reflect;

import java.lang.reflect.Field;

class Person{
	public String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
}

public class ReflctTest {
public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
	Person p= new Person("zhang",12);
	Class<?> c=p.getClass();
	Field f1=c.getField("name");
	String str=(String) f1.get(p);
	System.out.println(str);
	
	Field f2=c.getDeclaredField("age");
	f2.setAccessible(true);
	int age=(int)f2.get(p);
	System.out.println(age);
	
}
}
