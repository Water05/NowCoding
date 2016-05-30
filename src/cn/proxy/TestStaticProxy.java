package cn.proxy;

/** 
* @ClassName: TestStaticProxy 
* @Description: 静态代理测试 
* @author zhangzq@neunn.com 
* @date 2015年11月12日 下午5:38:18 
*  
*/
public class TestStaticProxy {
	public static void main(String[] args) {
		HelloWorld helloWorld=new HelloworldImpl();
		StaticProxy staticProxy=new StaticProxy(helloWorld);
		staticProxy.prit();
	}

}
