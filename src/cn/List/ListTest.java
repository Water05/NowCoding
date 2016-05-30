package cn.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		f1();
	}
	public static void f1() {
		List<String> test = new LinkedList<String>();
		test.add("0");
		test.add("1");
		test.add("2");
		test.add("3");
		test.add("4");
		test.add("5");
		/*for (int i = 0; i < 3; i++) {
			test.remove(test.size() - 1);
		}*/
		for(int i = test.size(); i > 3; i--) {
			System.out.println(test.get(i-1));
			test.remove(i-1);
		}
		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}

	}

}
