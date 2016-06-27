package cn.collection.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest02 {
	 public static void main(String[] args) {
	        TreeSet ts = new TreeSet(new Teacher2.TeacherCompare());
	        ts.add(new Teacher2("zhangsan", 2));
	        ts.add(new Teacher2("lisi", 1));
	        ts.add(new Teacher2("wangmazi", 3));
	        ts.add(new Teacher2("mazi", 3));
	        Iterator it = ts.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }

}
class Teacher2 { 
    int num;
    String name;

    Teacher2(String name, int num) {
        this.num = num;
        this.name = name;
    }

    public String toString() {
        return "学号：" + num + "    姓名：" + name;
    }

    static class TeacherCompare implements Comparator {// 老师自带的一个比较器

        public int compare(Object o1, Object o2) {
            Teacher2 s1 = (Teacher2) o1;// 转型
            Teacher2 s2 = (Teacher2) o2;// 转型
            int result = s1.num > s2.num ? 1 : (s1.num == s2.num ? 0 : -1);
            if (result == 0) {
                result = s1.name.compareTo(s2.name);
            }
            return result;
        }

    }

}