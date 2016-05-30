package cn.jobs;

public class SecondThread implements Runnable {
	private int i;
	public void run(){
		for(;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String []args){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"          .."+i);
			if(i==4){
				SecondThread st=new SecondThread();
				new Thread(st,"线程1").start();
				new Thread(st,"线程2").start();
			}
		}
	}

}
