package cn.iPlus;

public class Plus {
    
      public static void main(String[] args) {
    	  int i=0;
    	  int j=(i++)+(i++);
		System.out.println(j+"  "+i);
		i=0;
		j=(++i)+(++i);
		System.out.println(j+"  "+i);
	}
}
