package cn.genericity;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.T;
class ClassA<T> {
	private T t;
	void f8() {
		//Cannot instantiate the type T
		// T t1 = new T();
		//Cannot create a generic array of T
		//T[] mm = new T[2];
	}
}
public class Erasure {

	public static void main(String[] args) {
	/*	BMOne one = new BMTwo();  
        one.getT(new Object()); */ 
		f4();
	}
	
	void f7() {
		//Cannot create a generic array of ClassA<String>
		//ClassA<String>[]  table = new ClassA<String>[10]; 
	}
	void f5() {
		ArrayList<String> arrayList = new ArrayList<String>();
		//Cannot perform instanceof check against parameterized type ArrayList<String>. Use the form ArrayList<?> 
		//instead since further generic type information will be erased at runtime
/*		if(arrayList instanceof ArrayList<String>) {
			
		}*/
	}

	/** 
	 * 类型检查就是指针引用的，谁是一个引用，用这个引用调用泛型方法，就会对这个引用调用
	 * 的方法进行类型检测，而无关它真正引用个对象   
	* @return void 
	*/
	public static void f1() {
		ArrayList<String> arrayList1 = new ArrayList();
		arrayList1.add("1");
		// arrayList1.add(2);//The method add(int, String) in the type
		// ArrayList<String> is not applicable for the arguments (int)
		String str1 = arrayList1.get(0);

		// 实际arrayList中的元素为Object类型
		ArrayList arrayList2 = new ArrayList<String>();
		arrayList2.add(2);
		arrayList2.add("2");
		Object object2 = arrayList2.get(0);

		new ArrayList<String>().add("22");
		// new ArrayList<String>().add(22);//The method add(i)nt, String) in the
		// type ArrayList<String> is not applicable for the arguments (int)

		// int str2 = new ArrayList<String>().get(0);//Type mismatch: cannot
		// convert from String to int

	}
	/** 
	 * * 泛型中的引用传递问题  
	 * 假设这行第四句的时候编译没错，那么当我们使用arrayList2引用get（）方法的时候，
	 * 返回值都是String的对象，可以它里面实际是Object类型对象，这样就有ClassCastException。
	 * 所以java不允许进行这样的传递。（这也是泛型出现的原因，就是为了解决类型转换的问题，不能违背它的初衷）   
	* @return void 
	*/
	void f2() {
		
		//ArrayList<String> arrayList = new ArrayList<Object>();//: cannot convert from ArrayList<Object> to ArrayList<String> 
	ArrayList<Object> arrayList1 = new ArrayList<Object>();
	arrayList1.add(new Object());
	arrayList1.add(new Object());
	//ArrayList<String> arrayList2 = arrayList1;// cannot convert from ArrayList<Object> to ArrayList<String>
	}
	
	/** * 泛型中的引用传递问题  
	 * 泛型出现的原因就是为了解决类型转换的问题。我们使用泛型，到头来还是要自己强转，
	 * 违背了泛型设计的初衷，所以java不允许这么干。如果往arrayList2里面add（）新的对象
	 * ，不知道取得的是object还是String
	 * 泛型中的引用传递  
	* @return void 
	*/
	void f3() {
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add(new String(""));
		arrayList1.add(new String());
		//ArrayList<Object> arrayList2 = arrayList1; //cannot convert from ArrayList<String> to ArrayList<Object>
	}
	public static void f4(){
		ClassA<String> a = new ClassA<String>(); 
		ClassA b = a;
		ClassA<?> b3 = a;
		ClassA<Object> b2 = b;
		ClassA<String> a1 = b;
	}
	
	public static class BMOne<T> {  
        public T getT(T args) {  
            return args;  
        }  
    }  
  
    public static class BMTwo extends BMOne<String> {  
        public String getT(String args) {  
            return args;  
        }  
    }  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
