package cn.genericity.comparegenobj;

public class GenDemo {

	public static void main(String[] args) {
		Gen<Integer> intOb = new Gen<Integer>(10);
		intOb.showType();
		int i = intOb.getOb();
		System.out.println("value= " + i);
         //
		Gen<String> strOb = new Gen<String>("abc");
		strOb.showType();
		String str = strOb.getOb();
		System.out.println(str);
	} 
}
class Gen<T> {
	private T ob;//定义泛型成员变量
	public Gen(T t) {
		this.ob = t;
	} 
	public T getOb() {
		return this.ob;
	}
	public void setOb(T t) {
		this.ob = t;
		
	}
	public void showType() { 
		System.out.println("T的实际类型是：" + ob.getClass().getName());
	}
}
