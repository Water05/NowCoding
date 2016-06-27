package cn.exception;

public class Exceptions {

	public static void main(String[] args) throws Exception {
		f2();
	}
	public static void g1() throws MyException {
		try {
			FullConstructors.f();
		} catch(MyException e) {
			System.out.println("Inside");
			e.printStackTrace();
			throw e;
			
		}
	}
	public static void h1() throws Exception {
		try {
			FullConstructors.g();
		} catch(MyException e) {
		/*	System.out.println("1 " + e.getMessage());
			System.out.println("2 " + e.getLocalizedMessage());
			System.out.println("3 " + e.toString());*/
			System.out.println("out1111111");
			e.printStackTrace();
			throw (Exception)e.fillInStackTrace();
		/*	for(StackTraceElement ste : e.getStackTrace()){
				System.err.println(ste.getMethodName());
			}*/
		}
	}
	
	/** 
	 * printStackTrace（）方法显示的将是原来异常抛出点的调用栈信息
	 * fillInstackTrace()方法，通过把当前调用栈信息填入原来那个异常对象而建立
	* @return void 
	*/
	public static void f2() throws Exception {
		try {
			g1();
		} catch(MyException e) {
			System.out.println("Inside222");
			e.printStackTrace();
			
		}
		try {
			h1();
		} catch(MyException e) {
		/*	System.out.println("1 " + e.getMessage());
			System.out.println("2 " + e.getLocalizedMessage());
			System.out.println("3 " + e.toString());*/
			System.out.println("out222222");
			e.printStackTrace();
		/*	for(StackTraceElement ste : e.getStackTrace()){
				System.err.println(ste.getMethodName());
			}*/
		}
	}
	public static void f1() throws Exception {
		try {
			FullConstructors.f();
		} catch(MyException e) {
			System.out.println("Inside2222");
			e.printStackTrace();
			throw e;
			
		}
		try {
			FullConstructors.g();
		} catch(MyException e) {
		/*	System.out.println("1 " + e.getMessage());
			System.out.println("2 " + e.getLocalizedMessage());
			System.out.println("3 " + e.toString());*/
			System.out.println("out");
			e.printStackTrace();
			throw (Exception)e.fillInStackTrace();
		/*	for(StackTraceElement ste : e.getStackTrace()){
				System.err.println(ste.getMethodName());
			}*/
		}
	}
}
class MyException extends Exception {
	public MyException() {}
	public MyException(String msg) {
		super(msg);
	}
}
class FullConstructors {
	public static void f() throws MyException {
		System.out.println("f()");
		throw new MyException();
	}
	public static void g() throws MyException {
		System.out.println("g()");
		throw new MyException("in g()");
	}
}