package cn.genericity.comparegenobj;

public class GenDemo2 {
	public static void main(String[] args) {
		Gen2 intOb = new Gen2(2);
		intOb.showType();
		//Type mismatch: cannot convert from Object to int
		int i = (int) intOb.getOb();
		System.out.println(i);
		Gen2 strOb = new Gen2("abc");
		strOb.showType();
		String str = (String) strOb.getOb();
		System.out.println(str);
	}

}
class Gen2 {
	private Object ob;
	public Gen2(Object ob) {
		this.ob = ob;
	} 
	public Object getOb() {
		return ob;
	}
	public void setOb(Object ob) {
		this.ob = ob;
	}
	public void showType(){
		System.out.println("T的实际类型是：" + ob.getClass().getName());
	}
}
