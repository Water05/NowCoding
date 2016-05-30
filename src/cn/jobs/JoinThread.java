package cn.jobs;

/**
 * @author Administrator
 * 让一个线程等待另一个线程完成的方法join()
 *
 */
public class JoinThread  implements Runnable{
	public void run(){
		for(int i= 0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
public static void main(String[] args) throws Exception {
	//实例化一个Runnable 
	JoinThread jt=new JoinThread();
	//创建一个线程 
	new Thread(jt,"2:ss").start();
	for(int i=0;i<10;i++){
		if(i==3){
			Thread th=new Thread(jt,"1:SS");
			//启动第二个线程 
			th.start();
			//main的线程中调用了th线程的join方法  
			//让第二个线程执行完成后再执行main  
			th.join();
		}
		System.out.println(Thread.currentThread().getName()+":"+i);
	}
	
}
	

}
