package cn.piped;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
/**
 * 使用管道的步骤：
           1.new创建管道输入输出流
           2.使用管道输入或输出流的connect方法连接这两个输入输出流
           3.将两个管道流分别传入两个线程
           4.两个线程分别依赖各自的流来进行通信
 * @author Administrator
 *
 */
public class TestPiped {
	public static void main(String[] args) {
		PipedReader pr = null;  
		PipedWriter pw = null;  
		try {  
		pw = new PipedWriter();  
		pr = new PipedReader();  
		// 链接管道  
		pr.connect(pw); 
		new Thread(new ReaderThread(pr),"读取管道线程").start(); 
		new Thread(new WriterThread(pw),"写入管道线程").start(); 
		} catch (IOException e) {  
		e.printStackTrace();  
		}
	}

}
