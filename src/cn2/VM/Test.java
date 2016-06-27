package cn2.VM;

public class Test {
	public static void main(String[] args) {

	}

	public void say(Human hum) {
		System.out.println("I am human");
	}

	/** 
	 * 验证java多态中的overload重载机制，
	* @Description: TODO    
	* @return void 
	*/
	public static void f1() {
		Human man = new Man();
		Human woman = new Woman();
		Test sp = new Test();
		sp.say(man);
		sp.say(woman);
	}

	public void say(Man hum) {
		System.out.println("I am man");
	}

	public void say(Woman hum) {
		System.out.println("I am woman");
	}

}

class Human {

}

class Man extends Human {

}

class Woman extends Human {

}
