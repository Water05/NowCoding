package cn;

public class CopyOfStringTest {
    public static void main(String args[]) {  
        
/*        String str = "abc";  
        StringBuffer sb = new StringBuffer("abc");  
        Runtime runtime = Runtime.getRuntime();  
        long start = System.currentTimeMillis();  
        long startFreememory = runtime.freeMemory();  
        for (int i = 0; i < 10000; i++) {  
            //str += i;  
            //测试StringBuffer时候把注释打开  
            sb.append(i);  
        }  
        long endFreememory = runtime.freeMemory();  
        long end = System.currentTimeMillis();  
        System.out.println("操作耗时:" + (end - start) + "ms," + "内存消耗:"  
                + (startFreememory - endFreememory)/1024 + "KB"); */ 
    	/*String str="GF1_PMS1_E120.9_N41.1_20130818_L1A0000071086.tar.gz";
    	String strteString=str.substring(0, str.lastIndexOf(".tar.gz"));
    	System.out.println(strteString);*/
    	String str=new String("jj");
    	System.out.println(str);
    	Short s=20;
    	float pi=2.13f;
    } 

}
