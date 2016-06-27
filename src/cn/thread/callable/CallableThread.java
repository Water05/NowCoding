package cn.thread.callable;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * 希望在任务完成时能够返回一个值，那么可以用Callable接口
 *
 */
public class CallableThread {
	public static void main(String[] args) throws InterruptedException {
		f1();
	}
	public static void f1() throws InterruptedException  {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i = 0; i < 10; i++) {
			results.add(exec.submit(new TaskWithResult(i)));
			Thread.sleep(1000);
			TimeUnit.MILLISECONDS.sleep(1000);
		}
		for(Future<String> fs : results) {
			try {
				System.out.println(fs.get());
			} catch(InterruptedException e){
				System.out.println(e);
				return;
			} catch (ExecutionException e) {
				// TODO: handle exception
				System.out.println(e);
			} finally {
				exec.shutdown();
			}
		}
	}

}

class TaskWithResult implements Callable<String> {

	private int id;
	 public TaskWithResult(int id) {
		// TODO Auto-generated constructor stub
            this.id = id;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "resutl of TaskWIthResult " + id;
	}
	
} 