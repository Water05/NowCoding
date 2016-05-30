package cn.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/**
 * （1）schedule方法：“fixed-delay”；如果第一次执行时间被delay了，随后的执行时间按 照 上一次 实际执行完成的时间点 进行计算
（2）scheduleAtFixedRate方法：“fixed-rate”；如果第一次执行时间被delay了，随后的执行时间按照 上一次开始的 时间点 进行计算，并且为了”catch up”会多次执行任务,TimerTask中的执行体需要考虑同步 
[c-sharp] view plaincopy
 * @author Administrator
 *
 */
public class ScheduleTest {
    public static void main(String[] args) throws ParseException {  
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  
        Date startDate = dateFormatter.parse("2010/11/28 01:06:00");  
        Timer timer = new Timer();  
        timer.schedule(new TimerTask(){  
        //timer.scheduleAtFixedRate(new TimerTask(){   
           public void run() {  
               try {  
                   Thread.sleep(6000);  
               } catch (InterruptedException e) {  
                   e.printStackTrace();  
               }  
               System.out.println("execute task!"+ this.scheduledExecutionTime());  
           }  
        },startDate, 7 * 1000);  
    } 
}
