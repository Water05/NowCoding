package cn.genericity;

public class objectconvert {
    public static void main(String[] args) {
    	//生成strFoo对象时，传入的参数为StringFoo对象，虽然原始的为Object，但在程序运行时，
    	//又转回原来的格式
    	 ObjectFoo strFoo = new ObjectFoo(new StringFoo("Hello Generics!"));
         ObjectFoo douFoo = new ObjectFoo(new DoubleFoo(new Double("33")));
         ObjectFoo objFoo = new ObjectFoo(new Object());
        System.out.println("strFoo.getX=" +  strFoo.getX());//cn.genericity.StringFoo@77ec3adc
         System.out.println("douFoo.getX=" +  douFoo.getX());//cn.genericity.DoubleFoo@360c7f06
         System.out.println("objFoo.getX=" + objFoo.getX());//java.lang.Object@6e677ea2
	}
}
 class StringFoo {
    private String x;
 
    public StringFoo(String x) {
        this.x = x;
    }
 
    public String getX() {
        return x;
    }
 
    public void setX(String x) {
        this.x = x;
    }
}
 
 class DoubleFoo {
    private Double x;
 
    public DoubleFoo(Double x) {
        this.x = x;
    }
 
    public Double getX() {
        return x;
    }
 
    public void setX(Double x) {
        this.x = x;
    }
}
 class ObjectFoo {
	    private Object x;
	 
	    public ObjectFoo(Object x) {
	        this.x = x;
	    }
	 
	    public Object getX() {
	        return x;
	    }
	 
	    public void setX(Object x) {
	        this.x = x;
	    }
	}
