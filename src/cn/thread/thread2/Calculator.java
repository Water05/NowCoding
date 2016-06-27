package cn.thread.thread2;

public class Calculator extends Thread { 
    int total; 

    public void run() { 
            synchronized (this) { 
                    for (int i = 0; i < 101; i++) { 
                            total += i; 
                    } 
                    notifyAll(); 
                    System.out.println("ss");
            } 
            //通知所有在此对象上等待的线程 

         
    } 
}
