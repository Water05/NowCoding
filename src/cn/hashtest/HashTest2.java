package cn.hashtest;

import java.util.HashSet;
import java.util.Set;

public class HashTest2 {
	 private int i;  
	  
	    public int getI() {  
	        return i;  
	    }  
	  
	    public void setI(int i) {  
	        this.i = i;  
	    }  
	  
	  public boolean equals(Object object) {  
	        if (object == null) {  
	            return false;  
	        }  
	        if (object == this) {  
	            return true;  
	        }  
	        if (!(object instanceof HashTest2)) {  
	            return false;  
	        }  
	        HashTest2 other = (HashTest2) object;  
	        if (other.getI() == this.getI()) {  
	            return true;  
	        }  
	        return false;  
	    } 
	  
	    public int hashCode() {  
	        return i % 10;  
	    }  
	  
	    public final static void main(String[] args) {  
	        HashTest2 a = new HashTest2();  
	        HashTest2 b = new HashTest2();  
	        a.setI(1);  
	        b.setI(1);  
	        Set<HashTest2> set = new HashSet<HashTest2>();  
	        set.add(a);  
	        set.add(b);  
	        System.out.println(a.hashCode() == b.hashCode());  
	        System.out.println(a.equals(b));  
	        System.out.println(set);  
	    }  

}
