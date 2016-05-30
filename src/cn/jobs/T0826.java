package cn.jobs;

public class T0826 {
	
/*	*//**
	 * change第一个函数传递的不是string的引用，所以不会改变值，
	 * 第二个参数会退化为指针，所以改变传入参数的值
	 *//*
	String str=new String("hello");
	char[]ch={'a','b'};
	public static void main(String args[]){
		T0826 ex=new T0826();
		ex.change(ex.str,ex.ch);
		System.out.println(ex.str+"and");
		System.out.println(ex.ch);
	}
    public void change(String str,char ch[]){
    	str="test ok";
    	ch[0]='c';
    }*/
	
	
	
/*	*//**
	 * testMethod方法用static修饰的，
	 * 是存在方法区中的，所以可以调用，
	 * 如果把static去掉，就会报空指针异常
	 *//*
	private static void testMethod(){
		System.out.println("testMethod");
	}
	public static void main(String[]args){
		((T0826)null).testMethod();
	}*/
	
	
}
