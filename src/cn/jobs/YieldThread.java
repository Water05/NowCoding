package cn.jobs;

public class YieldThread implements Runnable {
/**
 * 
总结：sleep和yield区别
A.sleep方法暂停当前线程后，会给其他线程执行机会，不会理会其他线程的优先级。而yield只会给优先级>=当前优先级的线程执行机会
B.Sleep方法会将线程转入阻塞状态，知道经过阻塞时间才会转入就绪状态。而yield是不会将线程转入阻塞状态的，它只是强制当前线程进入就绪状态。
C.Sleep会抛出InterruptedException异常。而yield没有声明任何异常
D.Sleep方法比yield方法有更好的移植性。
E.通常不依靠yield来控制并发线程控制
 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			if (i == 20) {
				Thread.yield();
			}
		}

	}

	public static void main(String[] args) {
		YieldThread yieldThread=new YieldThread();
		// 启动第一条子线程
		Thread td1 = new Thread(yieldThread, "线程1");
		// 最高级
		// td1.setPriority(Thread.MAX_PRIORITY);
		// 启动第二条子线程
		Thread td2 = new Thread(yieldThread, "线程2");
		// 最低级
		td2.setPriority(Thread.MIN_PRIORITY);
		td1.start();
		td2.start();
		System.out.println(Thread.currentThread().getName());
	}
}
