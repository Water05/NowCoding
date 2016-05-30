package cn.proxy;

public class StaticProxy implements HelloWorld {

public HelloWorld helloworld;
 public StaticProxy(HelloWorld helloWorld) {
	this.helloworld=helloWorld;
}
	@Override
	public void prit() {
		System.out.println("Welcome");
		helloworld.prit();

	}

}
