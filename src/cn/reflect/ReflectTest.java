package cn.reflect;

public class ReflectTest {
	public static void main(String[] args) throws Throwable {
		//Class c1 = Class.forName("MonitorAqiPripollution");
		//Object o = c1.newInstance(); // 调用了Employee的无参数构造方法.
		
		
		
		
     /*   Class c = Class.forName("com.neunn.monitorAqiPripollution.bean.MonitorAqiPripollution");  
        //获取所有的属性?  
      //java.lang.reflect.Field[] fs = c.getDeclaredFields();  
        java.lang.reflect.Field idf =c.getDeclaredField("pm25");
        idf.setAccessible(true);
        Object o=c.getInterfaces();
        idf.set(o, "ddd"); 
        System.out.println(idf.get(o));  */
 
  /*           //定义可变长的字符串，用来存储属性  
      StringBuffer sb = new StringBuffer();  
      //通过追加的方法，将每个属性拼接到此字符串中  
      //最外边的public定义  
      sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() +"{\n");  
      //里边的每一个属性  
      for(java.lang.reflect.Field field:fs){  
          sb.append("\t");//空格  
          sb.append(Modifier.toString(((Member) field).getModifiers())+" ");//获得属性的修饰符，例如public，static等等  
          sb.append(((java.lang.reflect.Field) field).getType().getSimpleName() + " ");//属性的类型的名字  
          sb.append(field.getName()+";\n");//属性的名字+回车  
      }  

      sb.append("}");  

      System.out.println(sb);*/
		
		
		
	    /* 
	    User u = new User(); 
	    u.age = 12; //set 
	    System.out.println(u.age); //get 
	    */  
	              
	    //获取类  
	    Class c = Class.forName("com.neunn.monitorAqiPripollution.bean.MonitorAqiPripollution");  
	    //获取id属性  
	    java.lang.reflect.Field idF = c.getDeclaredField("pm25");  
	    //实例化这个类赋给o  
	    Object o = c.newInstance();  
	    //打破封装  
	    idF.setAccessible(true); //使用反射机制可以打破封装性，导致了java对象的属性不安全。  
	    //给o对象的id属性赋值"110"  
	    idF.set(o, "110"); //set  
	    //get  
	    System.out.println(idF.get(o));  
	    
	    Class<MonitorAqiPripollution> c2 = MonitorAqiPripollution.class;
	    
	    MonitorAqiPripollution className=new MonitorAqiPripollution();
	    className.setPm10("PM10");
	    functions2(className);
	    Class<?> c3=className.getClass();
		java.lang.reflect.Field f2 =c3.getDeclaredField("pm10");
		f2.setAccessible(true);
		String pm10=(String)f2.get(className);
		System.out.println(pm10);
	    
		
			
		
	}
	public void functions(Object className) throws Exception, SecurityException{
		Class<?> c=className.getClass();
		java.lang.reflect.Field f1=c.getField("pm10");
		java.lang.reflect.Field f2 =c.getDeclaredField("pm10");
		f2.setAccessible(true);
		String pm10=(String)f2.get(className);
		
		//Class<?> mo=new Class<MonitorAqiPripollution>(); 
		//functions2(mo);
	}
public static void  functions2(Object className) throws Throwable, SecurityException{
		   
    Class<?> c3=className.getClass();
	java.lang.reflect.Field f2 =c3.getDeclaredField("pm10");
	f2.setAccessible(true);
	String pm10=(String)f2.get(className);
	System.out.println(pm10);
	}
}
