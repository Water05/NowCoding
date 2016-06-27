package cn2;

public class FaceTest {
	public static int[] array = { 1,2,2,2,2,3,3,3,3, 3, 4, 5, 6 };

	public static void main(String[] args) {
		f3();
	}
	public static void f3() {
		new FaceTest().f2(6, 0);
	}
	/** 
	 * 有这样一个数组A，大小为n，相邻元素差的绝对值都是1，
	 * 如A={4,5,6,5,6,7,8,9,10,9}，现在给定数组A和目标整数t，请找到t在A中的位置。
	* @Description: TODO 
	* @param t
	* @param i
	* @return   
	* @return int 
	*/
	public int  f2(int t ,int i) {
		int a = t - array[i];
		if(a == 0){
			System.out.println(i);
			return i;
		} else {
			int b = t -array[i+a];
			int c = i + a + b;
			return f2(t, c);
			//
		}
		
	}
	
	/** 
	 * 求一个集合中所有的子集
	* @Description: TODO    
	* @return void 
	*/
	public static void f1() {
		new FaceTest().run();
	}
	public void run() {

		int endNum = array.length;
		int start = 0;
		for (int i = 0; i < endNum; i++) {
			String str = "{ ";
			start = i;
			str = str + array[i] + ",";
			printStr(str);
			goOn(++start, endNum, str);
		}

	}

	public void goOn(int start, int end, String str) {
		// System.out.println(start + " " +end + " " + "----------");
		int start2 = start;
		for (int i = start; i < end; i++) {
			// System.out.println(" --------" + i);
			String tmp =str;
			//tmp = tmp + array[i] + ",";
			tmp = tmp + array[i] + ",";
			printStr(tmp);
			start2 = i;
			goOn(++start2, end, tmp);
		}

	}

	public void printStr(String str) {
		str = str.substring(0, str.length() - 1) + " }";
		System.out.println(str);
	}
}
