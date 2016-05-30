package cn.genericity;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	public static void f1() {
		List list = new ArrayList();
		list.add("qq");
		list.add(100);
		for(int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);
			System.out.println(name);
		}
	}
	public static void f2() {
		List<String> list = new ArrayList<String>();
		list.add("dd");
		//list.add(10);//提示编译错误
	}
	/** 
	 * 在使用泛型实参，虽然传入了不同的泛型实参，但没有生成不同的类型，
	 * 还是原来最基本的类型
	 * java中泛型目的：参数化类型，在编译的时候检查类型安全
	 * 并且所有的强制转换都是自动和隐式的
	 * 在编译过程中，对于正确检验泛型结果后，会将泛型的相关信息擦除，
	 * 成功编译后的class文件中是不包含任何泛型信息的。泛型信息不回进入到运行阶段  
	* @return void 
	*/
	public static void f3() {
		Box<String> nameBox = new Box<String>("ab");
		System.out.println(nameBox.getData());
		Box<Integer> ageBox = new Box<Integer>(10);
		System.out.println(ageBox.getData());
        System.out.println(nameBox.getClass());
        System.out.println(ageBox.getClass());
	}
	/** 
	 * 在逻辑上Box<Number>不能是Box<Integer>的父类  
	* @return void 
	*/
	public static void f4() {
	    Box<Number> nameBox = new Box<Number>(10);
	    Box<Integer> ageBox = new Box<Integer>(10);
	    getData(nameBox);
	    //The method getData(Box<Number>) in the type GenericTest is not 
	    //applicable for the arguments (Box<Integer>
	    //getData(ageBox);
	}
	
	/** 
	 * 通配符上限，限制类型  
	* @return void 
	*/
	public static void f5() {
		Box<Number> nameBox = new Box<Number>(10);
		Box<Integer> ageBox = new Box<Integer>(10);
		Box<String> strBox = new Box<String>("ab");
		getData2(nameBox);
		getData2(ageBox);
		getData2(strBox);
		getUpperNumberData(nameBox);
		getUpperNumberData(ageBox);
		//The method getUpperNumberData(Box<? extends Number>) 
		//in the type GenericTest is not applicable 
		//for the arguments (Box<String>)
		//getUpperNumberData(strBox);
	}
	public static void getData(Box<Number> data){
		         System.out.println("data :" + data.getData());
		     }
	public static void getData2(Box<?> data){
        System.out.println("data :" + data.getData());
    }
	public static void getUpperNumberData(Box <? extends Number> data) {
		System.out.println("data :" + data.getData());
		
	}
	public static void main(String[] args) {
		//f1();
		f3();
	
	}

}
class Box<T> {
	private T data;
	public Box() {
		
	}
	public Box(T t) {
		this.data = t;
	} 
	public T getData() {
		return data;
	}
}
