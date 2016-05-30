package cn.threadexception;

public class ExHandler {

	public static void main(String[] args) {
		/*MyThread myThread = new MyThread();
		Thread td = new Thread(myThread, "线程1");*/
		Thread td=new Thread();
		// 为指定的td线程实例设置异常处理器
		td.start();

		td.setUncaughtExceptionHandler(new MyEx());
		// 设置主线程的异常类
		Thread.currentThread().setUncaughtExceptionHandler(new MyEx());
		byte[] b = new byte[2];
		System.out.println(b[2]);
	}

}
