package cn.genericity;

import org.apache.poi.hdf.extractor.NewOleFile;

public class GenericsFoo {
	public static void main(String[] args) {
		GenericsFooDemo<Integer> intGenerics = new GenericsFooDemo<Integer>(2);
		GenericsFooDemo inttest = new GenericsFooDemo("aa");
		GenericsFooDemo<String> strGenerics = new GenericsFooDemo<String>("aa");
		GenericsFooDemo<Object> objGenerics = new GenericsFooDemo<Object>(new Object()); 
		System.out.println(intGenerics.getT());
        System.out.println(strGenerics.getT());
        System.out.println(objGenerics.getT());
        System.out.println(inttest.getT().getClass().getName());
	}

}
class GenericsFooDemo<T> {
	private T t;
	public GenericsFooDemo(T t) {
		this.t = t;
	} 
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
		
	}
}
