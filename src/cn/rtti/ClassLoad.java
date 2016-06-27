package cn.rtti;

import java.util.Random;

public class ClassLoad {
	public static void main(String[] args) throws ClassNotFoundException {
		ClassInitialization.f1();
	}

}
class ClassInitialization {
	public static Random random = new Random(47);
	static {
		System.out.println("ClassInitialization");
		}
	public static void f1() throws ClassNotFoundException {
		Class initableClass = Initable.class;
		System.out.println("after Initable");
		System.out.println(Initable.a1);
		//System.out.println(Initable.a2);
		System.out.println(Initable2.a1);
		Class initable3 = Class.forName("cn.rtti.Initable3");
		System.out.println("after Initable3 ref");;
		System.out.println(Initable3.a1);
	}
	
}
class ClassInitialization1 {
	public static Random random = new Random(47);
	static {
		System.out.println("ClassInitialization1");
		}
	public static void f1() throws ClassNotFoundException {
		Class initableClass = Initable.class;
		System.out.println("after Initable");
		System.out.println(Initable.a1);
		System.out.println(Initable.a2);
		System.out.println(Initable2.a1);
		Class initable3 = Class.forName("cn.rtti.Initable3");
		System.out.println("after Initable3 ref");;
		System.out.println(Initable3.a1);
	}
	
}
class Initable {
	static  int a1 = 47;
	static final int a2 = ClassInitialization1.random.nextInt(1000);
	static {
		System.out.println("Initalbe");
	}

}
class Initable2 {
	static final int a1 = 147;
	static {
		System.out.println("Initalbe2");
	}
}
class Initable3 {
	static final int a1 = 74;
	static {
		System.out.println("Initalbe3");
	}
}

