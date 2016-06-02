package cn.inner;

import java.text.Annotation;
import java.util.Date;

/**
 * @author Administrator
 * 外部类只能被public和包访问两种修饰，
 * 内部类看起来像是外部类的一个成员，可以像类的成员一样拥有多种权限修饰。
 *
 */
public class InnerClass {
	private static int a = 1;
    /** 
     * 静态内部类是定义在另一个内部类里面，
     * 不能访问外部类的非static成员变量或者方法。
    * @return void 
    */
    public static void outMethod(){ 
        final int beep=0; 
        class Inner{ 
        	int getA(){
        		return a;
        	}
            //使用beep 
        } 
 
        Inner in=new Inner(); 
        System.out.println(in.getA());
    } 
    public static void main(String[] args) {
		//outMethod();
       // Out out = new Out();
       // out.outPrint();
          // Out.In n = new Out().new In();
    	f3();
	}

    /** 
     * 获取成员内部类的方法（private 修饰）    
     * 只能被该外部类的方法采用
     * 其他的包则不能引用
     * 
    * @return void 
    */
    public static void f2() {
    	Out out = new Out();
    	out.outPrint();
    }
    /** 
     * 获取成员内部类的方法 （非private修饰） 
    * @return void 
    */
    public static void f1() {
    	Outter outter = new Outter();
    	Outter.Inner inner = outter.new Inner();
    	Outter.Inner inner2 = outter.getInnerInstance();
    }
    
    
    /** 
     * 匿名内部类就是没有名字的局部内部类，
     * 不适用关键字class extends，implements没有构造方法
     * 匿名内部类隐式地继承了一个父类或者实现了一个接口
     * 
    * @return void 
    */
    public static void f3() {
    	AnonymouseInnerClass test = new AnonymouseInnerClass();
    	String string = test.getDate(new Date());
    	String string2  = test.getDate(new Date(){});
    	String string3 = test.getDate(new Date(){
    		 // 重写父类中的方法
   
    		public String toString(){
    			return "hello: ";                 
    		}
    	});
    	System.out.println(string);
    	System.out.println(string2);
    	System.out.println(string3);
    }
    
}

class Out {
    private int age = 12;
     
    private class In {
        public void print() {
            System.out.println(age);
        }
    }
    public void outPrint() {
        new In().print();
    }
}
class Outter{
	private Inner inner = null;
	public Outter() {
		
	}
	public Inner getInnerInstance() {
		if(inner == null) {
			inner = new Inner();
		}
		return inner;
	}
	class Inner{
		public Inner() {
			
		}
		
	}
	public static void main(String[] args) {
		Outter a = new Outter();
		Outter.Inner b =  a.new Inner();
	}
}


class People{
	public People() {
		
	}
}
/**
 * 局部内部类是定义在一个方法或者一个作用域里面的类，它和成员内部类
 * 的区别在于局部内部类的访问权限仅限于方法的内部或者该作用域内
 * 注意：：：：
 * 局部内部类就像方法里面的一个局部变量一样，是不能有public
 * private protected及static修饰符的
 *
 */
class Man{
	public Man() {
		
	}
	public People getWoman() {
		class Woman extends People{
			int age = 0;
		}
		return new Woman();
	}
}
/**
 * 静态内部类
 * 引用方法，OuterCls.Inner inner = new OuterCls.Inner();
 *
 */
 class OuterCls{
	 private int a = 0;
	 private static String c = "abc";
		public OuterCls() {
			// TODO Auto-generated constructor stub
		}
		static class Inner implements A,B{
			public Inner(){
			}
			Object f1() {
				return c;
			}
		}
	public static void main(String[] args) {
		OuterCls.Inner a = new OuterCls.Inner();
	}
	
}
interface A{
	
}
interface B {
	
}
class AnonymouseInnerClass{
	public String getDate(Date date) {
		return date.toString();
	}
}

