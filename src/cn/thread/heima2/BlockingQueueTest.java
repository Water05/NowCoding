package cn.thread.heima2;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
	public static void main(String[] args) {
		final BlockingQueue queue = new ArrayBlockingQueue(3);
		for(int i=0;i<2;i++){
			new Thread(){
				public void run(){
					while(true){
						try {
							Thread.sleep((long)(Math.random()*1000));
							System.out.println(Thread.currentThread().getName() + "准锟斤拷锟斤拷锟斤拷锟�");							
							queue.put(1);
							System.out.println(Thread.currentThread().getName() + "" + 							
										"锟斤拷锟斤拷目前锟斤拷" + queue.size() );
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}
				}
				
			}.start();
		}
		
		new Thread(){
			public void run(){
				while(true){
					try {
						//锟斤拷锟剿达拷锟斤拷睡锟斤拷时锟斤拷直锟斤拷为100锟斤拷1000锟斤拷锟桔诧拷锟斤拷锟叫斤拷锟�
						Thread.sleep(1000);
						System.out.println(Thread.currentThread().getName() + "准锟斤拷取锟斤拷锟�");
						queue.take();
						System.out.println(Thread.currentThread().getName()  + 							
								"锟斤拷锟斤拷目前锟斤拷" + queue.size() );					
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}.start();			
	}
}
