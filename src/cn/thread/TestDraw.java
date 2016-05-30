package cn.thread;

public class TestDraw {
	public static void main(String[] args) throws InterruptedException {
/*		Account acct=new Account("123456","小明",1000);
		DrawThread dt=new DrawThread(acct,600);
		Thread th1=new Thread(dt,"线程1");
		Thread th2=new Thread(dt,"线程2");
		Thread th3=new Thread(dt,"线程3");
		Thread th4=new Thread(dt,"线程4");
		th4.join();
		th1.start();
		th3.start();
		th2.start();
		th4.start();*/
		
		
		//创建一个用户没余额，等待先存款后取钱  
		Account acct=new Account("123张",0);  
		//取款800  
		new Thread(new DrawThread(acct,800),"取款者A").start();  
		//存款2个人  
		new Thread(new DepositThread(acct,800),"存款者甲").start();  
		new Thread(new DepositThread(acct,800),"存款者乙").start();  
		//new Thread(new DepositThread(acct,800),"存款者丙").start(); 
		
		/**
		 * 用户被阻塞无法继续向下执行下去，取钱线程和存钱线程数量不同，堵塞在等待进程。
		 */
		
	}

}
