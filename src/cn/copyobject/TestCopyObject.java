package cn.copyobject;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
 
public class TestCopyObject {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		AverageValue averageValueOne=new AverageValue();
		AverageValue averageValueTwo=new AverageValue();
		AverageValue averageValueThr=new AverageValue();
		AverageValue averageValueFour=new AverageValue();
		averageValueOne.setCo(0.1);
		List<AverageValue> listAverageValues=new ArrayList<AverageValue>();
		listAverageValues.add(averageValueOne);
		averageValueThr=listAverageValues.get(0);
		averageValueTwo=averageValueThr;
		averageValueTwo.setCo(0.2);
		listAverageValues.add(averageValueTwo);
		averageValueFour=listAverageValues.get(1);
		System.out.println(averageValueFour.getCo());
		System.out.println(averageValueThr.getCo());
		System.out.println(averageValueOne.getCo());
		//AverageValue averageValueFive=new AverageValue();
		AverageValue averageValueFive=null;
		System.out.println(objectIsNull(averageValueFive));
		
		
		  String s = "sds	gdasda" + "\n" + "edaeafd";
		  System.out.println("转换前："+s);

		  s = s.replaceAll("\r|\n|\t", "");

		  System.out.println("转换后："+s);
	}
	/** 
	* @Description: 判断一个对象是否为空 
	* @param object
	* @return
	* @throws IllegalArgumentException
	* @throws IllegalAccessException   
	* @return boolean 
	*/
	public static boolean objectIsNull(Object object) throws IllegalArgumentException, IllegalAccessException {
        boolean flag = false;
        if(object!=null){
            int fieldsCount=0,nullFieldsCount=0;
            for (Field f : object.getClass().getDeclaredFields()) {
    		    f.setAccessible(true);
    		    fieldsCount++;
    		    System.out.println(f.getName()+"0");
    		    if (f.get(object) == null ||Double.parseDouble(f.get(object).toString())==0) { //判断字段是否为空，并且对象属性中的基本都会转为对象类型来判断
    		    	nullFieldsCount++;
    		    	System.out.println(f.getName()+"1");
    		    }
    		}
            if(fieldsCount == nullFieldsCount){
            	flag=true;
            }
        }

        return flag;
    }
}
