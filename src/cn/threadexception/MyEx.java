package cn.threadexception;

import java.lang.Thread.UncaughtExceptionHandler;

public class MyEx implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println(t+"线程出现了异常："+e);  

	}

}
