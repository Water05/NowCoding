package cn.piped;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PipedReader;

public class ReaderThread implements Runnable {
	private PipedReader pr;
	private BufferedReader br;

	public ReaderThread() {
		super();
	}

	public ReaderThread(PipedReader pr) {
		super();
		this.pr = pr;
		this.br = new BufferedReader(pr);
	}

	public void run() {
		String buffer = null;
		System.out.println(Thread.currentThread().getName());
		try {
			System.out.println("------打印管道中的数据-------");
			while ((buffer = br.readLine()) != null) {
				System.out.println("dayin    "+buffer);
			}
			System.out.println("------打印完成");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
