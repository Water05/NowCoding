package cn.jobs;

public class ThreadTest extends Thread {
	private int i;
	public void run(){
		for(;i<10;i++){
			System.out.println(this.getName()+":"+i);
		}
	}
	public static void main(String[] args){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"         .."+i);
			if(i==4){
				System.out.println("________________________k");
			
			new ThreadTest().start();
			new ThreadTest().start();
			System.out.println("_______________________________kk");
			}
		}
	}

}
