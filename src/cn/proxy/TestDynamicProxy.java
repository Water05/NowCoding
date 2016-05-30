package cn.proxy;

import cn.jobs.DaemonThread;

public class TestDynamicProxy {
public static void main(String[] args) {
	HelloWorld helloWorld=new HelloworldImpl();
	DynamicProxy dProxy =new DynamicProxy();
	HelloWorld helloWorld2=(HelloWorld)dProxy.bindRelation(helloWorld);
	helloWorld2.prit();
}
}
