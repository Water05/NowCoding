package cn.finaltest;

public class FinalTest {
    public static void main(String[] args)  {
      MyClass myClass = new MyClass();
        StringBuffer buffer = new StringBuffer("hello");
        System.out.println(buffer.hashCode());
        myClass.changeValue(buffer);
        System.out.println(buffer.toString());
        System.out.println(buffer.hashCode());
    	
    	
   /* 	   MyClass myClass = new MyClass();
           int i = 0;
           String str = "abc";
           myClass.setI(i);
           myClass.setStr(str);
           str = "dcf";
           i++;
           System.out.println(i);
           System.out.println(str);
           myClass.outI();
           myClass.outStr();*/
    	
    	//f3();
    /*	MyClass myClass = new MyClass();
    	MyClass myClass2 = new MyClass();
    	myClass2.setI(2);
    	myClass.changeVlaue(myClass2);
    	System.out.println(myClass2.getI());*/
    	   
    }
public static void f3() {
	MyClass3 myClass1 = new MyClass3();
    MyClass3 myClass2 = new MyClass3();
    System.out.println(myClass1.i);
    System.out.println(myClass1.j);
    System.out.println(myClass2.i);
    System.out.println(myClass2.j);
}
}
class MyClass {
    void changeVlaue(  MyClass myClass){
    	myClass = new MyClass();
    }
    void changeValue( final StringBuffer buffer) {
        buffer.append("world");
    }
    private int i;
    private String str;
    public void setStr(final String i) {
        this.str = i;
    }
 
    public void outStr() {
        System.out.println(this.str);
    }
    
    public void setI(final int i) {
        this.i = i;
    }
    public int getI() {
       return i;
    }
    public void outI() {
        System.out.println(this.i);
    }
}
class MyClass3 {
	public final double i = Math.random();
	public static double j = Math.random();
}