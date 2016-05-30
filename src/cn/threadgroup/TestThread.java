package cn.threadgroup;

public class TestThread implements Runnable{
	public void run(){
		for(int i=0;i<3;i++){  
			System.out.println(Thread.currentThread().getName()+"线程"+i+"属于"+Thread.currentThread().getThreadGroup().getName()+"线程组");  
			}
	}
	
}
