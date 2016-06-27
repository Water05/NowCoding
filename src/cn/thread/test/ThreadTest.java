package cn.thread.test;

import org.apache.poi.hslf.record.SSSlideInfoAtom;
import org.apache.poi.hwpf.model.PropertyNode.StartComparator;

public class ThreadTest {
	public static void main(String[] args) {

	
	f2();
	
	
	
	
	}
	/** 
	 * 适合多个相同程序代码的线程去处理同一资源的情况
	 * 避免单继承特性带来的局限
	* @Description: TODO    
	* @return void 
	*/
	public static void f2() {
		/*new ThreadRunTest1().start();
		new ThreadRunTest1().start();
		new ThreadRunTest1().start();*/
	      ThreadTunTest2 runner = new ThreadTunTest2();
		new Thread(runner).start();
		new Thread(runner).start();
		new Thread(runner).start();
	}
	
	
	public static void f1() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("first Thread");
				}
				
				
			}
		}).start();
		
		
	Thread thread =	new Thread(){
		
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Second Thread");
			}
			
			
		}
	};
	thread.start();	
	
Thread thread2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("three Thread");
			}
			
			
		}
	}){
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("four Thread");
			}
			
			
		}
	};

	thread2.start();
	}
	
}



class ThreadRunTest1 extends Thread {
	private int ticket = 100;
	public void run() {
		while(true) {
			if(ticket > 0) {
				System.out.println(Thread.currentThread().getName() + "is saling ticket" + ticket--);
			} else {
				break;
			}
		}
	}
}

class ThreadTunTest2 implements Runnable {
    private int ticket = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(ticket > 0) {
				System.out.println("------" + Thread.currentThread().getName() + "is saling ticket" + ticket--);
			} else {
				break;
			}
		}
		
	}
	
}










