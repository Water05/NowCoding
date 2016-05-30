package cn.meituan;

import java.util.ArrayList;

public class MeiTuan {
	static int count = 0;

/*	static int fun(int stairs, int max, int[] stragy) {
		if (stairs < 0)
			return 0;
		if (stairs == 0)
			return 1;
		int count = 0;
		for (int i : stragy) {
			if (i <= max) {
				count += fun(stairs - i, i, stragy);
			}
		}
		return count;
	}*/

	static ArrayList<Integer> result = new ArrayList<Integer>();

	static int findIndex(int[] stragy, int num) {
		for (int index = 0; index <= stragy.length - 1; index++) {
			if (stragy[index] == num) {
				return index;
			}
		}
		return -1;
	}

	static int fun2(int stairs, int[] stragy) {
		int sum = 0;
		int currentIndex = stragy.length - 1;
		int count = 0;
		do {
			while (sum < stairs) {
				result.add(stragy[currentIndex]);
				sum += stragy[currentIndex];
			}
			if (sum == stairs) {
				count++;
			}
			int num = result.remove(result.size() - 1);
			sum -= num;
			if (result.size() != 0) {
				if (num == stragy[0]) {
					while (result.size() != 0 && num == stragy[0]) {
						num = result.remove(result.size() - 1);
						sum -= num;
						currentIndex = findIndex(stragy, num) - 1;
					}
				} else {
					currentIndex = findIndex(stragy, num) - 1;
				}
			} else {
				currentIndex--;
			}
		} while (result.size() != 0 || currentIndex >= 0);
		return count;
	}

	public static void main(String[] args) {
		int[] stragy = new int[] { 1, 2, 5, 10, 20, 100 };
		System.out.println(fun2(5, stragy));
	}
	/*
	 * public static void main(String[] args) { int []arr={1,7,8,10,12,13}; int
	 * rst=proArray(arr,6,21); System.out.println(rst); } public static int
	 * proArray(int[] arr,int length,int inNum){ int rst=0; for(int
	 * i=length-1;i>=0;i--){ if(arr[i]*2<=inNum){ int rst1=arr[i]*2; for(int
	 * j=length-1;i>0 && j>i;j--){ if(arr[i-1]+arr[j]<=inNum){
	 * rst=arr[i-1]+arr[j]; break; }
	 * 
	 * } if(rst1>rst){ rst=rst1; } break; }else{ for(int j=length-1;i>0 &&
	 * j>i;j--){ if(arr[i-1]+arr[j]<=inNum){ rst=arr[i-1]+arr[j]; break; }
	 * 
	 * } if(rst!=0){ break; }
	 * 
	 * } } return rst; }
	 */

}
