package cn.thread;

import java.util.concurrent.locks.ReentrantLock;

public class DrawThread implements Runnable {
	private Account account;
	private double drawAmount;

	public DrawThread(Account account, double drawAmount) {
		super();
		this.account = account;
		this.drawAmount = drawAmount;
	}

/*	public void run() {
		synchronized (account) {
			if (account.getBalance() >= drawAmount) {
				System.out.println(Thread.currentThread().getName()
						+ account.getAccountName() + "取款成功：吐出钞票：" + drawAmount);
				account.setBalance(account.getBalance() - drawAmount);
				System.out.println("当前余额为：" + account.getBalance());
			} else {
				System.out.println("账户金额不够，您的余额只有" + account.getBalance());
			}

		}
	}*/
/*	private final ReentrantLock relock=new ReentrantLock();
	public void run(){
		draw();
	}
	
	public void draw(){
		relock.lock();
		try{  
			//账户余额大于取款金额时  
			if(account.getBalance()>=drawAmount){  
			//取款成功  
			System.out.println(Thread.currentThread().getName()+account.getAccountName()+"取款成功：吐出钞票："+drawAmount);  
			//修改余额  
			account.setBalance(account.getBalance()-drawAmount);  
			System.out.println("当前余额为："+account.getBalance());  
			}  
			//账户金额不够时  
			else{  
			System.out.println("账户金额不够，您的余额只有"+account.getBalance());  
			}  
			}  
			//释放锁  
			finally{  
			relock.unlock();  
			}
	}*/
	
	
/*	public synchronized void draw(){
		if(account.getBalance()>=drawAmount){  
			//取款成功  
			System.out.println(Thread.currentThread().getName()+account.getAccountName()+"取款成功：吐出钞票："+drawAmount);  
			//修改余额  
			account.setBalance(account.getBalance()-drawAmount);  
			System.out.println("当前余额为："+account.getBalance());  
			}  
			//账户金额不够时  
			else{  
			System.out.println("账户金额不够，您的余额只有"+account.getBalance());  
			}
		
	}*/
	@Override  
	public void run() {  
	//重复10次取钱操作  
	for(int i=0;i<10;i++){  
	account.draw(drawAmount,i+1);  
	}  
	}
	
	

}
